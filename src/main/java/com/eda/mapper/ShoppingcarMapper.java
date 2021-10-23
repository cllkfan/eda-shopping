package com.eda.mapper;

import com.eda.entity.Shoppingcar;
import org.apache.ibatis.annotations.Param;
import org.springframework.data.domain.Pageable;

import java.util.List;

/**
 * (Shoppingcar)表数据库访问层
 *
 * @author makejava
 * @since 2021-10-23 19:25:16
 */
public interface ShoppingcarMapper {

    /**
     * 通过ID查询单条数据
     *
     * @param shId 主键
     * @return 实例对象
     */
    Shoppingcar queryById(Integer shId);

    /**
     * 查询指定行数据
     *
     * @param shoppingcar 查询条件
     * @param pageable    分页对象
     * @return 对象列表
     */
    List<Shoppingcar> queryAllByLimit(Shoppingcar shoppingcar, @Param("pageable") Pageable pageable);

    /**
     * 统计总行数
     *
     * @param shoppingcar 查询条件
     * @return 总行数
     */
    long count(Shoppingcar shoppingcar);

    /**
     * 新增数据
     *
     * @param shoppingcar 实例对象
     * @return 影响行数
     */
    int insert(Shoppingcar shoppingcar);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<Shoppingcar> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<Shoppingcar> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<Shoppingcar> 实例对象列表
     * @return 影响行数
     * @throws org.springframework.jdbc.BadSqlGrammarException 入参是空List的时候会抛SQL语句错误的异常，请自行校验入参
     */
    int insertOrUpdateBatch(@Param("entities") List<Shoppingcar> entities);

    /**
     * 修改数据
     *
     * @param shoppingcar 实例对象
     * @return 影响行数
     */
    int update(Shoppingcar shoppingcar);

    /**
     * 通过主键删除数据
     *
     * @param shId 主键
     * @return 影响行数
     */
    int deleteById(Integer shId);

}

