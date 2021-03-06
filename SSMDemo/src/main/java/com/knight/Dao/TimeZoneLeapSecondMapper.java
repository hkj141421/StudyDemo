package com.knight.Dao;

import com.knight.Bean.TimeZoneLeapSecond;
import com.knight.Bean.TimeZoneLeapSecondExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TimeZoneLeapSecondMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table time_zone_leap_second
     *
     * @mbg.generated Sat Dec 28 12:31:55 CST 2019
     */
    long countByExample(TimeZoneLeapSecondExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table time_zone_leap_second
     *
     * @mbg.generated Sat Dec 28 12:31:55 CST 2019
     */
    int deleteByExample(TimeZoneLeapSecondExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table time_zone_leap_second
     *
     * @mbg.generated Sat Dec 28 12:31:55 CST 2019
     */
    int insert(TimeZoneLeapSecond record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table time_zone_leap_second
     *
     * @mbg.generated Sat Dec 28 12:31:55 CST 2019
     */
    int insertSelective(TimeZoneLeapSecond record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table time_zone_leap_second
     *
     * @mbg.generated Sat Dec 28 12:31:55 CST 2019
     */
    List<TimeZoneLeapSecond> selectByExample(TimeZoneLeapSecondExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table time_zone_leap_second
     *
     * @mbg.generated Sat Dec 28 12:31:55 CST 2019
     */
    int updateByExampleSelective(@Param("record") TimeZoneLeapSecond record, @Param("example") TimeZoneLeapSecondExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table time_zone_leap_second
     *
     * @mbg.generated Sat Dec 28 12:31:55 CST 2019
     */
    int updateByExample(@Param("record") TimeZoneLeapSecond record, @Param("example") TimeZoneLeapSecondExample example);
}