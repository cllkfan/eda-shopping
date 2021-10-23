package com.eda.controller;

import com.eda.entity.Track;
import com.eda.service.TrackService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (Track)表控制层
 *
 * @author makejava
 * @since 2021-10-23 19:25:19
 */
@RestController
@RequestMapping("track")
public class TrackController {
    /**
     * 服务对象
     */
    @Resource
    private TrackService trackService;


}

