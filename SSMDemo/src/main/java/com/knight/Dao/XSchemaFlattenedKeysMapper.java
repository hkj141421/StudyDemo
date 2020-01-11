package com.knight.Dao;

import com.knight.Bean.XSchemaFlattenedKeys;
import com.knight.Bean.XSchemaFlattenedKeysExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface XSchemaFlattenedKeysMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table x$schema_flattened_keys
     *
     * @mbg.generated Sat Dec 28 12:31:55 CST 2019
     */
    long countByExample(XSchemaFlattenedKeysExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table x$schema_flattened_keys
     *
     * @mbg.generated Sat Dec 28 12:31:55 CST 2019
     */
    int deleteByExample(XSchemaFlattenedKeysExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table x$schema_flattened_keys
     *
     * @mbg.generated Sat Dec 28 12:31:55 CST 2019
     */
    int insert(XSchemaFlattenedKeys record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table x$schema_flattened_keys
     *
     * @mbg.generated Sat Dec 28 12:31:55 CST 2019
     */
    int insertSelective(XSchemaFlattenedKeys record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table x$schema_flattened_keys
     *
     * @mbg.generated Sat Dec 28 12:31:55 CST 2019
     */
    List<XSchemaFlattenedKeys> selectByExampleWithBLOBs(XSchemaFlattenedKeysExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table x$schema_flattened_keys
     *
     * @mbg.generated Sat Dec 28 12:31:55 CST 2019
     */
    List<XSchemaFlattenedKeys> selectByExample(XSchemaFlattenedKeysExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table x$schema_flattened_keys
     *
     * @mbg.generated Sat Dec 28 12:31:55 CST 2019
     */
    int updateByExampleSelective(@Param("record") XSchemaFlattenedKeys record, @Param("example") XSchemaFlattenedKeysExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table x$schema_flattened_keys
     *
     * @mbg.generated Sat Dec 28 12:31:55 CST 2019
     */
    int updateByExampleWithBLOBs(@Param("record") XSchemaFlattenedKeys record, @Param("example") XSchemaFlattenedKeysExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table x$schema_flattened_keys
     *
     * @mbg.generated Sat Dec 28 12:31:55 CST 2019
     */
    int updateByExample(@Param("record") XSchemaFlattenedKeys record, @Param("example") XSchemaFlattenedKeysExample example);
}