package com.knight.Dao;

import com.knight.Bean.XMemoryByUserByCurrentBytes;
import com.knight.Bean.XMemoryByUserByCurrentBytesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface XMemoryByUserByCurrentBytesMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table x$memory_by_user_by_current_bytes
     *
     * @mbg.generated Sat Dec 28 12:31:56 CST 2019
     */
    long countByExample(XMemoryByUserByCurrentBytesExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table x$memory_by_user_by_current_bytes
     *
     * @mbg.generated Sat Dec 28 12:31:56 CST 2019
     */
    int deleteByExample(XMemoryByUserByCurrentBytesExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table x$memory_by_user_by_current_bytes
     *
     * @mbg.generated Sat Dec 28 12:31:56 CST 2019
     */
    int insert(XMemoryByUserByCurrentBytes record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table x$memory_by_user_by_current_bytes
     *
     * @mbg.generated Sat Dec 28 12:31:56 CST 2019
     */
    int insertSelective(XMemoryByUserByCurrentBytes record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table x$memory_by_user_by_current_bytes
     *
     * @mbg.generated Sat Dec 28 12:31:56 CST 2019
     */
    List<XMemoryByUserByCurrentBytes> selectByExample(XMemoryByUserByCurrentBytesExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table x$memory_by_user_by_current_bytes
     *
     * @mbg.generated Sat Dec 28 12:31:56 CST 2019
     */
    int updateByExampleSelective(@Param("record") XMemoryByUserByCurrentBytes record, @Param("example") XMemoryByUserByCurrentBytesExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table x$memory_by_user_by_current_bytes
     *
     * @mbg.generated Sat Dec 28 12:31:56 CST 2019
     */
    int updateByExample(@Param("record") XMemoryByUserByCurrentBytes record, @Param("example") XMemoryByUserByCurrentBytesExample example);
}