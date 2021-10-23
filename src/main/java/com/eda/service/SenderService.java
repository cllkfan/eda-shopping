package com.eda.service;

import com.eda.entity.Sender;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

/**
 * (Sender)表服务接口
 *
 * @author makejava
 * @since 2021-10-23 19:25:16
 */
public interface SenderService {

    /**
     * 通过ID查询单条数据
     *
     * @param sId 主键
     * @return 实例对象
     */
    Sender queryById(Integer sId);

    /**
     * 分页查询
     *
     * @param sender 筛选条件
     * @return 查询结果
     */
    Page<Sender> queryByPage(Sender sender);

    /**
     * 新增数据
     *
     * @param sender 实例对象
     * @return 实例对象
     */
    Sender insert(Sender sender);

    /**
     * 修改数据
     *
     * @param sender 实例对象
     * @return 实例对象
     */
    Sender update(Sender sender);

    /**
     * 通过主键删除数据
     *
     * @param sId 主键
     * @return 是否成功
     */
    boolean deleteById(Integer sId);

}
