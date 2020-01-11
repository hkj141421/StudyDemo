package com.knight.Dao;

import com.knight.Bean.EventsStatementsSummaryByHostByEventName;
import com.knight.Bean.EventsStatementsSummaryByHostByEventNameExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EventsStatementsSummaryByHostByEventNameMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table events_statements_summary_by_host_by_event_name
     *
     * @mbg.generated Sat Dec 28 12:31:56 CST 2019
     */
    long countByExample(EventsStatementsSummaryByHostByEventNameExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table events_statements_summary_by_host_by_event_name
     *
     * @mbg.generated Sat Dec 28 12:31:56 CST 2019
     */
    int deleteByExample(EventsStatementsSummaryByHostByEventNameExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table events_statements_summary_by_host_by_event_name
     *
     * @mbg.generated Sat Dec 28 12:31:56 CST 2019
     */
    int insert(EventsStatementsSummaryByHostByEventName record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table events_statements_summary_by_host_by_event_name
     *
     * @mbg.generated Sat Dec 28 12:31:56 CST 2019
     */
    int insertSelective(EventsStatementsSummaryByHostByEventName record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table events_statements_summary_by_host_by_event_name
     *
     * @mbg.generated Sat Dec 28 12:31:56 CST 2019
     */
    List<EventsStatementsSummaryByHostByEventName> selectByExample(EventsStatementsSummaryByHostByEventNameExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table events_statements_summary_by_host_by_event_name
     *
     * @mbg.generated Sat Dec 28 12:31:56 CST 2019
     */
    int updateByExampleSelective(@Param("record") EventsStatementsSummaryByHostByEventName record, @Param("example") EventsStatementsSummaryByHostByEventNameExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table events_statements_summary_by_host_by_event_name
     *
     * @mbg.generated Sat Dec 28 12:31:56 CST 2019
     */
    int updateByExample(@Param("record") EventsStatementsSummaryByHostByEventName record, @Param("example") EventsStatementsSummaryByHostByEventNameExample example);
}