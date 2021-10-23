package com.eda.service.impl;

import com.eda.entity.TbItem;
import com.eda.mapper.TbItemMapper;
import com.eda.service.TbItemService;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;

import javax.annotation.Resource;

/**
 * (TbItem)表服务实现类
 *
 * @author makejava
 * @since 2021-10-23 19:25:18
 */
@Service("tbItemService")
public class TbItemServiceImpl implements TbItemService {
    @Resource
    private TbItemDao tbItemDao;

    /**
     * 通过ID查询单条数据
     *
     * @param gid 主键
     * @return 实例对象
     */
    @Override
    public TbItem queryById(Long gid) {
        return this.tbItemDao.queryById(gid);
    }

    /**
     * 分页查询
     *
     * @param tbItem 筛选条件
     * @return 查询结果
     */
    @Override
    public Page<TbItem> queryByPage(TbItem tbItem) {
        long total = this.tbItemDao.count(tbItem);
        return new PageImpl<>(this.tbItemDao.queryAllByLimit(tbItem, pageRequest), pageRequest, total);
    }

    /**
     * 新增数据
     *
     * @param tbItem 实例对象
     * @return 实例对象
     */
    @Override
    public TbItem insert(TbItem tbItem) {
        this.tbItemDao.insert(tbItem);
        return tbItem;
    }

    /**
     * 修改数据
     *
     * @param tbItem 实例对象
     * @return 实例对象
     */
    @Override
    public TbItem update(TbItem tbItem) {
        this.tbItemDao.update(tbItem);
        return this.queryById(tbItem.getGid());
    }

    /**
     * 通过主键删除数据
     *
     * @param gid 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long gid) {
        return this.tbItemDao.deleteById(gid) > 0;
    }
}
