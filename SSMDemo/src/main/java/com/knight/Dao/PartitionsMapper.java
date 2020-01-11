package com.knight.Dao;

import com.knight.Bean.Partitions;
import com.knight.Bean.PartitionsExample;
import com.knight.Bean.PartitionsWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PartitionsMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PARTITIONS
     *
     * @mbg.generated Sat Dec 28 12:31:56 CST 2019
     */
    long countByExample(PartitionsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PARTITIONS
     *
     * @mbg.generated Sat Dec 28 12:31:56 CST 2019
     */
    int deleteByExample(PartitionsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PARTITIONS
     *
     * @mbg.generated Sat Dec 28 12:31:56 CST 2019
     */
    int insert(PartitionsWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PARTITIONS
     *
     * @mbg.generated Sat Dec 28 12:31:56 CST 2019
     */
    int insertSelective(PartitionsWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PARTITIONS
     *
     * @mbg.generated Sat Dec 28 12:31:56 CST 2019
     */
    List<PartitionsWithBLOBs> selectByExampleWithBLOBs(PartitionsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PARTITIONS
     *
     * @mbg.generated Sat Dec 28 12:31:56 CST 2019
     */
    List<Partitions> selectByExample(PartitionsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PARTITIONS
     *
     * @mbg.generated Sat Dec 28 12:31:56 CST 2019
     */
    int updateByExampleSelective(@Param("record") PartitionsWithBLOBs record, @Param("example") PartitionsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PARTITIONS
     *
     * @mbg.generated Sat Dec 28 12:31:56 CST 2019
     */
    int updateByExampleWithBLOBs(@Param("record") PartitionsWithBLOBs record, @Param("example") PartitionsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PARTITIONS
     *
     * @mbg.generated Sat Dec 28 12:31:56 CST 2019
     */
    int updateByExample(@Param("record") Partitions record, @Param("example") PartitionsExample example);
}