package com.example.demo.controller;

import com.example.demo.entity.ShopUserToken;
import com.example.demo.service.ShopUserTokenService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

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
    public ShopUserToken selectOne(HttpServletRequest request, HttpServletResponse response, Integer id) {
        return this.shopUserTokenService.queryById(response,request,id);
    }

}