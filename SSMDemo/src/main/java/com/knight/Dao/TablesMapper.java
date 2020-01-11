package com.knight.Dao;

import com.knight.Bean.Tables;
import com.knight.Bean.TablesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TablesMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TABLES
     *
     * @mbg.generated Sat Dec 28 12:31:56 CST 2019
     */
    long countByExample(TablesExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TABLES
     *
     * @mbg.generated Sat Dec 28 12:31:56 CST 2019
     */
    int deleteByExample(TablesExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TABLES
     *
     * @mbg.generated Sat Dec 28 12:31:56 CST 2019
     */
    int insert(Tables record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TABLES
     *
     * @mbg.generated Sat Dec 28 12:31:56 CST 2019
     */
    int insertSelective(Tables record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TABLES
     *
     * @mbg.generated Sat Dec 28 12:31:56 CST 2019
     */
    List<Tables> selectByExample(TablesExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TABLES
     *
     * @mbg.generated Sat Dec 28 12:31:56 CST 2019
     */
    int updateByExampleSelective(@Param("record") Tables record, @Param("example") TablesExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TABLES
     *
     * @mbg.generated Sat Dec 28 12:31:56 CST 2019
     */
    int updateByExample(@Param("record") Tables record, @Param("example") TablesExample example);
}