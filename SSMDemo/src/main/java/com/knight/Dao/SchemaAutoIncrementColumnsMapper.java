package com.knight.Dao;

import com.knight.Bean.SchemaAutoIncrementColumns;
import com.knight.Bean.SchemaAutoIncrementColumnsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SchemaAutoIncrementColumnsMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table schema_auto_increment_columns
     *
     * @mbg.generated Sat Dec 28 12:31:56 CST 2019
     */
    long countByExample(SchemaAutoIncrementColumnsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table schema_auto_increment_columns
     *
     * @mbg.generated Sat Dec 28 12:31:56 CST 2019
     */
    int deleteByExample(SchemaAutoIncrementColumnsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table schema_auto_increment_columns
     *
     * @mbg.generated Sat Dec 28 12:31:56 CST 2019
     */
    int insert(SchemaAutoIncrementColumns record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table schema_auto_increment_columns
     *
     * @mbg.generated Sat Dec 28 12:31:56 CST 2019
     */
    int insertSelective(SchemaAutoIncrementColumns record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table schema_auto_increment_columns
     *
     * @mbg.generated Sat Dec 28 12:31:56 CST 2019
     */
    List<SchemaAutoIncrementColumns> selectByExampleWithBLOBs(SchemaAutoIncrementColumnsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table schema_auto_increment_columns
     *
     * @mbg.generated Sat Dec 28 12:31:56 CST 2019
     */
    List<SchemaAutoIncrementColumns> selectByExample(SchemaAutoIncrementColumnsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table schema_auto_increment_columns
     *
     * @mbg.generated Sat Dec 28 12:31:56 CST 2019
     */
    int updateByExampleSelective(@Param("record") SchemaAutoIncrementColumns record, @Param("example") SchemaAutoIncrementColumnsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table schema_auto_increment_columns
     *
     * @mbg.generated Sat Dec 28 12:31:56 CST 2019
     */
    int updateByExampleWithBLOBs(@Param("record") SchemaAutoIncrementColumns record, @Param("example") SchemaAutoIncrementColumnsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table schema_auto_increment_columns
     *
     * @mbg.generated Sat Dec 28 12:31:56 CST 2019
     */
    int updateByExample(@Param("record") SchemaAutoIncrementColumns record, @Param("example") SchemaAutoIncrementColumnsExample example);
}