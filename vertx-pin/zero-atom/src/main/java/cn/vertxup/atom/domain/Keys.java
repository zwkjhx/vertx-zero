/*
 * This file is generated by jOOQ.
*/
package cn.vertxup.atom.domain;


import cn.vertxup.atom.domain.tables.MAcc;
import cn.vertxup.atom.domain.tables.MAttribute;
import cn.vertxup.atom.domain.tables.MEntity;
import cn.vertxup.atom.domain.tables.MField;
import cn.vertxup.atom.domain.tables.MIndex;
import cn.vertxup.atom.domain.tables.MJoin;
import cn.vertxup.atom.domain.tables.MKey;
import cn.vertxup.atom.domain.tables.MModel;
import cn.vertxup.atom.domain.tables.MRelation;
import cn.vertxup.atom.domain.tables.MTpl;
import cn.vertxup.atom.domain.tables.records.MAccRecord;
import cn.vertxup.atom.domain.tables.records.MAttributeRecord;
import cn.vertxup.atom.domain.tables.records.MEntityRecord;
import cn.vertxup.atom.domain.tables.records.MFieldRecord;
import cn.vertxup.atom.domain.tables.records.MIndexRecord;
import cn.vertxup.atom.domain.tables.records.MJoinRecord;
import cn.vertxup.atom.domain.tables.records.MKeyRecord;
import cn.vertxup.atom.domain.tables.records.MModelRecord;
import cn.vertxup.atom.domain.tables.records.MRelationRecord;
import cn.vertxup.atom.domain.tables.records.MTplRecord;

import javax.annotation.Generated;

import org.jooq.UniqueKey;
import org.jooq.impl.Internal;


