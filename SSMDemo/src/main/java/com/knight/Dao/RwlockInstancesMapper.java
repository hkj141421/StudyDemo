package com.knight.Dao;

import com.knight.Bean.RwlockInstances;
import com.knight.Bean.RwlockInstancesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RwlockInstancesMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rwlock_instances
     *
     * @mbg.generated Sat Dec 28 12:31:56 CST 2019
     */
    long countByExample(RwlockInstancesExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rwlock_instances
     *
     * @mbg.generated Sat Dec 28 12:31:56 CST 2019
     */
    int deleteByExample(RwlockInstancesExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rwlock_instances
     *
     * @mbg.generated Sat Dec 28 12:31:56 CST 2019
     */
    int insert(RwlockInstances record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rwlock_instances
     *
     * @mbg.generated Sat Dec 28 12:31:56 CST 2019
     */
    int insertSelective(RwlockInstances record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rwlock_instances
     *
     * @mbg.generated Sat Dec 28 12:31:56 CST 2019
     */
    List<RwlockInstances> selectByExample(RwlockInstancesExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rwlock_instances
     *
     * @mbg.generated Sat Dec 28 12:31:56 CST 2019
     */
    int updateByExampleSelective(@Param("record") RwlockInstances record, @Param("example") RwlockInstancesExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rwlock_instances
     *
     * @mbg.generated Sat Dec 28 12:31:56 CST 2019
     */
    int updateByExample(@Param("record") RwlockInstances record, @Param("example") RwlockInstancesExample example);
}