package com.knight.Dao;

import com.knight.Bean.XLatestFileIo;
import com.knight.Bean.XLatestFileIoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface XLatestFileIoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table x$latest_file_io
     *
     * @mbg.generated Sat Dec 28 12:31:55 CST 2019
     */
    long countByExample(XLatestFileIoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table x$latest_file_io
     *
     * @mbg.generated Sat Dec 28 12:31:55 CST 2019
     */
    int deleteByExample(XLatestFileIoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table x$latest_file_io
     *
     * @mbg.generated Sat Dec 28 12:31:55 CST 2019
     */
    int insert(XLatestFileIo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table x$latest_file_io
     *
     * @mbg.generated Sat Dec 28 12:31:55 CST 2019
     */
    int insertSelective(XLatestFileIo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table x$latest_file_io
     *
     * @mbg.generated Sat Dec 28 12:31:55 CST 2019
     */
    List<XLatestFileIo> selectByExample(XLatestFileIoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table x$latest_file_io
     *
     * @mbg.generated Sat Dec 28 12:31:55 CST 2019
     */
    int updateByExampleSelective(@Param("record") XLatestFileIo record, @Param("example") XLatestFileIoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table x$latest_file_io
     *
     * @mbg.generated Sat Dec 28 12:31:55 CST 2019
     */
    int updateByExample(@Param("record") XLatestFileIo record, @Param("example") XLatestFileIoExample example);
}