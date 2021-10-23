package com.eda.service;

import com.eda.entity.Reciever;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

/**
 * (Reciever)表服务接口
 *
 * @author makejava
 * @since 2021-10-23 19:25:15
 */
public interface RecieverService {

    /**
     * 通过ID查询单条数据
     *
     * @param rId 主键
     * @return 实例对象
     */
    Reciever queryById(Integer rId);

    /**
     * 分页查询
     *
     * @param reciever 筛选条件
     * @return 查询结果
     */
    Page<Reciever> queryByPage(Reciever reciever);

    /**
     * 新增数据
     *
     * @param reciever 实例对象
     * @return 实例对象
     */
    Reciever insert(Reciever reciever);

    /**
     * 修改数据
     *
     * @param reciever 实例对象
     * @return 实例对象
     */
    Reciever update(Reciever reciever);

    /**
     * 通过主键删除数据
     *
     * @param rId 主键
     * @return 是否成功
     */
    boolean deleteById(Integer rId);

}
