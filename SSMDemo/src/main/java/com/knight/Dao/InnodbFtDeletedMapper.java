package com.knight.Dao;

import com.knight.Bean.InnodbFtDeleted;
import com.knight.Bean.InnodbFtDeletedExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface InnodbFtDeletedMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table INNODB_FT_DELETED
     *
     * @mbg.generated Sat Dec 28 12:31:56 CST 2019
     */
    long countByExample(InnodbFtDeletedExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table INNODB_FT_DELETED
     *
     * @mbg.generated Sat Dec 28 12:31:56 CST 2019
     */
    int deleteByExample(InnodbFtDeletedExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table INNODB_FT_DELETED
     *
     * @mbg.generated Sat Dec 28 12:31:56 CST 2019
     */
    int insert(InnodbFtDeleted record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table INNODB_FT_DELETED
     *
     * @mbg.generated Sat Dec 28 12:31:56 CST 2019
     */
    int insertSelective(InnodbFtDeleted record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table INNODB_FT_DELETED
     *
     * @mbg.generated Sat Dec 28 12:31:56 CST 2019
     */
    List<InnodbFtDeleted> selectByExample(InnodbFtDeletedExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table INNODB_FT_DELETED
     *
     * @mbg.generated Sat Dec 28 12:31:56 CST 2019
     */
    int updateByExampleSelective(@Param("record") InnodbFtDeleted record, @Param("example") InnodbFtDeletedExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table INNODB_FT_DELETED
     *
     * @mbg.generated Sat Dec 28 12:31:56 CST 2019
     */
    int updateByExample(@Param("record") InnodbFtDeleted record, @Param("example") InnodbFtDeletedExample example);
}