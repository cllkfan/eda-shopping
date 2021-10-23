package com.eda.service;

import com.eda.entity.Dclassify;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

/**
 * (Dclassify)表服务接口
 *
 * @author makejava
 * @since 2021-10-23 19:25:11
 */
public interface DclassifyService {

    /**
     * 通过ID查询单条数据
     *
     * @param dId 主键
     * @return 实例对象
     */
    Dclassify queryById(Integer dId);

    /**
     * 分页查询
     *
     * @param dclassify 筛选条件
     * @return 查询结果
     */
    Page<Dclassify> queryByPage(Dclassify dclassify);

    /**
     * 新增数据
     *
     * @param dclassify 实例对象
     * @return 实例对象
     */
    Dclassify insert(Dclassify dclassify);

    /**
     * 修改数据
     *
     * @param dclassify 实例对象
     * @return 实例对象
     */
    Dclassify update(Dclassify dclassify);

    /**
     * 通过主键删除数据
     *
     * @param dId 主键
     * @return 是否成功
     */
    boolean deleteById(Integer dId);

}
