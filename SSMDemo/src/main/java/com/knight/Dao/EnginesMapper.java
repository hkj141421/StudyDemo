package com.knight.Dao;

import com.knight.Bean.Engines;
import com.knight.Bean.EnginesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EnginesMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ENGINES
     *
     * @mbg.generated Sat Dec 28 12:31:56 CST 2019
     */
    long countByExample(EnginesExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ENGINES
     *
     * @mbg.generated Sat Dec 28 12:31:56 CST 2019
     */
    int deleteByExample(EnginesExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ENGINES
     *
     * @mbg.generated Sat Dec 28 12:31:56 CST 2019
     */
    int insert(Engines record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ENGINES
     *
     * @mbg.generated Sat Dec 28 12:31:56 CST 2019
     */
    int insertSelective(Engines record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ENGINES
     *
     * @mbg.generated Sat Dec 28 12:31:56 CST 2019
     */
    List<Engines> selectByExample(EnginesExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ENGINES
     *
     * @mbg.generated Sat Dec 28 12:31:56 CST 2019
     */
    int updateByExampleSelective(@Param("record") Engines record, @Param("example") EnginesExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ENGINES
     *
     * @mbg.generated Sat Dec 28 12:31:56 CST 2019
     */
    int updateByExample(@Param("record") Engines record, @Param("example") EnginesExample example);
}