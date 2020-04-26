package com.example.demo.controller;

import com.alibaba.fastjson.JSONObject;
import com.example.demo.base.BaseResponse;
import com.example.demo.service.ShopUserService;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * 用户会员表(ShopUser)表控制层
 *
 * @author makejava
 * @since 2020-04-19 15:35:27
 */
@RestController
@RequestMapping("shopUser")
public class ShopUserController {
    /**
     * 服务对象
     */
    @Resource
    private ShopUserService shopUserService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public BaseResponse<JSONObject> selectOne(@Validated Integer id) {
        return this.shopUserService.queryById(id);
    }

}