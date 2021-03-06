package com.knight.Dao;

import com.knight.Bean.EventsStatementsSummaryByThreadByEventName;
import com.knight.Bean.EventsStatementsSummaryByThreadByEventNameExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EventsStatementsSummaryByThreadByEventNameMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table events_statements_summary_by_thread_by_event_name
     *
     * @mbg.generated Sat Dec 28 12:31:56 CST 2019
     */
    long countByExample(EventsStatementsSummaryByThreadByEventNameExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table events_statements_summary_by_thread_by_event_name
     *
     * @mbg.generated Sat Dec 28 12:31:56 CST 2019
     */
    int deleteByExample(EventsStatementsSummaryByThreadByEventNameExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table events_statements_summary_by_thread_by_event_name
     *
     * @mbg.generated Sat Dec 28 12:31:56 CST 2019
     */
    int insert(EventsStatementsSummaryByThreadByEventName record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table events_statements_summary_by_thread_by_event_name
     *
     * @mbg.generated Sat Dec 28 12:31:56 CST 2019
     */
    int insertSelective(EventsStatementsSummaryByThreadByEventName record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table events_statements_summary_by_thread_by_event_name
     *
     * @mbg.generated Sat Dec 28 12:31:56 CST 2019
     */
    List<EventsStatementsSummaryByThreadByEventName> selectByExample(EventsStatementsSummaryByThreadByEventNameExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table events_statements_summary_by_thread_by_event_name
     *
     * @mbg.generated Sat Dec 28 12:31:56 CST 2019
     */
    int updateByExampleSelective(@Param("record") EventsStatementsSummaryByThreadByEventName record, @Param("example") EventsStatementsSummaryByThreadByEventNameExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table events_statements_summary_by_thread_by_event_name
     *
     * @mbg.generated Sat Dec 28 12:31:56 CST 2019
     */
    int updateByExample(@Param("record") EventsStatementsSummaryByThreadByEventName record, @Param("example") EventsStatementsSummaryByThreadByEventNameExample example);
}