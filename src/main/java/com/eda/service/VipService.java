package com.eda.service;

import com.eda.entity.Vip;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

/**
 * (Vip)表服务接口
 *
 * @author makejava
 * @since 2021-10-23 19:25:26
 */
public interface VipService {

    /**
     * 通过ID查询单条数据
     *
     * @param vId 主键
     * @return 实例对象
     */
    Vip queryById(Integer vId);

    /**
     * 分页查询
     *
     * @param vip 筛选条件
     * @return 查询结果
     */
    Page<Vip> queryByPage(Vip vip);

    /**
     * 新增数据
     *
     * @param vip 实例对象
     * @return 实例对象
     */
    Vip insert(Vip vip);

    /**
     * 修改数据
     *
     * @param vip 实例对象
     * @return 实例对象
     */
    Vip update(Vip vip);

    /**
     * 通过主键删除数据
     *
     * @param vId 主键
     * @return 是否成功
     */
    boolean deleteById(Integer vId);

}
