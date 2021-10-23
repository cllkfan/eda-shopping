package com.eda.service;

import com.eda.entity.Commit;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

/**
 * (Commit)表服务接口
 *
 * @author makejava
 * @since 2021-10-23 19:25:09
 */
public interface CommitService {

    /**
     * 通过ID查询单条数据
     *
     * @param comId 主键
     * @return 实例对象
     */
    Commit queryById(Integer comId);

    /**
     * 分页查询
     *
     * @param commit 筛选条件
     * @return 查询结果
     */
    Page<Commit> queryByPage(Commit commit);

    /**
     * 新增数据
     *
     * @param commit 实例对象
     * @return 实例对象
     */
    Commit insert(Commit commit);

    /**
     * 修改数据
     *
     * @param commit 实例对象
     * @return 实例对象
     */
    Commit update(Commit commit);

    /**
     * 通过主键删除数据
     *
     * @param comId 主键
     * @return 是否成功
     */
    boolean deleteById(Integer comId);

}
