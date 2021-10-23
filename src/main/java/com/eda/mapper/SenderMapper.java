package com.eda.mapper;

import com.eda.entity.Sender;
import org.apache.ibatis.annotations.Param;
import org.springframework.data.domain.Pageable;

import java.util.List;

/**
 * (Sender)表数据库访问层
 *
 * @author makejava
 * @since 2021-10-23 19:25:15
 */
public interface SenderMapper {

    /**
     * 通过ID查询单条数据
     *
     * @param sId 主键
     * @return 实例对象
     */
    Sender queryById(Integer sId);

    /**
     * 查询指定行数据
     *
     * @param sender   查询条件
     * @param pageable 分页对象
     * @return 对象列表
     */
    List<Sender> queryAllByLimit(Sender sender, @Param("pageable") Pageable pageable);

    /**
     * 统计总行数
     *
     * @param sender 查询条件
     * @return 总行数
     */
    long count(Sender sender);

    /**
     * 新增数据
     *
     * @param sender 实例对象
     * @return 影响行数
     */
    int insert(Sender sender);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<Sender> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<Sender> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<Sender> 实例对象列表
     * @return 影响行数
     * @throws org.springframework.jdbc.BadSqlGrammarException 入参是空List的时候会抛SQL语句错误的异常，请自行校验入参
     */
    int insertOrUpdateBatch(@Param("entities") List<Sender> entities);

    /**
     * 修改数据
     *
     * @param sender 实例对象
     * @return 影响行数
     */
    int update(Sender sender);

    /**
     * 通过主键删除数据
     *
     * @param sId 主键
     * @return 影响行数
     */
    int deleteById(Integer sId);

}

