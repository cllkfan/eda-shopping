package com.eda.controller;

import com.eda.entity.Gimg;
import com.eda.service.GimgService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (Gimg)表控制层
 *
 * @author makejava
 * @since 2021-10-23 19:25:11
 */
@RestController
@RequestMapping("gimg")
public class GimgController {
    /**
     * 服务对象
     */
    @Resource
    private GimgService gimgService;


}

