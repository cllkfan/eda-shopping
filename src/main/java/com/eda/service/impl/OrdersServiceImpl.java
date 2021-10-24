package com.eda.service.impl;

import com.eda.entity.Orders;
import com.eda.service.OrdersService;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;

import javax.annotation.Resource;

/**
 * (Orders)表服务实现类
 *
 * @author makejava
 * @since 2021-10-23 19:25:13
 */
@Service("ordersService")
public class OrdersServiceImpl implements OrdersService {
//    @Resource
//    private OrdersDao ordersDao;
//
//    /**
//     * 通过ID查询单条数据
//     *
//     * @param oId 主键
//     * @return 实例对象
//     */
//    @Override
//    public Orders queryById(Integer oId) {
//        return this.ordersDao.queryById(oId);
//    }
//
//    /**
//     * 分页查询
//     *
//     * @param orders 筛选条件
//     * @return 查询结果
//     */
//    @Override
//    public Page<Orders> queryByPage(Orders orders) {
//        long total = this.ordersDao.count(orders);
//        return new PageImpl<>(this.ordersDao.queryAllByLimit(orders, pageRequest), pageRequest, total);
//    }
//
//    /**
//     * 新增数据
//     *
//     * @param orders 实例对象
//     * @return 实例对象
//     */
//    @Override
//    public Orders insert(Orders orders) {
//        this.ordersDao.insert(orders);
//        return orders;
//    }
//
//    /**
//     * 修改数据
//     *
//     * @param orders 实例对象
//     * @return 实例对象
//     */
//    @Override
//    public Orders update(Orders orders) {
//        this.ordersDao.update(orders);
//        return this.queryById(orders.getOId());
//    }
//
//    /**
//     * 通过主键删除数据
//     *
//     * @param oId 主键
//     * @return 是否成功
//     */
//    @Override
//    public boolean deleteById(Integer oId) {
//        return this.ordersDao.deleteById(oId) > 0;
//    }
}
