package com.eda.mapper;

import com.eda.entity.Paccount;
import org.apache.ibatis.annotations.Param;
import org.springframework.data.domain.Pageable;

import java.util.List;

/**
 * (Paccount)表数据库访问层
 *
 * @author makejava
 * @since 2021-10-23 19:25:13
 */
public interface PaccountMapper {

    /**
     * 通过ID查询单条数据
     *
     * @param pacId 主键
     * @return 实例对象
     */
    Paccount queryById(Integer pacId);

    /**
     * 查询指定行数据
     *
     * @param paccount 查询条件
     * @param pageable 分页对象
     * @return 对象列表
     */
    List<Paccount> queryAllByLimit(Paccount paccount, @Param("pageable") Pageable pageable);

    /**
     * 统计总行数
     *
     * @param paccount 查询条件
     * @return 总行数
     */
    long count(Paccount paccount);

    /**
     * 新增数据
     *
     * @param paccount 实例对象
     * @return 影响行数
     */
    int insert(Paccount paccount);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<Paccount> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<Paccount> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<Paccount> 实例对象列表
     * @return 影响行数
     * @throws org.springframework.jdbc.BadSqlGrammarException 入参是空List的时候会抛SQL语句错误的异常，请自行校验入参
     */
    int insertOrUpdateBatch(@Param("entities") List<Paccount> entities);

    /**
     * 修改数据
     *
     * @param paccount 实例对象
     * @return 影响行数
     */
    int update(Paccount paccount);

    /**
     * 通过主键删除数据
     *
     * @param pacId 主键
     * @return 影响行数
     */
    int deleteById(Integer pacId);

}

