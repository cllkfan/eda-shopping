package com.eda.controller;

import com.eda.entity.Shoppingcar;
import com.eda.service.ShoppingcarService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (Shoppingcar)表控制层
 *
 * @author makejava
 * @since 2021-10-23 19:25:16
 */
@RestController
@RequestMapping("shoppingcar")
public class ShoppingcarController {
    /**
     * 服务对象
     */
    @Resource
    private ShoppingcarService shoppingcarService;


}

