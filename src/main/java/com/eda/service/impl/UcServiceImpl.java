package com.eda.service.impl;

import com.eda.entity.Uc;
import com.eda.mapper.UcMapper;
import com.eda.service.UcService;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;

import javax.annotation.Resource;

/**
 * (Uc)表服务实现类
 *
 * @author makejava
 * @since 2021-10-23 19:25:21
 */
@Service("ucService")
public class UcServiceImpl implements UcService {
    @Resource
    private UcDao ucDao;

    /**
     * 通过ID查询单条数据
     *
     * @param uId 主键
     * @return 实例对象
     */
    @Override
    public Uc queryById(Integer uId) {
        return this.ucDao.queryById(uId);
    }

    /**
     * 分页查询
     *
     * @param uc 筛选条件
     * @return 查询结果
     */
    @Override
    public Page<Uc> queryByPage(Uc uc) {
        long total = this.ucDao.count(uc);
        return new PageImpl<>(this.ucDao.queryAllByLimit(uc, pageRequest), pageRequest, total);
    }

    /**
     * 新增数据
     *
     * @param uc 实例对象
     * @return 实例对象
     */
    @Override
    public Uc insert(Uc uc) {
        this.ucDao.insert(uc);
        return uc;
    }

    /**
     * 修改数据
     *
     * @param uc 实例对象
     * @return 实例对象
     */
    @Override
    public Uc update(Uc uc) {
        this.ucDao.update(uc);
        return this.queryById(uc.getUId());
    }

    /**
     * 通过主键删除数据
     *
     * @param uId 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer uId) {
        return this.ucDao.deleteById(uId) > 0;
    }
}
