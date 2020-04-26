package com.example.demo.service;

import com.example.demo.entity.ShopUserToken;
import java.util.List;

/**
 * (ShopUserToken)表服务接口
 *
 * @author makejava
 * @since 2020-04-19 15:35:28
 */
public interface ShopUserTokenService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    ShopUserToken queryById(Integer id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<ShopUserToken> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param shopUserToken 实例对象
     * @return 实例对象
     */
    ShopUserToken insert(ShopUserToken shopUserToken);

    /**
     * 修改数据
     *
     * @param shopUserToken 实例对象
     * @return 实例对象
     */
    ShopUserToken update(ShopUserToken shopUserToken);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

}