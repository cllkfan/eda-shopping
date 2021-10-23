package com.eda.mapper;

import com.eda.entity.Adminer;
import org.apache.ibatis.annotations.Param;
import org.springframework.data.domain.Pageable;

import java.util.List;

/**
 * (Adminer)表数据库访问层
 *
 * @author makejava
 * @since 2021-10-23 19:23:17
 */
public interface AdminerMapper {

    /**
     * 通过ID查询单条数据
     *
     * @param adId 主键
     * @return 实例对象
     */
    Adminer queryById(Integer adId);

    /**
     * 查询指定行数据
     *
     * @param adminer  查询条件
     * @param pageable 分页对象
     * @return 对象列表
     */
    List<Adminer> queryAllByLimit(Adminer adminer, @Param("pageable") Pageable pageable);

    /**
     * 统计总行数
     *
     * @param adminer 查询条件
     * @return 总行数
     */
    long count(Adminer adminer);

    /**
     * 新增数据
     *
     * @param adminer 实例对象
     * @return 影响行数
     */
    int insert(Adminer adminer);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<Adminer> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<Adminer> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<Adminer> 实例对象列表
     * @return 影响行数
     * @throws org.springframework.jdbc.BadSqlGrammarException 入参是空List的时候会抛SQL语句错误的异常，请自行校验入参
     */
    int insertOrUpdateBatch(@Param("entities") List<Adminer> entities);

    /**
     * 修改数据
     *
     * @param adminer 实例对象
     * @return 影响行数
     */
    int update(Adminer adminer);

    /**
     * 通过主键删除数据
     *
     * @param adId 主键
     * @return 影响行数
     */
    int deleteById(Integer adId);

}

