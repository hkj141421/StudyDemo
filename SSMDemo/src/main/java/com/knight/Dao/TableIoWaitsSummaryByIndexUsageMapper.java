package com.knight.Dao;

import com.knight.Bean.TableIoWaitsSummaryByIndexUsage;
import com.knight.Bean.TableIoWaitsSummaryByIndexUsageExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TableIoWaitsSummaryByIndexUsageMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table table_io_waits_summary_by_index_usage
     *
     * @mbg.generated Sat Dec 28 12:31:56 CST 2019
     */
    long countByExample(TableIoWaitsSummaryByIndexUsageExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table table_io_waits_summary_by_index_usage
     *
     * @mbg.generated Sat Dec 28 12:31:56 CST 2019
     */
    int deleteByExample(TableIoWaitsSummaryByIndexUsageExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table table_io_waits_summary_by_index_usage
     *
     * @mbg.generated Sat Dec 28 12:31:56 CST 2019
     */
    int insert(TableIoWaitsSummaryByIndexUsage record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table table_io_waits_summary_by_index_usage
     *
     * @mbg.generated Sat Dec 28 12:31:56 CST 2019
     */
    int insertSelective(TableIoWaitsSummaryByIndexUsage record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table table_io_waits_summary_by_index_usage
     *
     * @mbg.generated Sat Dec 28 12:31:56 CST 2019
     */
    List<TableIoWaitsSummaryByIndexUsage> selectByExample(TableIoWaitsSummaryByIndexUsageExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table table_io_waits_summary_by_index_usage
     *
     * @mbg.generated Sat Dec 28 12:31:56 CST 2019
     */
    int updateByExampleSelective(@Param("record") TableIoWaitsSummaryByIndexUsage record, @Param("example") TableIoWaitsSummaryByIndexUsageExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table table_io_waits_summary_by_index_usage
     *
     * @mbg.generated Sat Dec 28 12:31:56 CST 2019
     */
    int updateByExample(@Param("record") TableIoWaitsSummaryByIndexUsage record, @Param("example") TableIoWaitsSummaryByIndexUsageExample example);
}