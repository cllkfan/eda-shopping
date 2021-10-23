package com.eda.service;

import com.eda.entity.Gimg;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

/**
 * (Gimg)表服务接口
 *
 * @author makejava
 * @since 2021-10-23 19:25:12
 */
public interface GimgService {

    /**
     * 通过ID查询单条数据
     *
     * @param gimgId 主键
     * @return 实例对象
     */
    Gimg queryById(Integer gimgId);

    /**
     * 分页查询
     *
     * @param gimg 筛选条件
     * @return 查询结果
     */
    Page<Gimg> queryByPage(Gimg gimg);

    /**
     * 新增数据
     *
     * @param gimg 实例对象
     * @return 实例对象
     */
    Gimg insert(Gimg gimg);

    /**
     * 修改数据
     *
     * @param gimg 实例对象
     * @return 实例对象
     */
    Gimg update(Gimg gimg);

    /**
     * 通过主键删除数据
     *
     * @param gimgId 主键
     * @return 是否成功
     */
    boolean deleteById(Integer gimgId);

}
