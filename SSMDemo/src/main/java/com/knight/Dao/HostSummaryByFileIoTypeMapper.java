package com.knight.Dao;

import com.knight.Bean.HostSummaryByFileIoType;
import com.knight.Bean.HostSummaryByFileIoTypeExample;
import com.knight.Bean.HostSummaryByFileIoTypeWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HostSummaryByFileIoTypeMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table host_summary_by_file_io_type
     *
     * @mbg.generated Sat Dec 28 12:31:56 CST 2019
     */
    long countByExample(HostSummaryByFileIoTypeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table host_summary_by_file_io_type
     *
     * @mbg.generated Sat Dec 28 12:31:56 CST 2019
     */
    int deleteByExample(HostSummaryByFileIoTypeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table host_summary_by_file_io_type
     *
     * @mbg.generated Sat Dec 28 12:31:56 CST 2019
     */
    int insert(HostSummaryByFileIoTypeWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table host_summary_by_file_io_type
     *
     * @mbg.generated Sat Dec 28 12:31:56 CST 2019
     */
    int insertSelective(HostSummaryByFileIoTypeWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table host_summary_by_file_io_type
     *
     * @mbg.generated Sat Dec 28 12:31:56 CST 2019
     */
    List<HostSummaryByFileIoTypeWithBLOBs> selectByExampleWithBLOBs(HostSummaryByFileIoTypeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table host_summary_by_file_io_type
     *
     * @mbg.generated Sat Dec 28 12:31:56 CST 2019
     */
    List<HostSummaryByFileIoType> selectByExample(HostSummaryByFileIoTypeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table host_summary_by_file_io_type
     *
     * @mbg.generated Sat Dec 28 12:31:56 CST 2019
     */
    int updateByExampleSelective(@Param("record") HostSummaryByFileIoTypeWithBLOBs record, @Param("example") HostSummaryByFileIoTypeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table host_summary_by_file_io_type
     *
     * @mbg.generated Sat Dec 28 12:31:56 CST 2019
     */
    int updateByExampleWithBLOBs(@Param("record") HostSummaryByFileIoTypeWithBLOBs record, @Param("example") HostSummaryByFileIoTypeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table host_summary_by_file_io_type
     *
     * @mbg.generated Sat Dec 28 12:31:56 CST 2019
     */
    int updateByExample(@Param("record") HostSummaryByFileIoType record, @Param("example") HostSummaryByFileIoTypeExample example);
}