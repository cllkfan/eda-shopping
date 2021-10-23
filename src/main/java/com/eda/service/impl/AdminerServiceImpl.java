package com.eda.service.impl;

import com.eda.entity.Adminer;
import com.eda.mapper.AdminerMapper;
import com.eda.service.AdminerService;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;

import javax.annotation.Resource;

/**
 * (Adminer)表服务实现类
 *
 * @author makejava
 * @since 2021-10-23 19:23:17
 */
@Service("adminerService")
public class AdminerServiceImpl implements AdminerService {
    @Resource
    private AdminerDao adminerDao;

    /**
     * 通过ID查询单条数据
     *
     * @param adId 主键
     * @return 实例对象
     */
    @Override
    public Adminer queryById(Integer adId) {
        return this.adminerDao.queryById(adId);
    }

    /**
     * 分页查询
     *
     * @param adminer 筛选条件
     * @return 查询结果
     */
    @Override
    public Page<Adminer> queryByPage(Adminer adminer) {
        long total = this.adminerDao.count(adminer);
        return new PageImpl<>(this.adminerDao.queryAllByLimit(adminer, pageRequest), pageRequest, total);
    }

    /**
     * 新增数据
     *
     * @param adminer 实例对象
     * @return 实例对象
     */
    @Override
    public Adminer insert(Adminer adminer) {
        this.adminerDao.insert(adminer);
        return adminer;
    }

    /**
     * 修改数据
     *
     * @param adminer 实例对象
     * @return 实例对象
     */
    @Override
    public Adminer update(Adminer adminer) {
        this.adminerDao.update(adminer);
        return this.queryById(adminer.getAdId());
    }

    /**
     * 通过主键删除数据
     *
     * @param adId 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer adId) {
        return this.adminerDao.deleteById(adId) > 0;
    }
}
