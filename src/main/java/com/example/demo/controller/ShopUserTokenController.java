package com.example.demo.controller;

import com.example.demo.entity.ShopUserToken;
import com.example.demo.service.ShopUserTokenService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (ShopUserToken)表控制层
 *
 * @author makejava
 * @since 2020-04-19 15:35:28
 */
@RestController
@RequestMapping("shopUserToken")
public class ShopUserTokenController {
    /**
     * 服务对象
     */
    @Resource
    private ShopUserTokenService shopUserTokenService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public ShopUserToken selectOne(Integer id) {
        return this.shopUserTokenService.queryById(id);
    }

}