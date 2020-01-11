package com.knight.Dao;

import com.knight.Bean.TimeZoneName;
import com.knight.Bean.TimeZoneNameExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TimeZoneNameMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table time_zone_name
     *
     * @mbg.generated Sat Dec 28 12:31:56 CST 2019
     */
    long countByExample(TimeZoneNameExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table time_zone_name
     *
     * @mbg.generated Sat Dec 28 12:31:56 CST 2019
     */
    int deleteByExample(TimeZoneNameExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table time_zone_name
     *
     * @mbg.generated Sat Dec 28 12:31:56 CST 2019
     */
    int insert(TimeZoneName record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table time_zone_name
     *
     * @mbg.generated Sat Dec 28 12:31:56 CST 2019
     */
    int insertSelective(TimeZoneName record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table time_zone_name
     *
     * @mbg.generated Sat Dec 28 12:31:56 CST 2019
     */
    List<TimeZoneName> selectByExample(TimeZoneNameExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table time_zone_name
     *
     * @mbg.generated Sat Dec 28 12:31:56 CST 2019
     */
    int updateByExampleSelective(@Param("record") TimeZoneName record, @Param("example") TimeZoneNameExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table time_zone_name
     *
     * @mbg.generated Sat Dec 28 12:31:56 CST 2019
     */
    int updateByExample(@Param("record") TimeZoneName record, @Param("example") TimeZoneNameExample example);
}