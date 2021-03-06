package com.knight.Dao;

import com.knight.Bean.SetupObjects;
import com.knight.Bean.SetupObjectsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SetupObjectsMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table setup_objects
     *
     * @mbg.generated Sat Dec 28 12:31:56 CST 2019
     */
    long countByExample(SetupObjectsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table setup_objects
     *
     * @mbg.generated Sat Dec 28 12:31:56 CST 2019
     */
    int deleteByExample(SetupObjectsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table setup_objects
     *
     * @mbg.generated Sat Dec 28 12:31:56 CST 2019
     */
    int insert(SetupObjects record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table setup_objects
     *
     * @mbg.generated Sat Dec 28 12:31:56 CST 2019
     */
    int insertSelective(SetupObjects record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table setup_objects
     *
     * @mbg.generated Sat Dec 28 12:31:56 CST 2019
     */
    List<SetupObjects> selectByExample(SetupObjectsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table setup_objects
     *
     * @mbg.generated Sat Dec 28 12:31:56 CST 2019
     */
    int updateByExampleSelective(@Param("record") SetupObjects record, @Param("example") SetupObjectsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table setup_objects
     *
     * @mbg.generated Sat Dec 28 12:31:56 CST 2019
     */
    int updateByExample(@Param("record") SetupObjects record, @Param("example") SetupObjectsExample example);
}