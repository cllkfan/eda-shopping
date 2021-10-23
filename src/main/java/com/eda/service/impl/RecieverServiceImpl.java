package com.eda.service.impl;

import com.eda.entity.Reciever;
import com.eda.mapper.RecieverMapper;
import com.eda.service.RecieverService;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;

import javax.annotation.Resource;

/**
 * (Reciever)表服务实现类
 *
 * @author makejava
 * @since 2021-10-23 19:25:15
 */
@Service("recieverService")
public class RecieverServiceImpl implements RecieverService {
    @Resource
    private RecieverDao recieverDao;

    /**
     * 通过ID查询单条数据
     *
     * @param rId 主键
     * @return 实例对象
     */
    @Override
    public Reciever queryById(Integer rId) {
        return this.recieverDao.queryById(rId);
    }

    /**
     * 分页查询
     *
     * @param reciever 筛选条件
     * @return 查询结果
     */
    @Override
    public Page<Reciever> queryByPage(Reciever reciever) {
        long total = this.recieverDao.count(reciever);
        return new PageImpl<>(this.recieverDao.queryAllByLimit(reciever, pageRequest), pageRequest, total);
    }

    /**
     * 新增数据
     *
     * @param reciever 实例对象
     * @return 实例对象
     */
    @Override
    public Reciever insert(Reciever reciever) {
        this.recieverDao.insert(reciever);
        return reciever;
    }

    /**
     * 修改数据
     *
     * @param reciever 实例对象
     * @return 实例对象
     */
    @Override
    public Reciever update(Reciever reciever) {
        this.recieverDao.update(reciever);
        return this.queryById(reciever.getRId());
    }

    /**
     * 通过主键删除数据
     *
     * @param rId 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer rId) {
        return this.recieverDao.deleteById(rId) > 0;
    }
}
