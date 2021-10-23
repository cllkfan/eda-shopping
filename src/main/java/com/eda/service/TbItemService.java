package com.eda.service;

import com.eda.entity.TbItem;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

/**
 * (TbItem)表服务接口
 *
 * @author makejava
 * @since 2021-10-23 19:25:18
 */
public interface TbItemService {

    /**
     * 通过ID查询单条数据
     *
     * @param gid 主键
     * @return 实例对象
     */
    TbItem queryById(Long gid);

    /**
     * 分页查询
     *
     * @param tbItem 筛选条件
     * @return 查询结果
     */
    Page<TbItem> queryByPage(TbItem tbItem);

    /**
     * 新增数据
     *
     * @param tbItem 实例对象
     * @return 实例对象
     */
    TbItem insert(TbItem tbItem);

    /**
     * 修改数据
     *
     * @param tbItem 实例对象
     * @return 实例对象
     */
    TbItem update(TbItem tbItem);

    /**
     * 通过主键删除数据
     *
     * @param gid 主键
     * @return 是否成功
     */
    boolean deleteById(Long gid);

}
