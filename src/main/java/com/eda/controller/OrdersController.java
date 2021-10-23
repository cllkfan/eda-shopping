package com.eda.controller;

import com.eda.entity.Orders;
import com.eda.service.OrdersService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (Orders)表控制层
 *
 * @author makejava
 * @since 2021-10-23 19:25:12
 */
@RestController
@RequestMapping("orders")
public class OrdersController {
    /**
     * 服务对象
     */
    @Resource
    private OrdersService ordersService;


}

