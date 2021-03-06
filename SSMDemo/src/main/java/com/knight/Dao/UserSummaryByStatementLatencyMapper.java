package com.knight.Dao;

import com.knight.Bean.UserSummaryByStatementLatency;
import com.knight.Bean.UserSummaryByStatementLatencyExample;
import com.knight.Bean.UserSummaryByStatementLatencyWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserSummaryByStatementLatencyMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_summary_by_statement_latency
     *
     * @mbg.generated Sat Dec 28 12:31:56 CST 2019
     */
    long countByExample(UserSummaryByStatementLatencyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_summary_by_statement_latency
     *
     * @mbg.generated Sat Dec 28 12:31:56 CST 2019
     */
    int deleteByExample(UserSummaryByStatementLatencyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_summary_by_statement_latency
     *
     * @mbg.generated Sat Dec 28 12:31:56 CST 2019
     */
    int insert(UserSummaryByStatementLatencyWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_summary_by_statement_latency
     *
     * @mbg.generated Sat Dec 28 12:31:56 CST 2019
     */
    int insertSelective(UserSummaryByStatementLatencyWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_summary_by_statement_latency
     *
     * @mbg.generated Sat Dec 28 12:31:56 CST 2019
     */
    List<UserSummaryByStatementLatencyWithBLOBs> selectByExampleWithBLOBs(UserSummaryByStatementLatencyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_summary_by_statement_latency
     *
     * @mbg.generated Sat Dec 28 12:31:56 CST 2019
     */
    List<UserSummaryByStatementLatency> selectByExample(UserSummaryByStatementLatencyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_summary_by_statement_latency
     *
     * @mbg.generated Sat Dec 28 12:31:56 CST 2019
     */
    int updateByExampleSelective(@Param("record") UserSummaryByStatementLatencyWithBLOBs record, @Param("example") UserSummaryByStatementLatencyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_summary_by_statement_latency
     *
     * @mbg.generated Sat Dec 28 12:31:56 CST 2019
     */
    int updateByExampleWithBLOBs(@Param("record") UserSummaryByStatementLatencyWithBLOBs record, @Param("example") UserSummaryByStatementLatencyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_summary_by_statement_latency
     *
     * @mbg.generated Sat Dec 28 12:31:56 CST 2019
     */
    int updateByExample(@Param("record") UserSummaryByStatementLatency record, @Param("example") UserSummaryByStatementLatencyExample example);
}