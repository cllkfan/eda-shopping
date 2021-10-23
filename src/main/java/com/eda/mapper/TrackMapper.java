package com.eda.mapper;

import com.eda.entity.Track;
import org.apache.ibatis.annotations.Param;
import org.springframework.data.domain.Pageable;

import java.util.List;

/**
 * (Track)表数据库访问层
 *
 * @author makejava
 * @since 2021-10-23 19:25:19
 */
public interface TrackMapper {

    /**
     * 通过ID查询单条数据
     *
     * @param tId 主键
     * @return 实例对象
     */
    Track queryById(Integer tId);

    /**
     * 查询指定行数据
     *
     * @param track    查询条件
     * @param pageable 分页对象
     * @return 对象列表
     */
    List<Track> queryAllByLimit(Track track, @Param("pageable") Pageable pageable);

    /**
     * 统计总行数
     *
     * @param track 查询条件
     * @return 总行数
     */
    long count(Track track);

    /**
     * 新增数据
     *
     * @param track 实例对象
     * @return 影响行数
     */
    int insert(Track track);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<Track> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<Track> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<Track> 实例对象列表
     * @return 影响行数
     * @throws org.springframework.jdbc.BadSqlGrammarException 入参是空List的时候会抛SQL语句错误的异常，请自行校验入参
     */
    int insertOrUpdateBatch(@Param("entities") List<Track> entities);

    /**
     * 修改数据
     *
     * @param track 实例对象
     * @return 影响行数
     */
    int update(Track track);

    /**
     * 通过主键删除数据
     *
     * @param tId 主键
     * @return 影响行数
     */
    int deleteById(Integer tId);

}

