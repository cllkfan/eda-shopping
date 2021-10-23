package com.eda.controller;

import com.eda.entity.Coupon;
import com.eda.service.CouponService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (Coupon)表控制层
 *
 * @author makejava
 * @since 2021-10-23 19:25:09
 */
@RestController
@RequestMapping("coupon")
public class CouponController {
    /**
     * 服务对象
     */
    @Resource
    private CouponService couponService;


}

