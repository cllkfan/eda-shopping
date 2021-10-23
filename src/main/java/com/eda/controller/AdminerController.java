package com.eda.controller;

import com.eda.entity.Adminer;
import com.eda.service.AdminerService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (Adminer)表控制层
 *
 * @author makejava
 * @since 2021-10-23 19:23:17
 */
@RestController
@RequestMapping("adminer")
public class AdminerController {
    /**
     * 服务对象
     */
    @Resource
    private AdminerService adminerService;


}

