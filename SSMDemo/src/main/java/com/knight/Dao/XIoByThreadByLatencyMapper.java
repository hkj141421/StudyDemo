package com.knight.Dao;

import com.knight.Bean.XIoByThreadByLatency;
import com.knight.Bean.XIoByThreadByLatencyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface XIoByThreadByLatencyMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table x$io_by_thread_by_latency
     *
     * @mbg.generated Sat Dec 28 12:31:56 CST 2019
     */
    long countByExample(XIoByThreadByLatencyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table x$io_by_thread_by_latency
     *
     * @mbg.generated Sat Dec 28 12:31:56 CST 2019
     */
    int deleteByExample(XIoByThreadByLatencyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table x$io_by_thread_by_latency
     *
     * @mbg.generated Sat Dec 28 12:31:56 CST 2019
     */
    int insert(XIoByThreadByLatency record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table x$io_by_thread_by_latency
     *
     * @mbg.generated Sat Dec 28 12:31:56 CST 2019
     */
    int insertSelective(XIoByThreadByLatency record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table x$io_by_thread_by_latency
     *
     * @mbg.generated Sat Dec 28 12:31:56 CST 2019
     */
    List<XIoByThreadByLatency> selectByExample(XIoByThreadByLatencyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table x$io_by_thread_by_latency
     *
     * @mbg.generated Sat Dec 28 12:31:56 CST 2019
     */
    int updateByExampleSelective(@Param("record") XIoByThreadByLatency record, @Param("example") XIoByThreadByLatencyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table x$io_by_thread_by_latency
     *
     * @mbg.generated Sat Dec 28 12:31:56 CST 2019
     */
    int updateByExample(@Param("record") XIoByThreadByLatency record, @Param("example") XIoByThreadByLatencyExample example);
}