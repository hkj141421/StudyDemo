package com.knight.Dao;

import com.knight.Bean.Plugin;
import com.knight.Bean.PluginExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PluginMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table plugin
     *
     * @mbg.generated Sat Dec 28 12:31:56 CST 2019
     */
    long countByExample(PluginExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table plugin
     *
     * @mbg.generated Sat Dec 28 12:31:56 CST 2019
     */
    int deleteByExample(PluginExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table plugin
     *
     * @mbg.generated Sat Dec 28 12:31:56 CST 2019
     */
    int insert(Plugin record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table plugin
     *
     * @mbg.generated Sat Dec 28 12:31:56 CST 2019
     */
    int insertSelective(Plugin record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table plugin
     *
     * @mbg.generated Sat Dec 28 12:31:56 CST 2019
     */
    List<Plugin> selectByExample(PluginExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table plugin
     *
     * @mbg.generated Sat Dec 28 12:31:56 CST 2019
     */
    int updateByExampleSelective(@Param("record") Plugin record, @Param("example") PluginExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table plugin
     *
     * @mbg.generated Sat Dec 28 12:31:56 CST 2019
     */
    int updateByExample(@Param("record") Plugin record, @Param("example") PluginExample example);
}