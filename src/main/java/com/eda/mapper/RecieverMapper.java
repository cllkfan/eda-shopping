package com.eda.mapper;

import com.eda.entity.Reciever;
import org.apache.ibatis.annotations.Param;
import org.springframework.data.domain.Pageable;

import java.util.List;

/**
 * (Reciever)表数据库访问层
 *
 * @author makejava
 * @since 2021-10-23 19:25:14
 */
public interface RecieverMapper {

    /**
     * 通过ID查询单条数据
     *
     * @param rId 主键
     * @return 实例对象
     */
    Reciever queryById(Integer rId);

    /**
     * 查询指定行数据
     *
     * @param reciever 查询条件
     * @param pageable 分页对象
     * @return 对象列表
     */
    List<Reciever> queryAllByLimit(Reciever reciever, @Param("pageable") Pageable pageable);

    /**
     * 统计总行数
     *
     * @param reciever 查询条件
     * @return 总行数
     */
    long count(Reciever reciever);

    /**
     * 新增数据
     *
     * @param reciever 实例对象
     * @return 影响行数
     */
    int insert(Reciever reciever);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<Reciever> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<Reciever> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<Reciever> 实例对象列表
     * @return 影响行数
     * @throws org.springframework.jdbc.BadSqlGrammarException 入参是空List的时候会抛SQL语句错误的异常，请自行校验入参
     */
    int insertOrUpdateBatch(@Param("entities") List<Reciever> entities);

    /**
     * 修改数据
     *
     * @param reciever 实例对象
     * @return 影响行数
     */
    int update(Reciever reciever);

    /**
     * 通过主键删除数据
     *
     * @param rId 主键
     * @return 影响行数
     */
    int deleteById(Integer rId);

}

