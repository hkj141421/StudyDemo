package com.knight.Dao;

import com.knight.Bean.TableConstraints;
import com.knight.Bean.TableConstraintsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TableConstraintsMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TABLE_CONSTRAINTS
     *
     * @mbg.generated Sat Dec 28 12:31:55 CST 2019
     */
    long countByExample(TableConstraintsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TABLE_CONSTRAINTS
     *
     * @mbg.generated Sat Dec 28 12:31:55 CST 2019
     */
    int deleteByExample(TableConstraintsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TABLE_CONSTRAINTS
     *
     * @mbg.generated Sat Dec 28 12:31:55 CST 2019
     */
    int insert(TableConstraints record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TABLE_CONSTRAINTS
     *
     * @mbg.generated Sat Dec 28 12:31:55 CST 2019
     */
    int insertSelective(TableConstraints record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TABLE_CONSTRAINTS
     *
     * @mbg.generated Sat Dec 28 12:31:55 CST 2019
     */
    List<TableConstraints> selectByExample(TableConstraintsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TABLE_CONSTRAINTS
     *
     * @mbg.generated Sat Dec 28 12:31:55 CST 2019
     */
    int updateByExampleSelective(@Param("record") TableConstraints record, @Param("example") TableConstraintsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TABLE_CONSTRAINTS
     *
     * @mbg.generated Sat Dec 28 12:31:55 CST 2019
     */
    int updateByExample(@Param("record") TableConstraints record, @Param("example") TableConstraintsExample example);
}