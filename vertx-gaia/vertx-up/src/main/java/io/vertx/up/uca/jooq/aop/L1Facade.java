package io.vertx.up.uca.jooq.aop;

import io.vertx.core.Future;
import io.vertx.tp.plugin.cache.Harp;
import io.vertx.tp.plugin.cache.hit.CacheId;
import io.vertx.tp.plugin.cache.hit.CacheKey;
import io.vertx.tp.plugin.cache.hit.CacheMeta;
import io.vertx.tp.plugin.cache.l1.L1Cache;
import io.vertx.tp.plugin.cache.util.CacheFn;
import io.vertx.up.eon.em.ChangeFlag;
import io.vertx.up.fn.Fn;
import io.vertx.up.fn.RunSupplier;
import io.vertx.up.uca.jooq.JqAnalyzer;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.function.Supplier;

/**
 * @author <a href="http://www.origin-x.cn">lang</a>
 */
class L1Facade {

    private static final ConcurrentMap<Class<?>, CacheMeta> META_POOL = new ConcurrentHashMap<>();
    private final transient JqAnalyzer analyzer;

    private final transient L1Cache cacheL1;

    private L1Facade(final JqAnalyzer analyzer) {
        /*
         * Dao / Analyzer
         */
        this.analyzer = analyzer;
        /*
         * Vertx Processing
         */
        this.cacheL1 = Harp.cacheL1();
    }

    public static L1Facade create(final JqAnalyzer analyzer) {
        return new L1Facade(analyzer);
    }

    private CacheMeta meta() {
        final Class<?> clazz = this.analyzer.type();
        return Fn.pool(META_POOL, clazz, () -> new CacheMeta(clazz).primaryKey(this.analyzer.primaryKey()));
    }

    /*
     * Fetch data by id
     * Here processed following:
     *
     * 1) Data Part: DATA:<MODEL>:<KEY>
     * 2）Key Part: KEY:<MODEL>:<KEY>,  Here the operation is append
     */
    public <T, K> T findById(final K id, final RunSupplier<T> executor) {
        final CacheKey key = new CacheId(id);
        final RunSupplier<T> supplier = () -> this.cacheL1.read(key, this.meta());
        return CacheFn.in(supplier, executor, this::writeCache);
    }

    public <T, K> Future<T> findByIdAsync(final K id, final RunSupplier<Future<T>> executor) {
        final CacheKey key = new CacheId(id);
        final Supplier<Future<T>> supplier = () -> this.cacheL1.readAsync(key, this.meta());
        return CacheFn.in(supplier, executor, this::writeCache);
    }

    /*
     * Private method for write
     */
    private <T> void writeCache(final T entity) {
        this.cacheL1.write(entity, ChangeFlag.UPDATE, this.meta());
    }

    private <T> void deleteCache(final T entity) {
        this.cacheL1.write(entity, ChangeFlag.DELETE, this.meta());
    }
}