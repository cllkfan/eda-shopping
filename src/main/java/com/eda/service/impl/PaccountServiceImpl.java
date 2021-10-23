package com.eda.service.impl;

import com.eda.entity.Paccount;
import com.eda.mapper.PaccountMapper;
import com.eda.service.PaccountService;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;

import javax.annotation.Resource;

/**
 * (Paccount)表服务实现类
 *
 * @author makejava
 * @since 2021-10-23 19:25:14
 */
@Service("paccountService")
public class PaccountServiceImpl implements PaccountService {
    @Resource
    private PaccountDao paccountDao;

    /**
     * 通过ID查询单条数据
     *
     * @param pacId 主键
     * @return 实例对象
     */
    @Override
    public Paccount queryById(Integer pacId) {
        return this.paccountDao.queryById(pacId);
    }

    /**
     * 分页查询
     *
     * @param paccount 筛选条件
     * @return 查询结果
     */
    @Override
    public Page<Paccount> queryByPage(Paccount paccount) {
        long total = this.paccountDao.count(paccount);
        return new PageImpl<>(this.paccountDao.queryAllByLimit(paccount, pageRequest), pageRequest, total);
    }

    /**
     * 新增数据
     *
     * @param paccount 实例对象
     * @return 实例对象
     */
    @Override
    public Paccount insert(Paccount paccount) {
        this.paccountDao.insert(paccount);
        return paccount;
    }

    /**
     * 修改数据
     *
     * @param paccount 实例对象
     * @return 实例对象
     */
    @Override
    public Paccount update(Paccount paccount) {
        this.paccountDao.update(paccount);
        return this.queryById(paccount.getPacId());
    }

    /**
     * 通过主键删除数据
     *
     * @param pacId 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer pacId) {
        return this.paccountDao.deleteById(pacId) > 0;
    }
}
