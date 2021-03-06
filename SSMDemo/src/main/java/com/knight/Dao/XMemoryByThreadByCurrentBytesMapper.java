package com.knight.Dao;

import com.knight.Bean.XMemoryByThreadByCurrentBytes;
import com.knight.Bean.XMemoryByThreadByCurrentBytesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface XMemoryByThreadByCurrentBytesMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table x$memory_by_thread_by_current_bytes
     *
     * @mbg.generated Sat Dec 28 12:31:56 CST 2019
     */
    long countByExample(XMemoryByThreadByCurrentBytesExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table x$memory_by_thread_by_current_bytes
     *
     * @mbg.generated Sat Dec 28 12:31:56 CST 2019
     */
    int deleteByExample(XMemoryByThreadByCurrentBytesExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table x$memory_by_thread_by_current_bytes
     *
     * @mbg.generated Sat Dec 28 12:31:56 CST 2019
     */
    int insert(XMemoryByThreadByCurrentBytes record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table x$memory_by_thread_by_current_bytes
     *
     * @mbg.generated Sat Dec 28 12:31:56 CST 2019
     */
    int insertSelective(XMemoryByThreadByCurrentBytes record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table x$memory_by_thread_by_current_bytes
     *
     * @mbg.generated Sat Dec 28 12:31:56 CST 2019
     */
    List<XMemoryByThreadByCurrentBytes> selectByExample(XMemoryByThreadByCurrentBytesExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table x$memory_by_thread_by_current_bytes
     *
     * @mbg.generated Sat Dec 28 12:31:56 CST 2019
     */
    int updateByExampleSelective(@Param("record") XMemoryByThreadByCurrentBytes record, @Param("example") XMemoryByThreadByCurrentBytesExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table x$memory_by_thread_by_current_bytes
     *
     * @mbg.generated Sat Dec 28 12:31:56 CST 2019
     */
    int updateByExample(@Param("record") XMemoryByThreadByCurrentBytes record, @Param("example") XMemoryByThreadByCurrentBytesExample example);
}