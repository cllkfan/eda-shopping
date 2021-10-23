package com.eda.service.impl;

import com.eda.entity.Commit;
import com.eda.mapper.CommitMapper;
import com.eda.service.CommitService;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;

import javax.annotation.Resource;

/**
 * (Commit)表服务实现类
 *
 * @author makejava
 * @since 2021-10-23 19:25:09
 */
@Service("commitService")
public class CommitServiceImpl implements CommitService {
    @Resource
    private CommitDao commitDao;

    /**
     * 通过ID查询单条数据
     *
     * @param comId 主键
     * @return 实例对象
     */
    @Override
    public Commit queryById(Integer comId) {
        return this.commitDao.queryById(comId);
    }

    /**
     * 分页查询
     *
     * @param commit 筛选条件
     * @return 查询结果
     */
    @Override
    public Page<Commit> queryByPage(Commit commit) {
        long total = this.commitDao.count(commit);
        return new PageImpl<>(this.commitDao.queryAllByLimit(commit, pageRequest), pageRequest, total);
    }

    /**
     * 新增数据
     *
     * @param commit 实例对象
     * @return 实例对象
     */
    @Override
    public Commit insert(Commit commit) {
        this.commitDao.insert(commit);
        return commit;
    }

    /**
     * 修改数据
     *
     * @param commit 实例对象
     * @return 实例对象
     */
    @Override
    public Commit update(Commit commit) {
        this.commitDao.update(commit);
        return this.queryById(commit.getComId());
    }

    /**
     * 通过主键删除数据
     *
     * @param comId 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer comId) {
        return this.commitDao.deleteById(comId) > 0;
    }
}
