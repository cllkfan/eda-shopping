package com.eda.service;

import com.eda.entity.Adminer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

/**
 * (Adminer)表服务接口
 *
 * @author makejava
 * @since 2021-10-23 19:23:17
 */
public interface AdminerService {

    /**
     * 通过ID查询单条数据
     *
     * @param adId 主键
     * @return 实例对象
     */
    Adminer queryById(Integer adId);

    /**
     * 分页查询
     *
     * @param adminer 筛选条件
     * @return 查询结果
     */
    Page<Adminer> queryByPage(Adminer adminer);

    /**
     * 新增数据
     *
     * @param adminer 实例对象
     * @return 实例对象
     */
    Adminer insert(Adminer adminer);

    /**
     * 修改数据
     *
     * @param adminer 实例对象
     * @return 实例对象
     */
    Adminer update(Adminer adminer);

    /**
     * 通过主键删除数据
     *
     * @param adId 主键
     * @return 是否成功
     */
    boolean deleteById(Integer adId);

}
