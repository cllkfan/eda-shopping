package com.eda.service;

import com.eda.entity.Paccount;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

/**
 * (Paccount)表服务接口
 *
 * @author makejava
 * @since 2021-10-23 19:25:14
 */
public interface PaccountService {

    /**
     * 通过ID查询单条数据
     *
     * @param pacId 主键
     * @return 实例对象
     */
    Paccount queryById(Integer pacId);

    /**
     * 分页查询
     *
     * @param paccount 筛选条件
     * @return 查询结果
     */
    Page<Paccount> queryByPage(Paccount paccount);

    /**
     * 新增数据
     *
     * @param paccount 实例对象
     * @return 实例对象
     */
    Paccount insert(Paccount paccount);

    /**
     * 修改数据
     *
     * @param paccount 实例对象
     * @return 实例对象
     */
    Paccount update(Paccount paccount);

    /**
     * 通过主键删除数据
     *
     * @param pacId 主键
     * @return 是否成功
     */
    boolean deleteById(Integer pacId);

}
