package com.knight.Dao;

import com.knight.Bean.IoGlobalByFileByBytes;
import com.knight.Bean.IoGlobalByFileByBytesExample;
import com.knight.Bean.IoGlobalByFileByBytesWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface IoGlobalByFileByBytesMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table io_global_by_file_by_bytes
     *
     * @mbg.generated Sat Dec 28 12:31:56 CST 2019
     */
    long countByExample(IoGlobalByFileByBytesExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table io_global_by_file_by_bytes
     *
     * @mbg.generated Sat Dec 28 12:31:56 CST 2019
     */
    int deleteByExample(IoGlobalByFileByBytesExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table io_global_by_file_by_bytes
     *
     * @mbg.generated Sat Dec 28 12:31:56 CST 2019
     */
    int insert(IoGlobalByFileByBytesWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table io_global_by_file_by_bytes
     *
     * @mbg.generated Sat Dec 28 12:31:56 CST 2019
     */
    int insertSelective(IoGlobalByFileByBytesWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table io_global_by_file_by_bytes
     *
     * @mbg.generated Sat Dec 28 12:31:56 CST 2019
     */
    List<IoGlobalByFileByBytesWithBLOBs> selectByExampleWithBLOBs(IoGlobalByFileByBytesExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table io_global_by_file_by_bytes
     *
     * @mbg.generated Sat Dec 28 12:31:56 CST 2019
     */
    List<IoGlobalByFileByBytes> selectByExample(IoGlobalByFileByBytesExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table io_global_by_file_by_bytes
     *
     * @mbg.generated Sat Dec 28 12:31:56 CST 2019
     */
    int updateByExampleSelective(@Param("record") IoGlobalByFileByBytesWithBLOBs record, @Param("example") IoGlobalByFileByBytesExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table io_global_by_file_by_bytes
     *
     * @mbg.generated Sat Dec 28 12:31:56 CST 2019
     */
    int updateByExampleWithBLOBs(@Param("record") IoGlobalByFileByBytesWithBLOBs record, @Param("example") IoGlobalByFileByBytesExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table io_global_by_file_by_bytes
     *
     * @mbg.generated Sat Dec 28 12:31:56 CST 2019
     */
    int updateByExample(@Param("record") IoGlobalByFileByBytes record, @Param("example") IoGlobalByFileByBytesExample example);
}