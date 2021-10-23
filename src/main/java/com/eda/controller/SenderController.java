package com.eda.controller;

import com.eda.entity.Sender;
import com.eda.service.SenderService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (Sender)表控制层
 *
 * @author makejava
 * @since 2021-10-23 19:25:15
 */
@RestController
@RequestMapping("sender")
public class SenderController {
    /**
     * 服务对象
     */
    @Resource
    private SenderService senderService;


}

