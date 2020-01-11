package com.knight.Dao;

import com.knight.Bean.SlaveMasterInfo;
import com.knight.Bean.SlaveMasterInfoExample;
import com.knight.Bean.SlaveMasterInfoWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SlaveMasterInfoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table slave_master_info
     *
     * @mbg.generated Sat Dec 28 12:31:55 CST 2019
     */
    long countByExample(SlaveMasterInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table slave_master_info
     *
     * @mbg.generated Sat Dec 28 12:31:55 CST 2019
     */
    int deleteByExample(SlaveMasterInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table slave_master_info
     *
     * @mbg.generated Sat Dec 28 12:31:55 CST 2019
     */
    int insert(SlaveMasterInfoWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table slave_master_info
     *
     * @mbg.generated Sat Dec 28 12:31:55 CST 2019
     */
    int insertSelective(SlaveMasterInfoWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table slave_master_info
     *
     * @mbg.generated Sat Dec 28 12:31:55 CST 2019
     */
    List<SlaveMasterInfoWithBLOBs> selectByExampleWithBLOBs(SlaveMasterInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table slave_master_info
     *
     * @mbg.generated Sat Dec 28 12:31:55 CST 2019
     */
    List<SlaveMasterInfo> selectByExample(SlaveMasterInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table slave_master_info
     *
     * @mbg.generated Sat Dec 28 12:31:55 CST 2019
     */
    int updateByExampleSelective(@Param("record") SlaveMasterInfoWithBLOBs record, @Param("example") SlaveMasterInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table slave_master_info
     *
     * @mbg.generated Sat Dec 28 12:31:55 CST 2019
     */
    int updateByExampleWithBLOBs(@Param("record") SlaveMasterInfoWithBLOBs record, @Param("example") SlaveMasterInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table slave_master_info
     *
     * @mbg.generated Sat Dec 28 12:31:55 CST 2019
     */
    int updateByExample(@Param("record") SlaveMasterInfo record, @Param("example") SlaveMasterInfoExample example);
}