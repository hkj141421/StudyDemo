package com.knight.Dao;

import com.knight.Bean.XWaitsByHostByLatency;
import com.knight.Bean.XWaitsByHostByLatencyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface XWaitsByHostByLatencyMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table x$waits_by_host_by_latency
     *
     * @mbg.generated Sat Dec 28 12:31:56 CST 2019
     */
    long countByExample(XWaitsByHostByLatencyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table x$waits_by_host_by_latency
     *
     * @mbg.generated Sat Dec 28 12:31:56 CST 2019
     */
    int deleteByExample(XWaitsByHostByLatencyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table x$waits_by_host_by_latency
     *
     * @mbg.generated Sat Dec 28 12:31:56 CST 2019
     */
    int insert(XWaitsByHostByLatency record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table x$waits_by_host_by_latency
     *
     * @mbg.generated Sat Dec 28 12:31:56 CST 2019
     */
    int insertSelective(XWaitsByHostByLatency record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table x$waits_by_host_by_latency
     *
     * @mbg.generated Sat Dec 28 12:31:56 CST 2019
     */
    List<XWaitsByHostByLatency> selectByExample(XWaitsByHostByLatencyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table x$waits_by_host_by_latency
     *
     * @mbg.generated Sat Dec 28 12:31:56 CST 2019
     */
    int updateByExampleSelective(@Param("record") XWaitsByHostByLatency record, @Param("example") XWaitsByHostByLatencyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table x$waits_by_host_by_latency
     *
     * @mbg.generated Sat Dec 28 12:31:56 CST 2019
     */
    int updateByExample(@Param("record") XWaitsByHostByLatency record, @Param("example") XWaitsByHostByLatencyExample example);
}