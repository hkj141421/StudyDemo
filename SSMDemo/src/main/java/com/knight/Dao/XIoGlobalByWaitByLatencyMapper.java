package com.knight.Dao;

import com.knight.Bean.XIoGlobalByWaitByLatency;
import com.knight.Bean.XIoGlobalByWaitByLatencyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface XIoGlobalByWaitByLatencyMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table x$io_global_by_wait_by_latency
     *
     * @mbg.generated Sat Dec 28 12:31:56 CST 2019
     */
    long countByExample(XIoGlobalByWaitByLatencyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table x$io_global_by_wait_by_latency
     *
     * @mbg.generated Sat Dec 28 12:31:56 CST 2019
     */
    int deleteByExample(XIoGlobalByWaitByLatencyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table x$io_global_by_wait_by_latency
     *
     * @mbg.generated Sat Dec 28 12:31:56 CST 2019
     */
    int insert(XIoGlobalByWaitByLatency record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table x$io_global_by_wait_by_latency
     *
     * @mbg.generated Sat Dec 28 12:31:56 CST 2019
     */
    int insertSelective(XIoGlobalByWaitByLatency record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table x$io_global_by_wait_by_latency
     *
     * @mbg.generated Sat Dec 28 12:31:56 CST 2019
     */
    List<XIoGlobalByWaitByLatency> selectByExample(XIoGlobalByWaitByLatencyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table x$io_global_by_wait_by_latency
     *
     * @mbg.generated Sat Dec 28 12:31:56 CST 2019
     */
    int updateByExampleSelective(@Param("record") XIoGlobalByWaitByLatency record, @Param("example") XIoGlobalByWaitByLatencyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table x$io_global_by_wait_by_latency
     *
     * @mbg.generated Sat Dec 28 12:31:56 CST 2019
     */
    int updateByExample(@Param("record") XIoGlobalByWaitByLatency record, @Param("example") XIoGlobalByWaitByLatencyExample example);
}