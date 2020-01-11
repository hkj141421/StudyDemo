package com.knight.Dao;

import com.knight.Bean.XSchemaIndexStatistics;
import com.knight.Bean.XSchemaIndexStatisticsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface XSchemaIndexStatisticsMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table x$schema_index_statistics
     *
     * @mbg.generated Sat Dec 28 12:31:56 CST 2019
     */
    long countByExample(XSchemaIndexStatisticsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table x$schema_index_statistics
     *
     * @mbg.generated Sat Dec 28 12:31:56 CST 2019
     */
    int deleteByExample(XSchemaIndexStatisticsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table x$schema_index_statistics
     *
     * @mbg.generated Sat Dec 28 12:31:56 CST 2019
     */
    int insert(XSchemaIndexStatistics record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table x$schema_index_statistics
     *
     * @mbg.generated Sat Dec 28 12:31:56 CST 2019
     */
    int insertSelective(XSchemaIndexStatistics record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table x$schema_index_statistics
     *
     * @mbg.generated Sat Dec 28 12:31:56 CST 2019
     */
    List<XSchemaIndexStatistics> selectByExample(XSchemaIndexStatisticsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table x$schema_index_statistics
     *
     * @mbg.generated Sat Dec 28 12:31:56 CST 2019
     */
    int updateByExampleSelective(@Param("record") XSchemaIndexStatistics record, @Param("example") XSchemaIndexStatisticsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table x$schema_index_statistics
     *
     * @mbg.generated Sat Dec 28 12:31:56 CST 2019
     */
    int updateByExample(@Param("record") XSchemaIndexStatistics record, @Param("example") XSchemaIndexStatisticsExample example);
}