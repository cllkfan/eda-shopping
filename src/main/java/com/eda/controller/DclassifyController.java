package com.eda.controller;

import com.eda.entity.Dclassify;
import com.eda.service.DclassifyService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (Dclassify)表控制层
 *
 * @author makejava
 * @since 2021-10-23 19:25:10
 */
@RestController
@RequestMapping("dclassify")
public class DclassifyController {
    /**
     * 服务对象
     */
    @Resource
    private DclassifyService dclassifyService;


}

