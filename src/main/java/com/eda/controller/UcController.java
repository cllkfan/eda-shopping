package com.eda.controller;

import com.eda.entity.Uc;
import com.eda.service.UcService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (Uc)表控制层
 *
 * @author makejava
 * @since 2021-10-23 19:25:20
 */
@RestController
@RequestMapping("uc")
public class UcController {
    /**
     * 服务对象
     */
    @Resource
    private UcService ucService;


}

