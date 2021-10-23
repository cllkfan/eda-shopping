package com.eda.mapper;

import com.eda.entity.Commit;
import org.apache.ibatis.annotations.Param;
import org.springframework.data.domain.Pageable;

import java.util.List;

/**
 * (Commit)表数据库访问层
 *
 * @author makejava
 * @since 2021-10-23 19:25:09
 */
public interface CommitMapper {

    /**
     * 通过ID查询单条数据
     *
     * @param comId 主键
     * @return 实例对象
     */
    Commit queryById(Integer comId);

    /**
     * 查询指定行数据
     *
     * @param commit   查询条件
     * @param pageable 分页对象
     * @return 对象列表
     */
    List<Commit> queryAllByLimit(Commit commit, @Param("pageable") Pageable pageable);

    /**
     * 统计总行数
     *
     * @param commit 查询条件
     * @return 总行数
     */
    long count(Commit commit);

    /**
     * 新增数据
     *
     * @param commit 实例对象
     * @return 影响行数
     */
    int insert(Commit commit);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<Commit> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<Commit> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<Commit> 实例对象列表
     * @return 影响行数
     * @throws org.springframework.jdbc.BadSqlGrammarException 入参是空List的时候会抛SQL语句错误的异常，请自行校验入参
     */
    int insertOrUpdateBatch(@Param("entities") List<Commit> entities);

    /**
     * 修改数据
     *
     * @param commit 实例对象
     * @return 影响行数
     */
    int update(Commit commit);

    /**
     * 通过主键删除数据
     *
     * @param comId 主键
     * @return 影响行数
     */
    int deleteById(Integer comId);

}

