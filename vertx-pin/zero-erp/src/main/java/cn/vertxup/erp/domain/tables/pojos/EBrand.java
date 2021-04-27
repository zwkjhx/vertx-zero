/*
 * This file is generated by jOOQ.
*/
package cn.vertxup.erp.domain.tables.pojos;


import cn.vertxup.erp.domain.tables.interfaces.IEBrand;

import java.time.LocalDateTime;

import javax.annotation.Generated;


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
public class EBrand implements IEBrand {

    private static final long serialVersionUID = -146307217;

    private String        key;
    private String        code;
    private String        name;
    private String        alias;
    private String        companyName;
    private String        categoryCode;
    private String        categoryName;
    private Integer       area;
    private String        areaName;
    private String        areaCategory;
    private String        metadata;
    private Boolean       active;
    private String        sigma;
    private String        language;
    private LocalDateTime createdAt;
    private String        createdBy;
    private LocalDateTime updatedAt;
    private String        updatedBy;

    public EBrand() {}

    public EBrand(EBrand value) {
        this.key = value.key;
        this.code = value.code;
        this.name = value.name;
        this.alias = value.alias;
        this.companyName = value.companyName;
        this.categoryCode = value.categoryCode;
        this.categoryName = value.categoryName;
        this.area = value.area;
        this.areaName = value.areaName;
        this.areaCategory = value.areaCategory;
        this.metadata = value.metadata;
        this.active = value.active;
        this.sigma = value.sigma;
        this.language = value.language;
        this.createdAt = value.createdAt;
        this.createdBy = value.createdBy;
        this.updatedAt = value.updatedAt;
        this.updatedBy = value.updatedBy;
    }

    public EBrand(
        String        key,
        String        code,
        String        name,
        String        alias,
        String        companyName,
        String        categoryCode,
        String        categoryName,
        Integer       area,
        String        areaName,
        String        areaCategory,
        String        metadata,
        Boolean       active,
        String        sigma,
        String        language,
        LocalDateTime createdAt,
        String        createdBy,
        LocalDateTime updatedAt,
        String        updatedBy
    ) {
        this.key = key;
        this.code = code;
        this.name = name;
        this.alias = alias;
        this.companyName = companyName;
        this.categoryCode = categoryCode;
        this.categoryName = categoryName;
        this.area = area;
        this.areaName = areaName;
        this.areaCategory = areaCategory;
        this.metadata = metadata;
        this.active = active;
        this.sigma = sigma;
        this.language = language;
        this.createdAt = createdAt;
        this.createdBy = createdBy;
        this.updatedAt = updatedAt;
        this.updatedBy = updatedBy;
    }

    @Override
    public String getKey() {
        return this.key;
    }

    @Override
    public EBrand setKey(String key) {
        this.key = key;
        return this;
    }

    @Override
    public String getCode() {
        return this.code;
    }

    @Override
    public EBrand setCode(String code) {
        this.code = code;
        return this;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public EBrand setName(String name) {
        this.name = name;
        return this;
    }

    @Override
    public String getAlias() {
        return this.alias;
    }

    @Override
    public EBrand setAlias(String alias) {
        this.alias = alias;
        return this;
    }

    @Override
    public String getCompanyName() {
        return this.companyName;
    }

    @Override
    public EBrand setCompanyName(String companyName) {
        this.companyName = companyName;
        return this;
    }

    @Override
    public String getCategoryCode() {
        return this.categoryCode;
    }

    @Override
    public EBrand setCategoryCode(String categoryCode) {
        this.categoryCode = categoryCode;
        return this;
    }

    @Override
    public String getCategoryName() {
        return this.categoryName;
    }

    @Override
    public EBrand setCategoryName(String categoryName) {
        this.categoryName = categoryName;
        return this;
    }

    @Override
    public Integer getArea() {
        return this.area;
    }

    @Override
    public EBrand setArea(Integer area) {
        this.area = area;
        return this;
    }

    @Override
    public String getAreaName() {
        return this.areaName;
    }

    @Override
    public EBrand setAreaName(String areaName) {
        this.areaName = areaName;
        return this;
    }

    @Override
    public String getAreaCategory() {
        return this.areaCategory;
    }

    @Override
    public EBrand setAreaCategory(String areaCategory) {
        this.areaCategory = areaCategory;
        return this;
    }

    @Override
    public String getMetadata() {
        return this.metadata;
    }

    @Override
    public EBrand setMetadata(String metadata) {
        this.metadata = metadata;
        return this;
    }

    @Override
    public Boolean getActive() {
        return this.active;
    }

    @Override
    public EBrand setActive(Boolean active) {
        this.active = active;
        return this;
    }

    @Override
    public String getSigma() {
        return this.sigma;
    }

    @Override
    public EBrand setSigma(String sigma) {
        this.sigma = sigma;
        return this;
    }

    @Override
    public String getLanguage() {
        return this.language;
    }

    @Override
    public EBrand setLanguage(String language) {
        this.language = language;
        return this;
    }

    @Override
    public LocalDateTime getCreatedAt() {
        return this.createdAt;
    }

    @Override
    public EBrand setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    @Override
    public String getCreatedBy() {
        return this.createdBy;
    }

    @Override
    public EBrand setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    @Override
    public LocalDateTime getUpdatedAt() {
        return this.updatedAt;
    }

    @Override
    public EBrand setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    @Override
    public String getUpdatedBy() {
        return this.updatedBy;
    }

    @Override
    public EBrand setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("EBrand (");

        sb.append(key);
        sb.append(", ").append(code);
        sb.append(", ").append(name);
        sb.append(", ").append(alias);
        sb.append(", ").append(companyName);
        sb.append(", ").append(categoryCode);
        sb.append(", ").append(categoryName);
        sb.append(", ").append(area);
        sb.append(", ").append(areaName);
        sb.append(", ").append(areaCategory);
        sb.append(", ").append(metadata);
        sb.append(", ").append(active);
        sb.append(", ").append(sigma);
        sb.append(", ").append(language);
        sb.append(", ").append(createdAt);
        sb.append(", ").append(createdBy);
        sb.append(", ").append(updatedAt);
        sb.append(", ").append(updatedBy);

        sb.append(")");
        return sb.toString();
    }

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public void from(IEBrand from) {
        setKey(from.getKey());
        setCode(from.getCode());
        setName(from.getName());
        setAlias(from.getAlias());
        setCompanyName(from.getCompanyName());
        setCategoryCode(from.getCategoryCode());
        setCategoryName(from.getCategoryName());
        setArea(from.getArea());
        setAreaName(from.getAreaName());
        setAreaCategory(from.getAreaCategory());
        setMetadata(from.getMetadata());
        setActive(from.getActive());
        setSigma(from.getSigma());
        setLanguage(from.getLanguage());
        setCreatedAt(from.getCreatedAt());
        setCreatedBy(from.getCreatedBy());
        setUpdatedAt(from.getUpdatedAt());
        setUpdatedBy(from.getUpdatedBy());
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public <E extends IEBrand> E into(E into) {
        into.from(this);
        return into;
    }

    public EBrand(io.vertx.core.json.JsonObject json) {
        fromJson(json);
    }
}
