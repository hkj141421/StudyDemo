package com.knight.Dao;

import com.knight.Bean.EventsTransactionsCurrent;
import com.knight.Bean.EventsTransactionsCurrentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EventsTransactionsCurrentMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table events_transactions_current
     *
     * @mbg.generated Sat Dec 28 12:31:55 CST 2019
     */
    long countByExample(EventsTransactionsCurrentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table events_transactions_current
     *
     * @mbg.generated Sat Dec 28 12:31:55 CST 2019
     */
    int deleteByExample(EventsTransactionsCurrentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table events_transactions_current
     *
     * @mbg.generated Sat Dec 28 12:31:55 CST 2019
     */
    int insert(EventsTransactionsCurrent record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table events_transactions_current
     *
     * @mbg.generated Sat Dec 28 12:31:55 CST 2019
     */
    int insertSelective(EventsTransactionsCurrent record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table events_transactions_current
     *
     * @mbg.generated Sat Dec 28 12:31:55 CST 2019
     */
    List<EventsTransactionsCurrent> selectByExample(EventsTransactionsCurrentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table events_transactions_current
     *
     * @mbg.generated Sat Dec 28 12:31:55 CST 2019
     */
    int updateByExampleSelective(@Param("record") EventsTransactionsCurrent record, @Param("example") EventsTransactionsCurrentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table events_transactions_current
     *
     * @mbg.generated Sat Dec 28 12:31:55 CST 2019
     */
    int updateByExample(@Param("record") EventsTransactionsCurrent record, @Param("example") EventsTransactionsCurrentExample example);
}