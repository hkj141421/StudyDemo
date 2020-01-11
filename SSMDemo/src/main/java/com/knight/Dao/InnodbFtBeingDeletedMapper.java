package com.knight.Dao;

import com.knight.Bean.InnodbFtBeingDeleted;
import com.knight.Bean.InnodbFtBeingDeletedExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface InnodbFtBeingDeletedMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table INNODB_FT_BEING_DELETED
     *
     * @mbg.generated Sat Dec 28 12:31:56 CST 2019
     */
    long countByExample(InnodbFtBeingDeletedExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table INNODB_FT_BEING_DELETED
     *
     * @mbg.generated Sat Dec 28 12:31:56 CST 2019
     */
    int deleteByExample(InnodbFtBeingDeletedExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table INNODB_FT_BEING_DELETED
     *
     * @mbg.generated Sat Dec 28 12:31:56 CST 2019
     */
    int insert(InnodbFtBeingDeleted record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table INNODB_FT_BEING_DELETED
     *
     * @mbg.generated Sat Dec 28 12:31:56 CST 2019
     */
    int insertSelective(InnodbFtBeingDeleted record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table INNODB_FT_BEING_DELETED
     *
     * @mbg.generated Sat Dec 28 12:31:56 CST 2019
     */
    List<InnodbFtBeingDeleted> selectByExample(InnodbFtBeingDeletedExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table INNODB_FT_BEING_DELETED
     *
     * @mbg.generated Sat Dec 28 12:31:56 CST 2019
     */
    int updateByExampleSelective(@Param("record") InnodbFtBeingDeleted record, @Param("example") InnodbFtBeingDeletedExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table INNODB_FT_BEING_DELETED
     *
     * @mbg.generated Sat Dec 28 12:31:56 CST 2019
     */
    int updateByExample(@Param("record") InnodbFtBeingDeleted record, @Param("example") InnodbFtBeingDeletedExample example);
}