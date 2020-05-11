package com.example.demo.controller;

import com.alibaba.fastjson.JSONObject;
import com.example.demo.base.BaseApiService;
import com.example.demo.base.BaseResponse;
import com.example.demo.constants.Constants;
import com.example.demo.service.ShopUserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.websocket.server.PathParam;

/**
 * 用户会员表(ShopUser)表控制层
 *
 * @author makejava
 * @since 2020-04-19 15:35:27
 */
@Slf4j
@RestController
@RequestMapping("shopUser")
public class ShopUserController extends BaseApiService {
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

        return setResult(Constants.HTTP_RES_CODE_200, Constants.HTTP_RES_CODE_200_VALUE, this.shopUserService.queryById(id));
    }

    @GetMapping("selectOnes")
    public BaseResponse<JSONObject> selectOnes(HttpServletRequest request, HttpServletResponse response,
                                               @PathParam("id") Integer id) {

        response.setHeader("X_user_token", "dajiahao");


        return setResult(Constants.HTTP_RES_CODE_200, Constants.HTTP_RES_CODE_200_VALUE, this.shopUserService.queryById(id));


    }

}