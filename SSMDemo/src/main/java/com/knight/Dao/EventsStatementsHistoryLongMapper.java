package com.knight.Dao;

import com.knight.Bean.EventsStatementsHistoryLong;
import com.knight.Bean.EventsStatementsHistoryLongExample;
import com.knight.Bean.EventsStatementsHistoryLongWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EventsStatementsHistoryLongMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table events_statements_history_long
     *
     * @mbg.generated Sat Dec 28 12:31:56 CST 2019
     */
    long countByExample(EventsStatementsHistoryLongExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table events_statements_history_long
     *
     * @mbg.generated Sat Dec 28 12:31:56 CST 2019
     */
    int deleteByExample(EventsStatementsHistoryLongExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table events_statements_history_long
     *
     * @mbg.generated Sat Dec 28 12:31:56 CST 2019
     */
    int insert(EventsStatementsHistoryLongWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table events_statements_history_long
     *
     * @mbg.generated Sat Dec 28 12:31:56 CST 2019
     */
    int insertSelective(EventsStatementsHistoryLongWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table events_statements_history_long
     *
     * @mbg.generated Sat Dec 28 12:31:56 CST 2019
     */
    List<EventsStatementsHistoryLongWithBLOBs> selectByExampleWithBLOBs(EventsStatementsHistoryLongExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table events_statements_history_long
     *
     * @mbg.generated Sat Dec 28 12:31:56 CST 2019
     */
    List<EventsStatementsHistoryLong> selectByExample(EventsStatementsHistoryLongExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table events_statements_history_long
     *
     * @mbg.generated Sat Dec 28 12:31:56 CST 2019
     */
    int updateByExampleSelective(@Param("record") EventsStatementsHistoryLongWithBLOBs record, @Param("example") EventsStatementsHistoryLongExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table events_statements_history_long
     *
     * @mbg.generated Sat Dec 28 12:31:56 CST 2019
     */
    int updateByExampleWithBLOBs(@Param("record") EventsStatementsHistoryLongWithBLOBs record, @Param("example") EventsStatementsHistoryLongExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table events_statements_history_long
     *
     * @mbg.generated Sat Dec 28 12:31:56 CST 2019
     */
    int updateByExample(@Param("record") EventsStatementsHistoryLong record, @Param("example") EventsStatementsHistoryLongExample example);
}