package com.eda.service.impl;

import com.eda.entity.Track;
import com.eda.mapper.TrackMapper;
import com.eda.service.TrackService;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;

import javax.annotation.Resource;

/**
 * (Track)表服务实现类
 *
 * @author makejava
 * @since 2021-10-23 19:25:20
 */
@Service("trackService")
public class TrackServiceImpl implements TrackService {
    @Resource
    private TrackDao trackDao;

    /**
     * 通过ID查询单条数据
     *
     * @param tId 主键
     * @return 实例对象
     */
    @Override
    public Track queryById(Integer tId) {
        return this.trackDao.queryById(tId);
    }

    /**
     * 分页查询
     *
     * @param track 筛选条件
     * @return 查询结果
     */
    @Override
    public Page<Track> queryByPage(Track track) {
        long total = this.trackDao.count(track);
        return new PageImpl<>(this.trackDao.queryAllByLimit(track, pageRequest), pageRequest, total);
    }

    /**
     * 新增数据
     *
     * @param track 实例对象
     * @return 实例对象
     */
    @Override
    public Track insert(Track track) {
        this.trackDao.insert(track);
        return track;
    }

    /**
     * 修改数据
     *
     * @param track 实例对象
     * @return 实例对象
     */
    @Override
    public Track update(Track track) {
        this.trackDao.update(track);
        return this.queryById(track.getTId());
    }

    /**
     * 通过主键删除数据
     *
     * @param tId 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer tId) {
        return this.trackDao.deleteById(tId) > 0;
    }
}
