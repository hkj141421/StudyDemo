package com.knight.Dao;

import com.knight.Bean.TrackDeatilV;
import com.knight.Bean.TrackDeatilVExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TrackDeatilVMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table track_deatil_v
     *
     * @mbg.generated Sat Dec 28 12:31:56 CST 2019
     */
    long countByExample(TrackDeatilVExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table track_deatil_v
     *
     * @mbg.generated Sat Dec 28 12:31:56 CST 2019
     */
    int deleteByExample(TrackDeatilVExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table track_deatil_v
     *
     * @mbg.generated Sat Dec 28 12:31:56 CST 2019
     */
    int insert(TrackDeatilV record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table track_deatil_v
     *
     * @mbg.generated Sat Dec 28 12:31:56 CST 2019
     */
    int insertSelective(TrackDeatilV record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table track_deatil_v
     *
     * @mbg.generated Sat Dec 28 12:31:56 CST 2019
     */
    List<TrackDeatilV> selectByExampleWithBLOBs(TrackDeatilVExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table track_deatil_v
     *
     * @mbg.generated Sat Dec 28 12:31:56 CST 2019
     */
    List<TrackDeatilV> selectByExample(TrackDeatilVExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table track_deatil_v
     *
     * @mbg.generated Sat Dec 28 12:31:56 CST 2019
     */
    int updateByExampleSelective(@Param("record") TrackDeatilV record, @Param("example") TrackDeatilVExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table track_deatil_v
     *
     * @mbg.generated Sat Dec 28 12:31:56 CST 2019
     */
    int updateByExampleWithBLOBs(@Param("record") TrackDeatilV record, @Param("example") TrackDeatilVExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table track_deatil_v
     *
     * @mbg.generated Sat Dec 28 12:31:56 CST 2019
     */
    int updateByExample(@Param("record") TrackDeatilV record, @Param("example") TrackDeatilVExample example);
}