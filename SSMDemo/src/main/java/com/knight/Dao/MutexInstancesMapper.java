package com.knight.Dao;

import com.knight.Bean.MutexInstances;
import com.knight.Bean.MutexInstancesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MutexInstancesMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mutex_instances
     *
     * @mbg.generated Sat Dec 28 12:31:56 CST 2019
     */
    long countByExample(MutexInstancesExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mutex_instances
     *
     * @mbg.generated Sat Dec 28 12:31:56 CST 2019
     */
    int deleteByExample(MutexInstancesExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mutex_instances
     *
     * @mbg.generated Sat Dec 28 12:31:56 CST 2019
     */
    int insert(MutexInstances record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mutex_instances
     *
     * @mbg.generated Sat Dec 28 12:31:56 CST 2019
     */
    int insertSelective(MutexInstances record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mutex_instances
     *
     * @mbg.generated Sat Dec 28 12:31:56 CST 2019
     */
    List<MutexInstances> selectByExample(MutexInstancesExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mutex_instances
     *
     * @mbg.generated Sat Dec 28 12:31:56 CST 2019
     */
    int updateByExampleSelective(@Param("record") MutexInstances record, @Param("example") MutexInstancesExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mutex_instances
     *
     * @mbg.generated Sat Dec 28 12:31:56 CST 2019
     */
    int updateByExample(@Param("record") MutexInstances record, @Param("example") MutexInstancesExample example);
}