package com.knight.Dao;

import com.knight.Bean.StatusByUser;
import com.knight.Bean.StatusByUserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StatusByUserMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table status_by_user
     *
     * @mbg.generated Sat Dec 28 12:31:56 CST 2019
     */
    long countByExample(StatusByUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table status_by_user
     *
     * @mbg.generated Sat Dec 28 12:31:56 CST 2019
     */
    int deleteByExample(StatusByUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table status_by_user
     *
     * @mbg.generated Sat Dec 28 12:31:56 CST 2019
     */
    int insert(StatusByUser record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table status_by_user
     *
     * @mbg.generated Sat Dec 28 12:31:56 CST 2019
     */
    int insertSelective(StatusByUser record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table status_by_user
     *
     * @mbg.generated Sat Dec 28 12:31:56 CST 2019
     */
    List<StatusByUser> selectByExample(StatusByUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table status_by_user
     *
     * @mbg.generated Sat Dec 28 12:31:56 CST 2019
     */
    int updateByExampleSelective(@Param("record") StatusByUser record, @Param("example") StatusByUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table status_by_user
     *
     * @mbg.generated Sat Dec 28 12:31:56 CST 2019
     */
    int updateByExample(@Param("record") StatusByUser record, @Param("example") StatusByUserExample example);
}