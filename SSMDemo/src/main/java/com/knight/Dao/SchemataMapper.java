package com.knight.Dao;

import com.knight.Bean.Schemata;
import com.knight.Bean.SchemataExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SchemataMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SCHEMATA
     *
     * @mbg.generated Sat Dec 28 12:31:56 CST 2019
     */
    long countByExample(SchemataExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SCHEMATA
     *
     * @mbg.generated Sat Dec 28 12:31:56 CST 2019
     */
    int deleteByExample(SchemataExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SCHEMATA
     *
     * @mbg.generated Sat Dec 28 12:31:56 CST 2019
     */
    int insert(Schemata record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SCHEMATA
     *
     * @mbg.generated Sat Dec 28 12:31:56 CST 2019
     */
    int insertSelective(Schemata record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SCHEMATA
     *
     * @mbg.generated Sat Dec 28 12:31:56 CST 2019
     */
    List<Schemata> selectByExample(SchemataExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SCHEMATA
     *
     * @mbg.generated Sat Dec 28 12:31:56 CST 2019
     */
    int updateByExampleSelective(@Param("record") Schemata record, @Param("example") SchemataExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SCHEMATA
     *
     * @mbg.generated Sat Dec 28 12:31:56 CST 2019
     */
    int updateByExample(@Param("record") Schemata record, @Param("example") SchemataExample example);
}