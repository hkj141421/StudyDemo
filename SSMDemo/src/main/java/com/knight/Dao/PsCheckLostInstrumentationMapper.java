package com.knight.Dao;

import com.knight.Bean.PsCheckLostInstrumentation;
import com.knight.Bean.PsCheckLostInstrumentationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PsCheckLostInstrumentationMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ps_check_lost_instrumentation
     *
     * @mbg.generated Sat Dec 28 12:31:56 CST 2019
     */
    long countByExample(PsCheckLostInstrumentationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ps_check_lost_instrumentation
     *
     * @mbg.generated Sat Dec 28 12:31:56 CST 2019
     */
    int deleteByExample(PsCheckLostInstrumentationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ps_check_lost_instrumentation
     *
     * @mbg.generated Sat Dec 28 12:31:56 CST 2019
     */
    int insert(PsCheckLostInstrumentation record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ps_check_lost_instrumentation
     *
     * @mbg.generated Sat Dec 28 12:31:56 CST 2019
     */
    int insertSelective(PsCheckLostInstrumentation record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ps_check_lost_instrumentation
     *
     * @mbg.generated Sat Dec 28 12:31:56 CST 2019
     */
    List<PsCheckLostInstrumentation> selectByExample(PsCheckLostInstrumentationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ps_check_lost_instrumentation
     *
     * @mbg.generated Sat Dec 28 12:31:56 CST 2019
     */
    int updateByExampleSelective(@Param("record") PsCheckLostInstrumentation record, @Param("example") PsCheckLostInstrumentationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ps_check_lost_instrumentation
     *
     * @mbg.generated Sat Dec 28 12:31:56 CST 2019
     */
    int updateByExample(@Param("record") PsCheckLostInstrumentation record, @Param("example") PsCheckLostInstrumentationExample example);
}