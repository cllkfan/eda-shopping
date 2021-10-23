package com.eda.mapper;

import com.eda.entity.TbItem;
import org.apache.ibatis.annotations.Param;
import org.springframework.data.domain.Pageable;

import java.util.List;

/**
 * (TbItem)表数据库访问层
 *
 * @author makejava
 * @since 2021-10-23 19:25:17
 */
public interface TbItemMapper {

    /**
     * 通过ID查询单条数据
     *
     * @param gid 主键
     * @return 实例对象
     */
    TbItem queryById(Long gid);

    /**
     * 查询指定行数据
     *
     * @param tbItem   查询条件
     * @param pageable 分页对象
     * @return 对象列表
     */
    List<TbItem> queryAllByLimit(TbItem tbItem, @Param("pageable") Pageable pageable);

    /**
     * 统计总行数
     *
     * @param tbItem 查询条件
     * @return 总行数
     */
    long count(TbItem tbItem);

    /**
     * 新增数据
     *
     * @param tbItem 实例对象
     * @return 影响行数
     */
    int insert(TbItem tbItem);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<TbItem> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<TbItem> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<TbItem> 实例对象列表
     * @return 影响行数
     * @throws org.springframework.jdbc.BadSqlGrammarException 入参是空List的时候会抛SQL语句错误的异常，请自行校验入参
     */
    int insertOrUpdateBatch(@Param("entities") List<TbItem> entities);

    /**
     * 修改数据
     *
     * @param tbItem 实例对象
     * @return 影响行数
     */
    int update(TbItem tbItem);

    /**
     * 通过主键删除数据
     *
     * @param gid 主键
     * @return 影响行数
     */
    int deleteById(Long gid);

}

