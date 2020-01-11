package com.knight.Dao;

import com.knight.Bean.SetupInstruments;
import com.knight.Bean.SetupInstrumentsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SetupInstrumentsMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table setup_instruments
     *
     * @mbg.generated Sat Dec 28 12:31:56 CST 2019
     */
    long countByExample(SetupInstrumentsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table setup_instruments
     *
     * @mbg.generated Sat Dec 28 12:31:56 CST 2019
     */
    int deleteByExample(SetupInstrumentsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table setup_instruments
     *
     * @mbg.generated Sat Dec 28 12:31:56 CST 2019
     */
    int insert(SetupInstruments record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table setup_instruments
     *
     * @mbg.generated Sat Dec 28 12:31:56 CST 2019
     */
    int insertSelective(SetupInstruments record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table setup_instruments
     *
     * @mbg.generated Sat Dec 28 12:31:56 CST 2019
     */
    List<SetupInstruments> selectByExample(SetupInstrumentsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table setup_instruments
     *
     * @mbg.generated Sat Dec 28 12:31:56 CST 2019
     */
    int updateByExampleSelective(@Param("record") SetupInstruments record, @Param("example") SetupInstrumentsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table setup_instruments
     *
     * @mbg.generated Sat Dec 28 12:31:56 CST 2019
     */
    int updateByExample(@Param("record") SetupInstruments record, @Param("example") SetupInstrumentsExample example);
}