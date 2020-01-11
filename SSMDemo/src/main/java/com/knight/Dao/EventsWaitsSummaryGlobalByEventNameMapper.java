package com.knight.Dao;

import com.knight.Bean.EventsWaitsSummaryGlobalByEventName;
import com.knight.Bean.EventsWaitsSummaryGlobalByEventNameExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EventsWaitsSummaryGlobalByEventNameMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table events_waits_summary_global_by_event_name
     *
     * @mbg.generated Sat Dec 28 12:31:56 CST 2019
     */
    long countByExample(EventsWaitsSummaryGlobalByEventNameExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table events_waits_summary_global_by_event_name
     *
     * @mbg.generated Sat Dec 28 12:31:56 CST 2019
     */
    int deleteByExample(EventsWaitsSummaryGlobalByEventNameExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table events_waits_summary_global_by_event_name
     *
     * @mbg.generated Sat Dec 28 12:31:56 CST 2019
     */
    int insert(EventsWaitsSummaryGlobalByEventName record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table events_waits_summary_global_by_event_name
     *
     * @mbg.generated Sat Dec 28 12:31:56 CST 2019
     */
    int insertSelective(EventsWaitsSummaryGlobalByEventName record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table events_waits_summary_global_by_event_name
     *
     * @mbg.generated Sat Dec 28 12:31:56 CST 2019
     */
    List<EventsWaitsSummaryGlobalByEventName> selectByExample(EventsWaitsSummaryGlobalByEventNameExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table events_waits_summary_global_by_event_name
     *
     * @mbg.generated Sat Dec 28 12:31:56 CST 2019
     */
    int updateByExampleSelective(@Param("record") EventsWaitsSummaryGlobalByEventName record, @Param("example") EventsWaitsSummaryGlobalByEventNameExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table events_waits_summary_global_by_event_name
     *
     * @mbg.generated Sat Dec 28 12:31:56 CST 2019
     */
    int updateByExample(@Param("record") EventsWaitsSummaryGlobalByEventName record, @Param("example") EventsWaitsSummaryGlobalByEventNameExample example);
}