package com.eda.service.impl;

import com.eda.entity.Dclassify;
import com.eda.mapper.DclassifyMapper;
import com.eda.service.DclassifyService;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;

import javax.annotation.Resource;

/**
 * (Dclassify)表服务实现类
 *
 * @author makejava
 * @since 2021-10-23 19:25:11
 */
@Service("dclassifyService")
public class DclassifyServiceImpl implements DclassifyService {
    @Resource
    private DclassifyDao dclassifyDao;

    /**
     * 通过ID查询单条数据
     *
     * @param dId 主键
     * @return 实例对象
     */
    @Override
    public Dclassify queryById(Integer dId) {
        return this.dclassifyDao.queryById(dId);
    }

    /**
     * 分页查询
     *
     * @param dclassify 筛选条件
     * @return 查询结果
     */
    @Override
    public Page<Dclassify> queryByPage(Dclassify dclassify) {
        long total = this.dclassifyDao.count(dclassify);
        return new PageImpl<>(this.dclassifyDao.queryAllByLimit(dclassify, pageRequest), pageRequest, total);
    }

    /**
     * 新增数据
     *
     * @param dclassify 实例对象
     * @return 实例对象
     */
    @Override
    public Dclassify insert(Dclassify dclassify) {
        this.dclassifyDao.insert(dclassify);
        return dclassify;
    }

    /**
     * 修改数据
     *
     * @param dclassify 实例对象
     * @return 实例对象
     */
    @Override
    public Dclassify update(Dclassify dclassify) {
        this.dclassifyDao.update(dclassify);
        return this.queryById(dclassify.getDId());
    }

    /**
     * 通过主键删除数据
     *
     * @param dId 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer dId) {
        return this.dclassifyDao.deleteById(dId) > 0;
    }
}
