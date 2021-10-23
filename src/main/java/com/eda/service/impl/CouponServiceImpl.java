package com.eda.service.impl;

import com.eda.entity.Coupon;
import com.eda.mapper.CouponMapper;
import com.eda.service.CouponService;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;

import javax.annotation.Resource;

/**
 * (Coupon)表服务实现类
 *
 * @author makejava
 * @since 2021-10-23 19:25:10
 */
@Service("couponService")
public class CouponServiceImpl implements CouponService {
    @Resource
    private CouponDao couponDao;

    /**
     * 通过ID查询单条数据
     *
     * @param cId 主键
     * @return 实例对象
     */
    @Override
    public Coupon queryById(Integer cId) {
        return this.couponDao.queryById(cId);
    }

    /**
     * 分页查询
     *
     * @param coupon 筛选条件
     * @return 查询结果
     */
    @Override
    public Page<Coupon> queryByPage(Coupon coupon) {
        long total = this.couponDao.count(coupon);
        return new PageImpl<>(this.couponDao.queryAllByLimit(coupon, pageRequest), pageRequest, total);
    }

    /**
     * 新增数据
     *
     * @param coupon 实例对象
     * @return 实例对象
     */
    @Override
    public Coupon insert(Coupon coupon) {
        this.couponDao.insert(coupon);
        return coupon;
    }

    /**
     * 修改数据
     *
     * @param coupon 实例对象
     * @return 实例对象
     */
    @Override
    public Coupon update(Coupon coupon) {
        this.couponDao.update(coupon);
        return this.queryById(coupon.getCId());
    }

    /**
     * 通过主键删除数据
     *
     * @param cId 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer cId) {
        return this.couponDao.deleteById(cId) > 0;
    }
}
