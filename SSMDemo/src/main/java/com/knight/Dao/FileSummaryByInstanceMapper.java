package com.knight.Dao;

import com.knight.Bean.FileSummaryByInstance;
import com.knight.Bean.FileSummaryByInstanceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FileSummaryByInstanceMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table file_summary_by_instance
     *
     * @mbg.generated Sat Dec 28 12:31:56 CST 2019
     */
    long countByExample(FileSummaryByInstanceExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table file_summary_by_instance
     *
     * @mbg.generated Sat Dec 28 12:31:56 CST 2019
     */
    int deleteByExample(FileSummaryByInstanceExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table file_summary_by_instance
     *
     * @mbg.generated Sat Dec 28 12:31:56 CST 2019
     */
    int insert(FileSummaryByInstance record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table file_summary_by_instance
     *
     * @mbg.generated Sat Dec 28 12:31:56 CST 2019
     */
    int insertSelective(FileSummaryByInstance record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table file_summary_by_instance
     *
     * @mbg.generated Sat Dec 28 12:31:56 CST 2019
     */
    List<FileSummaryByInstance> selectByExample(FileSummaryByInstanceExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table file_summary_by_instance
     *
     * @mbg.generated Sat Dec 28 12:31:56 CST 2019
     */
    int updateByExampleSelective(@Param("record") FileSummaryByInstance record, @Param("example") FileSummaryByInstanceExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table file_summary_by_instance
     *
     * @mbg.generated Sat Dec 28 12:31:56 CST 2019
     */
    int updateByExample(@Param("record") FileSummaryByInstance record, @Param("example") FileSummaryByInstanceExample example);
}