package com.knight.Dao;

import com.knight.Bean.EventsStagesSummaryByAccountByEventName;
import com.knight.Bean.EventsStagesSummaryByAccountByEventNameExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EventsStagesSummaryByAccountByEventNameMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table events_stages_summary_by_account_by_event_name
     *
     * @mbg.generated Sat Dec 28 12:31:56 CST 2019
     */
    long countByExample(EventsStagesSummaryByAccountByEventNameExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table events_stages_summary_by_account_by_event_name
     *
     * @mbg.generated Sat Dec 28 12:31:56 CST 2019
     */
    int deleteByExample(EventsStagesSummaryByAccountByEventNameExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table events_stages_summary_by_account_by_event_name
     *
     * @mbg.generated Sat Dec 28 12:31:56 CST 2019
     */
    int insert(EventsStagesSummaryByAccountByEventName record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table events_stages_summary_by_account_by_event_name
     *
     * @mbg.generated Sat Dec 28 12:31:56 CST 2019
     */
    int insertSelective(EventsStagesSummaryByAccountByEventName record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table events_stages_summary_by_account_by_event_name
     *
     * @mbg.generated Sat Dec 28 12:31:56 CST 2019
     */
    List<EventsStagesSummaryByAccountByEventName> selectByExample(EventsStagesSummaryByAccountByEventNameExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table events_stages_summary_by_account_by_event_name
     *
     * @mbg.generated Sat Dec 28 12:31:56 CST 2019
     */
    int updateByExampleSelective(@Param("record") EventsStagesSummaryByAccountByEventName record, @Param("example") EventsStagesSummaryByAccountByEventNameExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table events_stages_summary_by_account_by_event_name
     *
     * @mbg.generated Sat Dec 28 12:31:56 CST 2019
     */
    int updateByExample(@Param("record") EventsStagesSummaryByAccountByEventName record, @Param("example") EventsStagesSummaryByAccountByEventNameExample example);
}