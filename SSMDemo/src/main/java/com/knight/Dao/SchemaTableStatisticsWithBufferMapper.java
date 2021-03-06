package com.knight.Dao;

import com.knight.Bean.SchemaTableStatisticsWithBuffer;
import com.knight.Bean.SchemaTableStatisticsWithBufferExample;
import com.knight.Bean.SchemaTableStatisticsWithBufferWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SchemaTableStatisticsWithBufferMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table schema_table_statistics_with_buffer
     *
     * @mbg.generated Sat Dec 28 12:31:56 CST 2019
     */
    long countByExample(SchemaTableStatisticsWithBufferExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table schema_table_statistics_with_buffer
     *
     * @mbg.generated Sat Dec 28 12:31:56 CST 2019
     */
    int deleteByExample(SchemaTableStatisticsWithBufferExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table schema_table_statistics_with_buffer
     *
     * @mbg.generated Sat Dec 28 12:31:56 CST 2019
     */
    int insert(SchemaTableStatisticsWithBufferWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table schema_table_statistics_with_buffer
     *
     * @mbg.generated Sat Dec 28 12:31:56 CST 2019
     */
    int insertSelective(SchemaTableStatisticsWithBufferWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table schema_table_statistics_with_buffer
     *
     * @mbg.generated Sat Dec 28 12:31:56 CST 2019
     */
    List<SchemaTableStatisticsWithBufferWithBLOBs> selectByExampleWithBLOBs(SchemaTableStatisticsWithBufferExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table schema_table_statistics_with_buffer
     *
     * @mbg.generated Sat Dec 28 12:31:56 CST 2019
     */
    List<SchemaTableStatisticsWithBuffer> selectByExample(SchemaTableStatisticsWithBufferExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table schema_table_statistics_with_buffer
     *
     * @mbg.generated Sat Dec 28 12:31:56 CST 2019
     */
    int updateByExampleSelective(@Param("record") SchemaTableStatisticsWithBufferWithBLOBs record, @Param("example") SchemaTableStatisticsWithBufferExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table schema_table_statistics_with_buffer
     *
     * @mbg.generated Sat Dec 28 12:31:56 CST 2019
     */
    int updateByExampleWithBLOBs(@Param("record") SchemaTableStatisticsWithBufferWithBLOBs record, @Param("example") SchemaTableStatisticsWithBufferExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table schema_table_statistics_with_buffer
     *
     * @mbg.generated Sat Dec 28 12:31:56 CST 2019
     */
    int updateByExample(@Param("record") SchemaTableStatisticsWithBuffer record, @Param("example") SchemaTableStatisticsWithBufferExample example);
}