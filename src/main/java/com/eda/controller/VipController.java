package com.eda.controller;

import com.eda.entity.Vip;
import com.eda.service.VipService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (Vip)表控制层
 *
 * @author makejava
 * @since 2021-10-23 19:25:22
 */
@RestController
@RequestMapping("vip")
public class VipController {
    /**
     * 服务对象
     */
    @Resource
    private VipService vipService;


}

