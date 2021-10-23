package com.eda.mapper;

import com.eda.entity.Dclassify;
import org.apache.ibatis.annotations.Param;
import org.springframework.data.domain.Pageable;

import java.util.List;

/**
 * (Dclassify)表数据库访问层
 *
 * @author makejava
 * @since 2021-10-23 19:25:10
 */
public interface DclassifyMapper {

    /**
     * 通过ID查询单条数据
     *
     * @param dId 主键
     * @return 实例对象
     */
    Dclassify queryById(Integer dId);

    /**
     * 查询指定行数据
     *
     * @param dclassify 查询条件
     * @param pageable  分页对象
     * @return 对象列表
     */
    List<Dclassify> queryAllByLimit(Dclassify dclassify, @Param("pageable") Pageable pageable);

    /**
     * 统计总行数
     *
     * @param dclassify 查询条件
     * @return 总行数
     */
    long count(Dclassify dclassify);

    /**
     * 新增数据
     *
     * @param dclassify 实例对象
     * @return 影响行数
     */
    int insert(Dclassify dclassify);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<Dclassify> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<Dclassify> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<Dclassify> 实例对象列表
     * @return 影响行数
     * @throws org.springframework.jdbc.BadSqlGrammarException 入参是空List的时候会抛SQL语句错误的异常，请自行校验入参
     */
    int insertOrUpdateBatch(@Param("entities") List<Dclassify> entities);

    /**
     * 修改数据
     *
     * @param dclassify 实例对象
     * @return 影响行数
     */
    int update(Dclassify dclassify);

    /**
     * 通过主键删除数据
     *
     * @param dId 主键
     * @return 影响行数
     */
    int deleteById(Integer dId);

}

