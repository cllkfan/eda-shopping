package com.eda.controller;

import com.eda.entity.TbItem;
import com.eda.service.TbItemService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (TbItem)表控制层
 *
 * @author makejava
 * @since 2021-10-23 19:25:17
 */
@RestController
@RequestMapping("tbItem")
public class TbItemController {
    /**
     * 服务对象
     */
    @Resource
    private TbItemService tbItemService;


}

