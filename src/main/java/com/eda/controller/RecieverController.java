package com.eda.controller;

import com.eda.entity.Reciever;
import com.eda.service.RecieverService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (Reciever)表控制层
 *
 * @author makejava
 * @since 2021-10-23 19:25:14
 */
@RestController
@RequestMapping("reciever")
public class RecieverController {
    /**
     * 服务对象
     */
    @Resource
    private RecieverService recieverService;


}

