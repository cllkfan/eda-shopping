package com.eda.service;

import com.eda.entity.Track;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

/**
 * (Track)表服务接口
 *
 * @author makejava
 * @since 2021-10-23 19:25:20
 */
public interface TrackService {

    /**
     * 通过ID查询单条数据
     *
     * @param tId 主键
     * @return 实例对象
     */
    Track queryById(Integer tId);

    /**
     * 分页查询
     *
     * @param track 筛选条件
     * @return 查询结果
     */
    Page<Track> queryByPage(Track track);

    /**
     * 新增数据
     *
     * @param track 实例对象
     * @return 实例对象
     */
    Track insert(Track track);

    /**
     * 修改数据
     *
     * @param track 实例对象
     * @return 实例对象
     */
    Track update(Track track);

    /**
     * 通过主键删除数据
     *
     * @param tId 主键
     * @return 是否成功
     */
    boolean deleteById(Integer tId);

}
