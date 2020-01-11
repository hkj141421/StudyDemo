package com.knight.Dao;

import com.knight.Bean.EventsTransactionsHistoryLong;
import com.knight.Bean.EventsTransactionsHistoryLongExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EventsTransactionsHistoryLongMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table events_transactions_history_long
     *
     * @mbg.generated Sat Dec 28 12:31:56 CST 2019
     */
    long countByExample(EventsTransactionsHistoryLongExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table events_transactions_history_long
     *
     * @mbg.generated Sat Dec 28 12:31:56 CST 2019
     */
    int deleteByExample(EventsTransactionsHistoryLongExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table events_transactions_history_long
     *
     * @mbg.generated Sat Dec 28 12:31:56 CST 2019
     */
    int insert(EventsTransactionsHistoryLong record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table events_transactions_history_long
     *
     * @mbg.generated Sat Dec 28 12:31:56 CST 2019
     */
    int insertSelective(EventsTransactionsHistoryLong record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table events_transactions_history_long
     *
     * @mbg.generated Sat Dec 28 12:31:56 CST 2019
     */
    List<EventsTransactionsHistoryLong> selectByExample(EventsTransactionsHistoryLongExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table events_transactions_history_long
     *
     * @mbg.generated Sat Dec 28 12:31:56 CST 2019
     */
    int updateByExampleSelective(@Param("record") EventsTransactionsHistoryLong record, @Param("example") EventsTransactionsHistoryLongExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table events_transactions_history_long
     *
     * @mbg.generated Sat Dec 28 12:31:56 CST 2019
     */
    int updateByExample(@Param("record") EventsTransactionsHistoryLong record, @Param("example") EventsTransactionsHistoryLongExample example);
}