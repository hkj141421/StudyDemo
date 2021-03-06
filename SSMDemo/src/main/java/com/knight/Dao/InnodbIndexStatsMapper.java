package com.knight.Dao;

import com.knight.Bean.InnodbIndexStats;
import com.knight.Bean.InnodbIndexStatsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface InnodbIndexStatsMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table innodb_index_stats
     *
     * @mbg.generated Sat Dec 28 12:31:56 CST 2019
     */
    long countByExample(InnodbIndexStatsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table innodb_index_stats
     *
     * @mbg.generated Sat Dec 28 12:31:56 CST 2019
     */
    int deleteByExample(InnodbIndexStatsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table innodb_index_stats
     *
     * @mbg.generated Sat Dec 28 12:31:56 CST 2019
     */
    int insert(InnodbIndexStats record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table innodb_index_stats
     *
     * @mbg.generated Sat Dec 28 12:31:56 CST 2019
     */
    int insertSelective(InnodbIndexStats record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table innodb_index_stats
     *
     * @mbg.generated Sat Dec 28 12:31:56 CST 2019
     */
    List<InnodbIndexStats> selectByExample(InnodbIndexStatsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table innodb_index_stats
     *
     * @mbg.generated Sat Dec 28 12:31:56 CST 2019
     */
    int updateByExampleSelective(@Param("record") InnodbIndexStats record, @Param("example") InnodbIndexStatsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table innodb_index_stats
     *
     * @mbg.generated Sat Dec 28 12:31:56 CST 2019
     */
    int updateByExample(@Param("record") InnodbIndexStats record, @Param("example") InnodbIndexStatsExample example);
}