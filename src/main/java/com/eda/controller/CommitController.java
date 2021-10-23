package com.eda.controller;

import com.eda.entity.Commit;
import com.eda.service.CommitService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (Commit)表控制层
 *
 * @author makejava
 * @since 2021-10-23 19:25:08
 */
@RestController
@RequestMapping("commit")
public class CommitController {
    /**
     * 服务对象
     */
    @Resource
    private CommitService commitService;


}

