package com.knight.Dao;

import com.knight.Bean.ReplicationConnectionStatus;
import com.knight.Bean.ReplicationConnectionStatusExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ReplicationConnectionStatusMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table replication_connection_status
     *
     * @mbg.generated Sat Dec 28 12:31:56 CST 2019
     */
    long countByExample(ReplicationConnectionStatusExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table replication_connection_status
     *
     * @mbg.generated Sat Dec 28 12:31:56 CST 2019
     */
    int deleteByExample(ReplicationConnectionStatusExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table replication_connection_status
     *
     * @mbg.generated Sat Dec 28 12:31:56 CST 2019
     */
    int insert(ReplicationConnectionStatus record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table replication_connection_status
     *
     * @mbg.generated Sat Dec 28 12:31:56 CST 2019
     */
    int insertSelective(ReplicationConnectionStatus record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table replication_connection_status
     *
     * @mbg.generated Sat Dec 28 12:31:56 CST 2019
     */
    List<ReplicationConnectionStatus> selectByExampleWithBLOBs(ReplicationConnectionStatusExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table replication_connection_status
     *
     * @mbg.generated Sat Dec 28 12:31:56 CST 2019
     */
    List<ReplicationConnectionStatus> selectByExample(ReplicationConnectionStatusExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table replication_connection_status
     *
     * @mbg.generated Sat Dec 28 12:31:56 CST 2019
     */
    int updateByExampleSelective(@Param("record") ReplicationConnectionStatus record, @Param("example") ReplicationConnectionStatusExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table replication_connection_status
     *
     * @mbg.generated Sat Dec 28 12:31:56 CST 2019
     */
    int updateByExampleWithBLOBs(@Param("record") ReplicationConnectionStatus record, @Param("example") ReplicationConnectionStatusExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table replication_connection_status
     *
     * @mbg.generated Sat Dec 28 12:31:56 CST 2019
     */
    int updateByExample(@Param("record") ReplicationConnectionStatus record, @Param("example") ReplicationConnectionStatusExample example);
}