package com.knight.Dao;

import com.knight.Bean.InnodbTrx;
import com.knight.Bean.InnodbTrxExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface InnodbTrxMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table INNODB_TRX
     *
     * @mbg.generated Sat Dec 28 12:31:55 CST 2019
     */
    long countByExample(InnodbTrxExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table INNODB_TRX
     *
     * @mbg.generated Sat Dec 28 12:31:55 CST 2019
     */
    int deleteByExample(InnodbTrxExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table INNODB_TRX
     *
     * @mbg.generated Sat Dec 28 12:31:55 CST 2019
     */
    int insert(InnodbTrx record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table INNODB_TRX
     *
     * @mbg.generated Sat Dec 28 12:31:55 CST 2019
     */
    int insertSelective(InnodbTrx record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table INNODB_TRX
     *
     * @mbg.generated Sat Dec 28 12:31:55 CST 2019
     */
    List<InnodbTrx> selectByExample(InnodbTrxExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table INNODB_TRX
     *
     * @mbg.generated Sat Dec 28 12:31:55 CST 2019
     */
    int updateByExampleSelective(@Param("record") InnodbTrx record, @Param("example") InnodbTrxExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table INNODB_TRX
     *
     * @mbg.generated Sat Dec 28 12:31:55 CST 2019
     */
    int updateByExample(@Param("record") InnodbTrx record, @Param("example") InnodbTrxExample example);
}