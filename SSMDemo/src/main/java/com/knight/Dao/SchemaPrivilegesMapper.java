package com.knight.Dao;

import com.knight.Bean.SchemaPrivileges;
import com.knight.Bean.SchemaPrivilegesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SchemaPrivilegesMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SCHEMA_PRIVILEGES
     *
     * @mbg.generated Sat Dec 28 12:31:55 CST 2019
     */
    long countByExample(SchemaPrivilegesExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SCHEMA_PRIVILEGES
     *
     * @mbg.generated Sat Dec 28 12:31:55 CST 2019
     */
    int deleteByExample(SchemaPrivilegesExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SCHEMA_PRIVILEGES
     *
     * @mbg.generated Sat Dec 28 12:31:55 CST 2019
     */
    int insert(SchemaPrivileges record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SCHEMA_PRIVILEGES
     *
     * @mbg.generated Sat Dec 28 12:31:55 CST 2019
     */
    int insertSelective(SchemaPrivileges record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SCHEMA_PRIVILEGES
     *
     * @mbg.generated Sat Dec 28 12:31:55 CST 2019
     */
    List<SchemaPrivileges> selectByExample(SchemaPrivilegesExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SCHEMA_PRIVILEGES
     *
     * @mbg.generated Sat Dec 28 12:31:55 CST 2019
     */
    int updateByExampleSelective(@Param("record") SchemaPrivileges record, @Param("example") SchemaPrivilegesExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SCHEMA_PRIVILEGES
     *
     * @mbg.generated Sat Dec 28 12:31:55 CST 2019
     */
    int updateByExample(@Param("record") SchemaPrivileges record, @Param("example") SchemaPrivilegesExample example);
}