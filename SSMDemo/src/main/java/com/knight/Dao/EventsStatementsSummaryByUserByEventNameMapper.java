package com.knight.Dao;

import com.knight.Bean.EventsStatementsSummaryByUserByEventName;
import com.knight.Bean.EventsStatementsSummaryByUserByEventNameExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EventsStatementsSummaryByUserByEventNameMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table events_statements_summary_by_user_by_event_name
     *
     * @mbg.generated Sat Dec 28 12:31:56 CST 2019
     */
    long countByExample(EventsStatementsSummaryByUserByEventNameExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table events_statements_summary_by_user_by_event_name
     *
     * @mbg.generated Sat Dec 28 12:31:56 CST 2019
     */
    int deleteByExample(EventsStatementsSummaryByUserByEventNameExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table events_statements_summary_by_user_by_event_name
     *
     * @mbg.generated Sat Dec 28 12:31:56 CST 2019
     */
    int insert(EventsStatementsSummaryByUserByEventName record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table events_statements_summary_by_user_by_event_name
     *
     * @mbg.generated Sat Dec 28 12:31:56 CST 2019
     */
    int insertSelective(EventsStatementsSummaryByUserByEventName record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table events_statements_summary_by_user_by_event_name
     *
     * @mbg.generated Sat Dec 28 12:31:56 CST 2019
     */
    List<EventsStatementsSummaryByUserByEventName> selectByExample(EventsStatementsSummaryByUserByEventNameExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table events_statements_summary_by_user_by_event_name
     *
     * @mbg.generated Sat Dec 28 12:31:56 CST 2019
     */
    int updateByExampleSelective(@Param("record") EventsStatementsSummaryByUserByEventName record, @Param("example") EventsStatementsSummaryByUserByEventNameExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table events_statements_summary_by_user_by_event_name
     *
     * @mbg.generated Sat Dec 28 12:31:56 CST 2019
     */
    int updateByExample(@Param("record") EventsStatementsSummaryByUserByEventName record, @Param("example") EventsStatementsSummaryByUserByEventNameExample example);
}