package com.eda.service;

import com.eda.entity.Classify;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

/**
 * (Classify)表服务接口
 *
 * @author makejava
 * @since 2021-10-23 19:25:08
 */
public interface ClassifyService {

    /**
     * 通过ID查询单条数据
     *
     * @param cId 主键
     * @return 实例对象
     */
    Classify queryById(Integer cId);

    /**
     * 分页查询
     *
     * @param classify 筛选条件
     * @return 查询结果
     */
    Page<Classify> queryByPage(Classify classify);

    /**
     * 新增数据
     *
     * @param classify 实例对象
     * @return 实例对象
     */
    Classify insert(Classify classify);

    /**
     * 修改数据
     *
     * @param classify 实例对象
     * @return 实例对象
     */
    Classify update(Classify classify);

    /**
     * 通过主键删除数据
     *
     * @param cId 主键
     * @return 是否成功
     */
    boolean deleteById(Integer cId);

}
