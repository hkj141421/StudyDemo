package com.knight.Dao;

import com.knight.Bean.XMemoryGlobalTotal;
import com.knight.Bean.XMemoryGlobalTotalExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface XMemoryGlobalTotalMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table x$memory_global_total
     *
     * @mbg.generated Sat Dec 28 12:31:56 CST 2019
     */
    long countByExample(XMemoryGlobalTotalExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table x$memory_global_total
     *
     * @mbg.generated Sat Dec 28 12:31:56 CST 2019
     */
    int deleteByExample(XMemoryGlobalTotalExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table x$memory_global_total
     *
     * @mbg.generated Sat Dec 28 12:31:56 CST 2019
     */
    int insert(XMemoryGlobalTotal record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table x$memory_global_total
     *
     * @mbg.generated Sat Dec 28 12:31:56 CST 2019
     */
    int insertSelective(XMemoryGlobalTotal record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table x$memory_global_total
     *
     * @mbg.generated Sat Dec 28 12:31:56 CST 2019
     */
    List<XMemoryGlobalTotal> selectByExample(XMemoryGlobalTotalExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table x$memory_global_total
     *
     * @mbg.generated Sat Dec 28 12:31:56 CST 2019
     */
    int updateByExampleSelective(@Param("record") XMemoryGlobalTotal record, @Param("example") XMemoryGlobalTotalExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table x$memory_global_total
     *
     * @mbg.generated Sat Dec 28 12:31:56 CST 2019
     */
    int updateByExample(@Param("record") XMemoryGlobalTotal record, @Param("example") XMemoryGlobalTotalExample example);
}