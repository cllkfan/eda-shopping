package com.eda.controller;

import com.eda.entity.Paccount;
import com.eda.service.PaccountService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (Paccount)表控制层
 *
 * @author makejava
 * @since 2021-10-23 19:25:13
 */
@RestController
@RequestMapping("paccount")
public class PaccountController {
    /**
     * 服务对象
     */
    @Resource
    private PaccountService paccountService;


}

