package com.eda.mapper;

import com.eda.entity.Gimg;
import org.apache.ibatis.annotations.Param;
import org.springframework.data.domain.Pageable;

import java.util.List;

/**
 * (Gimg)表数据库访问层
 *
 * @author makejava
 * @since 2021-10-23 19:25:11
 */
public interface GimgMapper {

    /**
     * 通过ID查询单条数据
     *
     * @param gimgId 主键
     * @return 实例对象
     */
    Gimg queryById(Integer gimgId);

    /**
     * 查询指定行数据
     *
     * @param gimg     查询条件
     * @param pageable 分页对象
     * @return 对象列表
     */
    List<Gimg> queryAllByLimit(Gimg gimg, @Param("pageable") Pageable pageable);

    /**
     * 统计总行数
     *
     * @param gimg 查询条件
     * @return 总行数
     */
    long count(Gimg gimg);

    /**
     * 新增数据
     *
     * @param gimg 实例对象
     * @return 影响行数
     */
    int insert(Gimg gimg);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<Gimg> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<Gimg> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<Gimg> 实例对象列表
     * @return 影响行数
     * @throws org.springframework.jdbc.BadSqlGrammarException 入参是空List的时候会抛SQL语句错误的异常，请自行校验入参
     */
    int insertOrUpdateBatch(@Param("entities") List<Gimg> entities);

    /**
     * 修改数据
     *
     * @param gimg 实例对象
     * @return 影响行数
     */
    int update(Gimg gimg);

    /**
     * 通过主键删除数据
     *
     * @param gimgId 主键
     * @return 影响行数
     */
    int deleteById(Integer gimgId);

}

