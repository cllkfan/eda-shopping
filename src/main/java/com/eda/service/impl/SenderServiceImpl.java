package com.eda.service.impl;

import com.eda.entity.Sender;
import com.eda.mapper.SenderMapper;
import com.eda.service.SenderService;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;

import javax.annotation.Resource;

/**
 * (Sender)表服务实现类
 *
 * @author makejava
 * @since 2021-10-23 19:25:16
 */
@Service("senderService")
public class SenderServiceImpl implements SenderService {
    @Resource
    private SenderDao senderDao;

    /**
     * 通过ID查询单条数据
     *
     * @param sId 主键
     * @return 实例对象
     */
    @Override
    public Sender queryById(Integer sId) {
        return this.senderDao.queryById(sId);
    }

    /**
     * 分页查询
     *
     * @param sender 筛选条件
     * @return 查询结果
     */
    @Override
    public Page<Sender> queryByPage(Sender sender) {
        long total = this.senderDao.count(sender);
        return new PageImpl<>(this.senderDao.queryAllByLimit(sender, pageRequest), pageRequest, total);
    }

    /**
     * 新增数据
     *
     * @param sender 实例对象
     * @return 实例对象
     */
    @Override
    public Sender insert(Sender sender) {
        this.senderDao.insert(sender);
        return sender;
    }

    /**
     * 修改数据
     *
     * @param sender 实例对象
     * @return 实例对象
     */
    @Override
    public Sender update(Sender sender) {
        this.senderDao.update(sender);
        return this.queryById(sender.getSId());
    }

    /**
     * 通过主键删除数据
     *
     * @param sId 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer sId) {
        return this.senderDao.deleteById(sId) > 0;
    }
}
