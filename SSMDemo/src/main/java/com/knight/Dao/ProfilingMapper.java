package com.knight.Dao;

import com.knight.Bean.Profiling;
import com.knight.Bean.ProfilingExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProfilingMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PROFILING
     *
     * @mbg.generated Sat Dec 28 12:31:56 CST 2019
     */
    long countByExample(ProfilingExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PROFILING
     *
     * @mbg.generated Sat Dec 28 12:31:56 CST 2019
     */
    int deleteByExample(ProfilingExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PROFILING
     *
     * @mbg.generated Sat Dec 28 12:31:56 CST 2019
     */
    int insert(Profiling record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PROFILING
     *
     * @mbg.generated Sat Dec 28 12:31:56 CST 2019
     */
    int insertSelective(Profiling record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PROFILING
     *
     * @mbg.generated Sat Dec 28 12:31:56 CST 2019
     */
    List<Profiling> selectByExample(ProfilingExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PROFILING
     *
     * @mbg.generated Sat Dec 28 12:31:56 CST 2019
     */
    int updateByExampleSelective(@Param("record") Profiling record, @Param("example") ProfilingExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PROFILING
     *
     * @mbg.generated Sat Dec 28 12:31:56 CST 2019
     */
    int updateByExample(@Param("record") Profiling record, @Param("example") ProfilingExample example);
}