package com.knight.Dao;

import com.knight.Bean.XHostSummary;
import com.knight.Bean.XHostSummaryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface XHostSummaryMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table x$host_summary
     *
     * @mbg.generated Sat Dec 28 12:31:56 CST 2019
     */
    long countByExample(XHostSummaryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table x$host_summary
     *
     * @mbg.generated Sat Dec 28 12:31:56 CST 2019
     */
    int deleteByExample(XHostSummaryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table x$host_summary
     *
     * @mbg.generated Sat Dec 28 12:31:56 CST 2019
     */
    int insert(XHostSummary record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table x$host_summary
     *
     * @mbg.generated Sat Dec 28 12:31:56 CST 2019
     */
    int insertSelective(XHostSummary record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table x$host_summary
     *
     * @mbg.generated Sat Dec 28 12:31:56 CST 2019
     */
    List<XHostSummary> selectByExample(XHostSummaryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table x$host_summary
     *
     * @mbg.generated Sat Dec 28 12:31:56 CST 2019
     */
    int updateByExampleSelective(@Param("record") XHostSummary record, @Param("example") XHostSummaryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table x$host_summary
     *
     * @mbg.generated Sat Dec 28 12:31:56 CST 2019
     */
    int updateByExample(@Param("record") XHostSummary record, @Param("example") XHostSummaryExample example);
}