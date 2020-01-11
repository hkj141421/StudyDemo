package com.knight.Dao;

import com.knight.Bean.InnodbSysForeign;
import com.knight.Bean.InnodbSysForeignExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface InnodbSysForeignMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table INNODB_SYS_FOREIGN
     *
     * @mbg.generated Sat Dec 28 12:31:56 CST 2019
     */
    long countByExample(InnodbSysForeignExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table INNODB_SYS_FOREIGN
     *
     * @mbg.generated Sat Dec 28 12:31:56 CST 2019
     */
    int deleteByExample(InnodbSysForeignExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table INNODB_SYS_FOREIGN
     *
     * @mbg.generated Sat Dec 28 12:31:56 CST 2019
     */
    int insert(InnodbSysForeign record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table INNODB_SYS_FOREIGN
     *
     * @mbg.generated Sat Dec 28 12:31:56 CST 2019
     */
    int insertSelective(InnodbSysForeign record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table INNODB_SYS_FOREIGN
     *
     * @mbg.generated Sat Dec 28 12:31:56 CST 2019
     */
    List<InnodbSysForeign> selectByExample(InnodbSysForeignExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table INNODB_SYS_FOREIGN
     *
     * @mbg.generated Sat Dec 28 12:31:56 CST 2019
     */
    int updateByExampleSelective(@Param("record") InnodbSysForeign record, @Param("example") InnodbSysForeignExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table INNODB_SYS_FOREIGN
     *
     * @mbg.generated Sat Dec 28 12:31:56 CST 2019
     */
    int updateByExample(@Param("record") InnodbSysForeign record, @Param("example") InnodbSysForeignExample example);
}