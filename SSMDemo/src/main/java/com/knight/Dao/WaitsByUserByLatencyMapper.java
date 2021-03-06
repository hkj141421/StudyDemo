package com.knight.Dao;

import com.knight.Bean.WaitsByUserByLatency;
import com.knight.Bean.WaitsByUserByLatencyExample;
import com.knight.Bean.WaitsByUserByLatencyWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WaitsByUserByLatencyMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table waits_by_user_by_latency
     *
     * @mbg.generated Sat Dec 28 12:31:56 CST 2019
     */
    long countByExample(WaitsByUserByLatencyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table waits_by_user_by_latency
     *
     * @mbg.generated Sat Dec 28 12:31:56 CST 2019
     */
    int deleteByExample(WaitsByUserByLatencyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table waits_by_user_by_latency
     *
     * @mbg.generated Sat Dec 28 12:31:56 CST 2019
     */
    int insert(WaitsByUserByLatencyWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table waits_by_user_by_latency
     *
     * @mbg.generated Sat Dec 28 12:31:56 CST 2019
     */
    int insertSelective(WaitsByUserByLatencyWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table waits_by_user_by_latency
     *
     * @mbg.generated Sat Dec 28 12:31:56 CST 2019
     */
    List<WaitsByUserByLatencyWithBLOBs> selectByExampleWithBLOBs(WaitsByUserByLatencyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table waits_by_user_by_latency
     *
     * @mbg.generated Sat Dec 28 12:31:56 CST 2019
     */
    List<WaitsByUserByLatency> selectByExample(WaitsByUserByLatencyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table waits_by_user_by_latency
     *
     * @mbg.generated Sat Dec 28 12:31:56 CST 2019
     */
    int updateByExampleSelective(@Param("record") WaitsByUserByLatencyWithBLOBs record, @Param("example") WaitsByUserByLatencyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table waits_by_user_by_latency
     *
     * @mbg.generated Sat Dec 28 12:31:56 CST 2019
     */
    int updateByExampleWithBLOBs(@Param("record") WaitsByUserByLatencyWithBLOBs record, @Param("example") WaitsByUserByLatencyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table waits_by_user_by_latency
     *
     * @mbg.generated Sat Dec 28 12:31:56 CST 2019
     */
    int updateByExample(@Param("record") WaitsByUserByLatency record, @Param("example") WaitsByUserByLatencyExample example);
}