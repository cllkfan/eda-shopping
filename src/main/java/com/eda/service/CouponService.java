package com.eda.service;

import com.eda.entity.Coupon;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

/**
 * (Coupon)表服务接口
 *
 * @author makejava
 * @since 2021-10-23 19:25:10
 */
public interface CouponService {

    /**
     * 通过ID查询单条数据
     *
     * @param cId 主键
     * @return 实例对象
     */
    Coupon queryById(Integer cId);

    /**
     * 分页查询
     *
     * @param coupon 筛选条件
     * @return 查询结果
     */
    Page<Coupon> queryByPage(Coupon coupon);

    /**
     * 新增数据
     *
     * @param coupon 实例对象
     * @return 实例对象
     */
    Coupon insert(Coupon coupon);

    /**
     * 修改数据
     *
     * @param coupon 实例对象
     * @return 实例对象
     */
    Coupon update(Coupon coupon);

    /**
     * 通过主键删除数据
     *
     * @param cId 主键
     * @return 是否成功
     */
    boolean deleteById(Integer cId);

}