/**
 * A class modelling foreign key relationships and constraints of tables of 
 * the <code>DB_ETERNAL</code> schema.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.8"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Keys {

    // -------------------------------------------------------------------------
    // IDENTITY definitions
    // -------------------------------------------------------------------------


    // -------------------------------------------------------------------------
    // UNIQUE and PRIMARY KEY definitions
    // -------------------------------------------------------------------------

    public static final UniqueKey<MAccRecord> KEY_M_ACC_PRIMARY = UniqueKeys0.KEY_M_ACC_PRIMARY;
    public static final UniqueKey<MAccRecord> KEY_M_ACC_SIGMA = UniqueKeys0.KEY_M_ACC_SIGMA;
    public static final UniqueKey<MAttributeRecord> KEY_M_ATTRIBUTE_PRIMARY = UniqueKeys0.KEY_M_ATTRIBUTE_PRIMARY;
    public static final UniqueKey<MAttributeRecord> KEY_M_ATTRIBUTE_NAME = UniqueKeys0.KEY_M_ATTRIBUTE_NAME;
    public static final UniqueKey<MEntityRecord> KEY_M_ENTITY_PRIMARY = UniqueKeys0.KEY_M_ENTITY_PRIMARY;
    public static final UniqueKey<MEntityRecord> KEY_M_ENTITY_NAMESPACE = UniqueKeys0.KEY_M_ENTITY_NAMESPACE;
    public static final UniqueKey<MEntityRecord> KEY_M_ENTITY_NAMESPACE_2 = UniqueKeys0.KEY_M_ENTITY_NAMESPACE_2;
    public static final UniqueKey<MEntityRecord> KEY_M_ENTITY_SIGMA = UniqueKeys0.KEY_M_ENTITY_SIGMA;
    public static final UniqueKey<MFieldRecord> KEY_M_FIELD_PRIMARY = UniqueKeys0.KEY_M_FIELD_PRIMARY;
    public static final UniqueKey<MFieldRecord> KEY_M_FIELD_NAME = UniqueKeys0.KEY_M_FIELD_NAME;
    public static final UniqueKey<MIndexRecord> KEY_M_INDEX_PRIMARY = UniqueKeys0.KEY_M_INDEX_PRIMARY;
    public static final UniqueKey<MIndexRecord> KEY_M_INDEX_NAME = UniqueKeys0.KEY_M_INDEX_NAME;
    public static final UniqueKey<MJoinRecord> KEY_M_JOIN_PRIMARY = UniqueKeys0.KEY_M_JOIN_PRIMARY;
    public static final UniqueKey<MKeyRecord> KEY_M_KEY_PRIMARY = UniqueKeys0.KEY_M_KEY_PRIMARY;
    public static final UniqueKey<MKeyRecord> KEY_M_KEY_NAME = UniqueKeys0.KEY_M_KEY_NAME;
    public static final UniqueKey<MModelRecord> KEY_M_MODEL_PRIMARY = UniqueKeys0.KEY_M_MODEL_PRIMARY;
    public static final UniqueKey<MModelRecord> KEY_M_MODEL_NAMESPACE = UniqueKeys0.KEY_M_MODEL_NAMESPACE;
    public static final UniqueKey<MModelRecord> KEY_M_MODEL_NAMESPACE_2 = UniqueKeys0.KEY_M_MODEL_NAMESPACE_2;
    public static final UniqueKey<MRelationRecord> KEY_M_RELATION_PRIMARY = UniqueKeys0.KEY_M_RELATION_PRIMARY;
    public static final UniqueKey<MRelationRecord> KEY_M_RELATION_TYPE = UniqueKeys0.KEY_M_RELATION_TYPE;
    public static final UniqueKey<MTplRecord> KEY_M_TPL_PRIMARY = UniqueKeys0.KEY_M_TPL_PRIMARY;
    public static final UniqueKey<MTplRecord> KEY_M_TPL_CODE = UniqueKeys0.KEY_M_TPL_CODE;

    // -------------------------------------------------------------------------
    // FOREIGN KEY definitions
    // -------------------------------------------------------------------------


    // -------------------------------------------------------------------------
    // [#1459] distribute members to avoid static initialisers > 64kb
    // -------------------------------------------------------------------------

    private static class UniqueKeys0 {
        public static final UniqueKey<MAccRecord> KEY_M_ACC_PRIMARY = Internal.createUniqueKey(MAcc.M_ACC, "KEY_M_ACC_PRIMARY", MAcc.M_ACC.KEY);
        public static final UniqueKey<MAccRecord> KEY_M_ACC_SIGMA = Internal.createUniqueKey(MAcc.M_ACC, "KEY_M_ACC_SIGMA", MAcc.M_ACC.SIGMA, MAcc.M_ACC.MODEL_KEY);
        public static final UniqueKey<MAttributeRecord> KEY_M_ATTRIBUTE_PRIMARY = Internal.createUniqueKey(MAttribute.M_ATTRIBUTE, "KEY_M_ATTRIBUTE_PRIMARY", MAttribute.M_ATTRIBUTE.KEY);
        public static final UniqueKey<MAttributeRecord> KEY_M_ATTRIBUTE_NAME = Internal.createUniqueKey(MAttribute.M_ATTRIBUTE, "KEY_M_ATTRIBUTE_NAME", MAttribute.M_ATTRIBUTE.NAME, MAttribute.M_ATTRIBUTE.MODEL_ID);
        public static final UniqueKey<MEntityRecord> KEY_M_ENTITY_PRIMARY = Internal.createUniqueKey(MEntity.M_ENTITY, "KEY_M_ENTITY_PRIMARY", MEntity.M_ENTITY.KEY);
        public static final UniqueKey<MEntityRecord> KEY_M_ENTITY_NAMESPACE = Internal.createUniqueKey(MEntity.M_ENTITY, "KEY_M_ENTITY_NAMESPACE", MEntity.M_ENTITY.NAMESPACE, MEntity.M_ENTITY.IDENTIFIER);
        public static final UniqueKey<MEntityRecord> KEY_M_ENTITY_NAMESPACE_2 = Internal.createUniqueKey(MEntity.M_ENTITY, "KEY_M_ENTITY_NAMESPACE_2", MEntity.M_ENTITY.NAMESPACE, MEntity.M_ENTITY.NAME);
        public static final UniqueKey<MEntityRecord> KEY_M_ENTITY_SIGMA = Internal.createUniqueKey(MEntity.M_ENTITY, "KEY_M_ENTITY_SIGMA", MEntity.M_ENTITY.SIGMA, MEntity.M_ENTITY.TABLE_NAME);
        public static final UniqueKey<MFieldRecord> KEY_M_FIELD_PRIMARY = Internal.createUniqueKey(MField.M_FIELD, "KEY_M_FIELD_PRIMARY", MField.M_FIELD.KEY);
        public static final UniqueKey<MFieldRecord> KEY_M_FIELD_NAME = Internal.createUniqueKey(MField.M_FIELD, "KEY_M_FIELD_NAME", MField.M_FIELD.NAME, MField.M_FIELD.ENTITY_ID);
        public static final UniqueKey<MIndexRecord> KEY_M_INDEX_PRIMARY = Internal.createUniqueKey(MIndex.M_INDEX, "KEY_M_INDEX_PRIMARY", MIndex.M_INDEX.KEY);
        public static final UniqueKey<MIndexRecord> KEY_M_INDEX_NAME = Internal.createUniqueKey(MIndex.M_INDEX, "KEY_M_INDEX_NAME", MIndex.M_INDEX.NAME, MIndex.M_INDEX.ENTITY_ID);
        public static final UniqueKey<MJoinRecord> KEY_M_JOIN_PRIMARY = Internal.createUniqueKey(MJoin.M_JOIN, "KEY_M_JOIN_PRIMARY", MJoin.M_JOIN.MODEL, MJoin.M_JOIN.ENTITY, MJoin.M_JOIN.ENTITY_KEY, MJoin.M_JOIN.NAMESPACE);
        public static final UniqueKey<MKeyRecord> KEY_M_KEY_PRIMARY = Internal.createUniqueKey(MKey.M_KEY, "KEY_M_KEY_PRIMARY", MKey.M_KEY.KEY);
        public static final UniqueKey<MKeyRecord> KEY_M_KEY_NAME = Internal.createUniqueKey(MKey.M_KEY, "KEY_M_KEY_NAME", MKey.M_KEY.NAME, MKey.M_KEY.ENTITY_ID);
        public static final UniqueKey<MModelRecord> KEY_M_MODEL_PRIMARY = Internal.createUniqueKey(MModel.M_MODEL, "KEY_M_MODEL_PRIMARY", MModel.M_MODEL.KEY);
        public static final UniqueKey<MModelRecord> KEY_M_MODEL_NAMESPACE = Internal.createUniqueKey(MModel.M_MODEL, "KEY_M_MODEL_NAMESPACE", MModel.M_MODEL.NAMESPACE, MModel.M_MODEL.IDENTIFIER);
        public static final UniqueKey<MModelRecord> KEY_M_MODEL_NAMESPACE_2 = Internal.createUniqueKey(MModel.M_MODEL, "KEY_M_MODEL_NAMESPACE_2", MModel.M_MODEL.NAMESPACE, MModel.M_MODEL.NAME);
        public static final UniqueKey<MRelationRecord> KEY_M_RELATION_PRIMARY = Internal.createUniqueKey(MRelation.M_RELATION, "KEY_M_RELATION_PRIMARY", MRelation.M_RELATION.KEY);
        public static final UniqueKey<MRelationRecord> KEY_M_RELATION_TYPE = Internal.createUniqueKey(MRelation.M_RELATION, "KEY_M_RELATION_TYPE", MRelation.M_RELATION.TYPE, MRelation.M_RELATION.UPSTREAM, MRelation.M_RELATION.DOWNSTREAM, MRelation.M_RELATION.SIGMA);
        public static final UniqueKey<MTplRecord> KEY_M_TPL_PRIMARY = Internal.createUniqueKey(MTpl.M_TPL, "KEY_M_TPL_PRIMARY", MTpl.M_TPL.KEY);
        public static final UniqueKey<MTplRecord> KEY_M_TPL_CODE = Internal.createUniqueKey(MTpl.M_TPL, "KEY_M_TPL_CODE", MTpl.M_TPL.CODE, MTpl.M_TPL.SIGMA);
    }
}
