package com.eda.service.impl;

import com.eda.entity.Vip;
import com.eda.mapper.VipMapper;
import com.eda.service.VipService;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;

import javax.annotation.Resource;

/**
 * (Vip)表服务实现类
 *
 * @author makejava
 * @since 2021-10-23 19:25:26
 */
@Service("vipService")
public class VipServiceImpl implements VipService {
    @Resource
    private VipDao vipDao;

    /**
     * 通过ID查询单条数据
     *
     * @param vId 主键
     * @return 实例对象
     */
    @Override
    public Vip queryById(Integer vId) {
        return this.vipDao.queryById(vId);
    }

    /**
     * 分页查询
     *
     * @param vip 筛选条件
     * @return 查询结果
     */
    @Override
    public Page<Vip> queryByPage(Vip vip) {
        long total = this.vipDao.count(vip);
        return new PageImpl<>(this.vipDao.queryAllByLimit(vip, pageRequest), pageRequest, total);
    }

    /**
     * 新增数据
     *
     * @param vip 实例对象
     * @return 实例对象
     */
    @Override
    public Vip insert(Vip vip) {
        this.vipDao.insert(vip);
        return vip;
    }

    /**
     * 修改数据
     *
     * @param vip 实例对象
     * @return 实例对象
     */
    @Override
    public Vip update(Vip vip) {
        this.vipDao.update(vip);
        return this.queryById(vip.getVId());
    }

    /**
     * 通过主键删除数据
     *
     * @param vId 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer vId) {
        return this.vipDao.deleteById(vId) > 0;
    }
}
