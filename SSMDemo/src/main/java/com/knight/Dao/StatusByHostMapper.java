package com.knight.Dao;

import com.knight.Bean.StatusByHost;
import com.knight.Bean.StatusByHostExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StatusByHostMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table status_by_host
     *
     * @mbg.generated Sat Dec 28 12:31:56 CST 2019
     */
    long countByExample(StatusByHostExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table status_by_host
     *
     * @mbg.generated Sat Dec 28 12:31:56 CST 2019
     */
    int deleteByExample(StatusByHostExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table status_by_host
     *
     * @mbg.generated Sat Dec 28 12:31:56 CST 2019
     */
    int insert(StatusByHost record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table status_by_host
     *
     * @mbg.generated Sat Dec 28 12:31:56 CST 2019
     */
    int insertSelective(StatusByHost record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table status_by_host
     *
     * @mbg.generated Sat Dec 28 12:31:56 CST 2019
     */
    List<StatusByHost> selectByExample(StatusByHostExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table status_by_host
     *
     * @mbg.generated Sat Dec 28 12:31:56 CST 2019
     */
    int updateByExampleSelective(@Param("record") StatusByHost record, @Param("example") StatusByHostExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table status_by_host
     *
     * @mbg.generated Sat Dec 28 12:31:56 CST 2019
     */
    int updateByExample(@Param("record") StatusByHost record, @Param("example") StatusByHostExample example);
}