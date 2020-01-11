package com.knight.Dao;

import com.knight.Bean.ReplicationApplierStatus;
import com.knight.Bean.ReplicationApplierStatusExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ReplicationApplierStatusMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table replication_applier_status
     *
     * @mbg.generated Sat Dec 28 12:31:56 CST 2019
     */
    long countByExample(ReplicationApplierStatusExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table replication_applier_status
     *
     * @mbg.generated Sat Dec 28 12:31:56 CST 2019
     */
    int deleteByExample(ReplicationApplierStatusExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table replication_applier_status
     *
     * @mbg.generated Sat Dec 28 12:31:56 CST 2019
     */
    int insert(ReplicationApplierStatus record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table replication_applier_status
     *
     * @mbg.generated Sat Dec 28 12:31:56 CST 2019
     */
    int insertSelective(ReplicationApplierStatus record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table replication_applier_status
     *
     * @mbg.generated Sat Dec 28 12:31:56 CST 2019
     */
    List<ReplicationApplierStatus> selectByExample(ReplicationApplierStatusExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table replication_applier_status
     *
     * @mbg.generated Sat Dec 28 12:31:56 CST 2019
     */
    int updateByExampleSelective(@Param("record") ReplicationApplierStatus record, @Param("example") ReplicationApplierStatusExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table replication_applier_status
     *
     * @mbg.generated Sat Dec 28 12:31:56 CST 2019
     */
    int updateByExample(@Param("record") ReplicationApplierStatus record, @Param("example") ReplicationApplierStatusExample example);
}