/*
 * This file is generated by jOOQ.
*/
package cn.vertxup.atom.domain.tables.daos;


import cn.vertxup.atom.domain.tables.MAcc;
import cn.vertxup.atom.domain.tables.records.MAccRecord;

import io.github.jklingsporn.vertx.jooq.future.VertxDAO;

import java.time.LocalDateTime;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Configuration;
import org.jooq.impl.DAOImpl;


import java.util.concurrent.CompletableFuture;
import io.github.jklingsporn.vertx.jooq.future.util.FutureTool;
/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.8"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class MAccDao extends DAOImpl<MAccRecord, cn.vertxup.atom.domain.tables.pojos.MAcc, String> implements VertxDAO<cn.vertxup.atom.domain.tables.records.MAccRecord,cn.vertxup.atom.domain.tables.pojos.MAcc,java.lang.String> {

    /**
     * Create a new MAccDao without any configuration
     */
    public MAccDao() {
        super(MAcc.M_ACC, cn.vertxup.atom.domain.tables.pojos.MAcc.class);
    }

    /**
     * Create a new MAccDao with an attached configuration
     */
    public MAccDao(Configuration configuration) {
        super(MAcc.M_ACC, cn.vertxup.atom.domain.tables.pojos.MAcc.class, configuration);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected String getId(cn.vertxup.atom.domain.tables.pojos.MAcc object) {
        return object.getKey();
    }

    /**
     * Fetch records that have <code>KEY IN (values)</code>
     */
    public List<cn.vertxup.atom.domain.tables.pojos.MAcc> fetchByKey(String... values) {
        return fetch(MAcc.M_ACC.KEY, values);
    }

    /**
     * Fetch a unique record that has <code>KEY = value</code>
     */
    public cn.vertxup.atom.domain.tables.pojos.MAcc fetchOneByKey(String value) {
        return fetchOne(MAcc.M_ACC.KEY, value);
    }

    /**
     * Fetch records that have <code>MODEL_ID IN (values)</code>
     */
    public List<cn.vertxup.atom.domain.tables.pojos.MAcc> fetchByModelId(String... values) {
        return fetch(MAcc.M_ACC.MODEL_ID, values);
    }

    /**
     * Fetch records that have <code>MODEL_KEY IN (values)</code>
     */
    public List<cn.vertxup.atom.domain.tables.pojos.MAcc> fetchByModelKey(String... values) {
        return fetch(MAcc.M_ACC.MODEL_KEY, values);
    }

    /**
     * Fetch records that have <code>RECORD_JSON IN (values)</code>
     */
    public List<cn.vertxup.atom.domain.tables.pojos.MAcc> fetchByRecordJson(String... values) {
        return fetch(MAcc.M_ACC.RECORD_JSON, values);
    }

    /**
     * Fetch records that have <code>RECORD_RAW IN (values)</code>
     */
    public List<cn.vertxup.atom.domain.tables.pojos.MAcc> fetchByRecordRaw(String... values) {
        return fetch(MAcc.M_ACC.RECORD_RAW, values);
    }

    /**
     * Fetch records that have <code>RECORD_UNIQUE IN (values)</code>
     */
    public List<cn.vertxup.atom.domain.tables.pojos.MAcc> fetchByRecordUnique(String... values) {
        return fetch(MAcc.M_ACC.RECORD_UNIQUE, values);
    }

    /**
     * Fetch records that have <code>SIGMA IN (values)</code>
     */
    public List<cn.vertxup.atom.domain.tables.pojos.MAcc> fetchBySigma(String... values) {
        return fetch(MAcc.M_ACC.SIGMA, values);
    }

    /**
     * Fetch records that have <code>LANGUAGE IN (values)</code>
     */
    public List<cn.vertxup.atom.domain.tables.pojos.MAcc> fetchByLanguage(String... values) {
        return fetch(MAcc.M_ACC.LANGUAGE, values);
    }

    /**
     * Fetch records that have <code>ACTIVE IN (values)</code>
     */
    public List<cn.vertxup.atom.domain.tables.pojos.MAcc> fetchByActive(Boolean... values) {
        return fetch(MAcc.M_ACC.ACTIVE, values);
    }

    /**
     * Fetch records that have <code>METADATA IN (values)</code>
     */
    public List<cn.vertxup.atom.domain.tables.pojos.MAcc> fetchByMetadata(String... values) {
        return fetch(MAcc.M_ACC.METADATA, values);
    }

    /**
     * Fetch records that have <code>CREATED_AT IN (values)</code>
     */
    public List<cn.vertxup.atom.domain.tables.pojos.MAcc> fetchByCreatedAt(LocalDateTime... values) {
        return fetch(MAcc.M_ACC.CREATED_AT, values);
    }

    /**
     * Fetch records that have <code>CREATED_BY IN (values)</code>
     */
    public List<cn.vertxup.atom.domain.tables.pojos.MAcc> fetchByCreatedBy(String... values) {
        return fetch(MAcc.M_ACC.CREATED_BY, values);
    }

    /**
     * Fetch records that have <code>UPDATED_AT IN (values)</code>
     */
    public List<cn.vertxup.atom.domain.tables.pojos.MAcc> fetchByUpdatedAt(LocalDateTime... values) {
        return fetch(MAcc.M_ACC.UPDATED_AT, values);
    }

    /**
     * Fetch records that have <code>UPDATED_BY IN (values)</code>
     */
    public List<cn.vertxup.atom.domain.tables.pojos.MAcc> fetchByUpdatedBy(String... values) {
        return fetch(MAcc.M_ACC.UPDATED_BY, values);
    }

    /**
     * Fetch records that have <code>KEY IN (values)</code> asynchronously
     */
    public CompletableFuture<List<cn.vertxup.atom.domain.tables.pojos.MAcc>> fetchByKeyAsync(List<String> values) {
        return fetchAsync(MAcc.M_ACC.KEY,values);
    }

    /**
     * Fetch a unique record that has <code>KEY = value</code> asynchronously
     */
    public CompletableFuture<cn.vertxup.atom.domain.tables.pojos.MAcc> fetchOneByKeyAsync(String value) {
        return FutureTool.executeBlocking(h->h.complete(fetchOneByKey(value)),vertx());
    }

    /**
     * Fetch records that have <code>MODEL_ID IN (values)</code> asynchronously
     */
    public CompletableFuture<List<cn.vertxup.atom.domain.tables.pojos.MAcc>> fetchByModelIdAsync(List<String> values) {
        return fetchAsync(MAcc.M_ACC.MODEL_ID,values);
    }

    /**
     * Fetch records that have <code>MODEL_KEY IN (values)</code> asynchronously
     */
    public CompletableFuture<List<cn.vertxup.atom.domain.tables.pojos.MAcc>> fetchByModelKeyAsync(List<String> values) {
        return fetchAsync(MAcc.M_ACC.MODEL_KEY,values);
    }

    /**
     * Fetch records that have <code>RECORD_JSON IN (values)</code> asynchronously
     */
    public CompletableFuture<List<cn.vertxup.atom.domain.tables.pojos.MAcc>> fetchByRecordJsonAsync(List<String> values) {
        return fetchAsync(MAcc.M_ACC.RECORD_JSON,values);
    }

    /**
     * Fetch records that have <code>RECORD_RAW IN (values)</code> asynchronously
     */
    public CompletableFuture<List<cn.vertxup.atom.domain.tables.pojos.MAcc>> fetchByRecordRawAsync(List<String> values) {
        return fetchAsync(MAcc.M_ACC.RECORD_RAW,values);
    }

    /**
     * Fetch records that have <code>RECORD_UNIQUE IN (values)</code> asynchronously
     */
    public CompletableFuture<List<cn.vertxup.atom.domain.tables.pojos.MAcc>> fetchByRecordUniqueAsync(List<String> values) {
        return fetchAsync(MAcc.M_ACC.RECORD_UNIQUE,values);
    }

    /**
     * Fetch records that have <code>SIGMA IN (values)</code> asynchronously
     */
    public CompletableFuture<List<cn.vertxup.atom.domain.tables.pojos.MAcc>> fetchBySigmaAsync(List<String> values) {
        return fetchAsync(MAcc.M_ACC.SIGMA,values);
    }

    /**
     * Fetch records that have <code>LANGUAGE IN (values)</code> asynchronously
     */
    public CompletableFuture<List<cn.vertxup.atom.domain.tables.pojos.MAcc>> fetchByLanguageAsync(List<String> values) {
        return fetchAsync(MAcc.M_ACC.LANGUAGE,values);
    }

    /**
     * Fetch records that have <code>ACTIVE IN (values)</code> asynchronously
     */
    public CompletableFuture<List<cn.vertxup.atom.domain.tables.pojos.MAcc>> fetchByActiveAsync(List<Boolean> values) {
        return fetchAsync(MAcc.M_ACC.ACTIVE,values);
    }

    /**
     * Fetch records that have <code>METADATA IN (values)</code> asynchronously
     */
    public CompletableFuture<List<cn.vertxup.atom.domain.tables.pojos.MAcc>> fetchByMetadataAsync(List<String> values) {
        return fetchAsync(MAcc.M_ACC.METADATA,values);
    }

    /**
     * Fetch records that have <code>CREATED_AT IN (values)</code> asynchronously
     */
    public CompletableFuture<List<cn.vertxup.atom.domain.tables.pojos.MAcc>> fetchByCreatedAtAsync(List<LocalDateTime> values) {
        return fetchAsync(MAcc.M_ACC.CREATED_AT,values);
    }

    /**
     * Fetch records that have <code>CREATED_BY IN (values)</code> asynchronously
     */
    public CompletableFuture<List<cn.vertxup.atom.domain.tables.pojos.MAcc>> fetchByCreatedByAsync(List<String> values) {
        return fetchAsync(MAcc.M_ACC.CREATED_BY,values);
    }

    /**
     * Fetch records that have <code>UPDATED_AT IN (values)</code> asynchronously
     */
    public CompletableFuture<List<cn.vertxup.atom.domain.tables.pojos.MAcc>> fetchByUpdatedAtAsync(List<LocalDateTime> values) {
        return fetchAsync(MAcc.M_ACC.UPDATED_AT,values);
    }

    /**
     * Fetch records that have <code>UPDATED_BY IN (values)</code> asynchronously
     */
    public CompletableFuture<List<cn.vertxup.atom.domain.tables.pojos.MAcc>> fetchByUpdatedByAsync(List<String> values) {
        return fetchAsync(MAcc.M_ACC.UPDATED_BY,values);
    }

    private io.vertx.core.Vertx vertx;

    @Override
    public void setVertx(io.vertx.core.Vertx vertx) {
        this.vertx = vertx;
    }

    @Override
    public io.vertx.core.Vertx vertx() {
        return this.vertx;
    }

}
