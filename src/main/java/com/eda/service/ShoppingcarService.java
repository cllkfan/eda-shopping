package com.eda.service;

import com.eda.entity.Shoppingcar;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

/**
 * (Shoppingcar)表服务接口
 *
 * @author makejava
 * @since 2021-10-23 19:25:17
 */
public interface ShoppingcarService {

    /**
     * 通过ID查询单条数据
     *
     * @param shId 主键
     * @return 实例对象
     */
    Shoppingcar queryById(Integer shId);

    /**
     * 分页查询
     *
     * @param shoppingcar 筛选条件
     * @return 查询结果
     */
    Page<Shoppingcar> queryByPage(Shoppingcar shoppingcar);

    /**
     * 新增数据
     *
     * @param shoppingcar 实例对象
     * @return 实例对象
     */
    Shoppingcar insert(Shoppingcar shoppingcar);

    /**
     * 修改数据
     *
     * @param shoppingcar 实例对象
     * @return 实例对象
     */
    Shoppingcar update(Shoppingcar shoppingcar);

    /**
     * 通过主键删除数据
     *
     * @param shId 主键
     * @return 是否成功
     */
    boolean deleteById(Integer shId);

}
