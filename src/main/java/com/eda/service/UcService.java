package com.eda.service;

import com.eda.entity.Uc;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

/**
 * (Uc)表服务接口
 *
 * @author makejava
 * @since 2021-10-23 19:25:21
 */
public interface UcService {

    /**
     * 通过ID查询单条数据
     *
     * @param uId 主键
     * @return 实例对象
     */
    Uc queryById(Integer uId);

    /**
     * 分页查询
     *
     * @param uc 筛选条件
     * @return 查询结果
     */
    Page<Uc> queryByPage(Uc uc);

    /**
     * 新增数据
     *
     * @param uc 实例对象
     * @return 实例对象
     */
    Uc insert(Uc uc);

    /**
     * 修改数据
     *
     * @param uc 实例对象
     * @return 实例对象
     */
    Uc update(Uc uc);

    /**
     * 通过主键删除数据
     *
     * @param uId 主键
     * @return 是否成功
     */
    boolean deleteById(Integer uId);

}
