package com.knight.Dao;

import com.knight.Bean.InnodbSysDatafiles;
import com.knight.Bean.InnodbSysDatafilesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface InnodbSysDatafilesMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table INNODB_SYS_DATAFILES
     *
     * @mbg.generated Sat Dec 28 12:31:56 CST 2019
     */
    long countByExample(InnodbSysDatafilesExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table INNODB_SYS_DATAFILES
     *
     * @mbg.generated Sat Dec 28 12:31:56 CST 2019
     */
    int deleteByExample(InnodbSysDatafilesExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table INNODB_SYS_DATAFILES
     *
     * @mbg.generated Sat Dec 28 12:31:56 CST 2019
     */
    int insert(InnodbSysDatafiles record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table INNODB_SYS_DATAFILES
     *
     * @mbg.generated Sat Dec 28 12:31:56 CST 2019
     */
    int insertSelective(InnodbSysDatafiles record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table INNODB_SYS_DATAFILES
     *
     * @mbg.generated Sat Dec 28 12:31:56 CST 2019
     */
    List<InnodbSysDatafiles> selectByExample(InnodbSysDatafilesExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table INNODB_SYS_DATAFILES
     *
     * @mbg.generated Sat Dec 28 12:31:56 CST 2019
     */
    int updateByExampleSelective(@Param("record") InnodbSysDatafiles record, @Param("example") InnodbSysDatafilesExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table INNODB_SYS_DATAFILES
     *
     * @mbg.generated Sat Dec 28 12:31:56 CST 2019
     */
    int updateByExample(@Param("record") InnodbSysDatafiles record, @Param("example") InnodbSysDatafilesExample example);
}