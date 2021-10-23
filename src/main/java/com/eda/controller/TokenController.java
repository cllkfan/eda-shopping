package com.eda.controller;

import com.eda.entity.Token;
import com.eda.service.TokenService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (Token)表控制层
 *
 * @author makejava
 * @since 2021-10-23 19:25:18
 */
@RestController
@RequestMapping("token")
public class TokenController {
    /**
     * 服务对象
     */
    @Resource
    private TokenService tokenService;


}

