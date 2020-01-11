package com.knight.Dao;

import com.knight.Bean.InnodbCmpPerIndex;
import com.knight.Bean.InnodbCmpPerIndexExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface InnodbCmpPerIndexMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table INNODB_CMP_PER_INDEX
     *
     * @mbg.generated Sat Dec 28 12:31:56 CST 2019
     */
    long countByExample(InnodbCmpPerIndexExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table INNODB_CMP_PER_INDEX
     *
     * @mbg.generated Sat Dec 28 12:31:56 CST 2019
     */
    int deleteByExample(InnodbCmpPerIndexExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table INNODB_CMP_PER_INDEX
     *
     * @mbg.generated Sat Dec 28 12:31:56 CST 2019
     */
    int insert(InnodbCmpPerIndex record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table INNODB_CMP_PER_INDEX
     *
     * @mbg.generated Sat Dec 28 12:31:56 CST 2019
     */
    int insertSelective(InnodbCmpPerIndex record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table INNODB_CMP_PER_INDEX
     *
     * @mbg.generated Sat Dec 28 12:31:56 CST 2019
     */
    List<InnodbCmpPerIndex> selectByExample(InnodbCmpPerIndexExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table INNODB_CMP_PER_INDEX
     *
     * @mbg.generated Sat Dec 28 12:31:56 CST 2019
     */
    int updateByExampleSelective(@Param("record") InnodbCmpPerIndex record, @Param("example") InnodbCmpPerIndexExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table INNODB_CMP_PER_INDEX
     *
     * @mbg.generated Sat Dec 28 12:31:56 CST 2019
     */
    int updateByExample(@Param("record") InnodbCmpPerIndex record, @Param("example") InnodbCmpPerIndexExample example);
}