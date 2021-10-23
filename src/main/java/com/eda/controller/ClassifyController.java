package com.eda.controller;

import com.eda.entity.Classify;
import com.eda.service.ClassifyService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (Classify)表控制层
 *
 * @author makejava
 * @since 2021-10-23 19:25:08
 */
@RestController
@RequestMapping("classify")
public class ClassifyController {
    /**
     * 服务对象
     */
    @Resource
    private ClassifyService classifyService;


}

