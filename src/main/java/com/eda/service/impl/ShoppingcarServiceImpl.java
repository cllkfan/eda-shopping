package com.eda.service.impl;

import com.eda.entity.Shoppingcar;
import com.eda.mapper.ShoppingcarMapper;
import com.eda.service.ShoppingcarService;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;

import javax.annotation.Resource;

/**
 * (Shoppingcar)表服务实现类
 *
 * @author makejava
 * @since 2021-10-23 19:25:17
 */
@Service("shoppingcarService")
public class ShoppingcarServiceImpl implements ShoppingcarService {
    @Resource
    private ShoppingcarDao shoppingcarDao;

    /**
     * 通过ID查询单条数据
     *
     * @param shId 主键
     * @return 实例对象
     */
    @Override
    public Shoppingcar queryById(Integer shId) {
        return this.shoppingcarDao.queryById(shId);
    }

    /**
     * 分页查询
     *
     * @param shoppingcar 筛选条件
     * @return 查询结果
     */
    @Override
    public Page<Shoppingcar> queryByPage(Shoppingcar shoppingcar) {
        long total = this.shoppingcarDao.count(shoppingcar);
        return new PageImpl<>(this.shoppingcarDao.queryAllByLimit(shoppingcar, pageRequest), pageRequest, total);
    }

    /**
     * 新增数据
     *
     * @param shoppingcar 实例对象
     * @return 实例对象
     */
    @Override
    public Shoppingcar insert(Shoppingcar shoppingcar) {
        this.shoppingcarDao.insert(shoppingcar);
        return shoppingcar;
    }

    /**
     * 修改数据
     *
     * @param shoppingcar 实例对象
     * @return 实例对象
     */
    @Override
    public Shoppingcar update(Shoppingcar shoppingcar) {
        this.shoppingcarDao.update(shoppingcar);
        return this.queryById(shoppingcar.getShId());
    }

    /**
     * 通过主键删除数据
     *
     * @param shId 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer shId) {
        return this.shoppingcarDao.deleteById(shId) > 0;
    }
}
