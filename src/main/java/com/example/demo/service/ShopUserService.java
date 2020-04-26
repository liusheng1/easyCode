package com.example.demo.service;

import com.alibaba.fastjson.JSONObject;
import com.example.demo.base.BaseResponse;
import com.example.demo.entity.ShopUser;

import java.util.List;

/**
 * 用户会员表(ShopUser)表服务接口
 *
 * @author makejava
 * @since 2020-04-19 15:35:27
 */
public interface ShopUserService {

    /**
     * 通过ID查询单条数据
     *
     * @param userId 主键
     * @return 实例对象
     */
    BaseResponse<JSONObject> queryById(Integer userId);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<ShopUser> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param shopUser 实例对象
     * @return 实例对象
     */
    ShopUser insert(ShopUser shopUser);

    /**
     * 修改数据
     *
     * @param shopUser 实例对象
     * @return 实例对象
     */
    ShopUser update(ShopUser shopUser);

    /**
     * 通过主键删除数据
     *
     * @param userId 主键
     * @return 是否成功
     */
    boolean deleteById(Integer userId);

}