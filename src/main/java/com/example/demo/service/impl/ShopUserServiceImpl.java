package com.example.demo.service.impl;


import com.alibaba.fastjson.JSONObject;
import com.example.demo.base.BaseApiService;
import com.example.demo.base.BaseResponse;
import com.example.demo.dao.ShopUserDao;
import com.example.demo.entity.ShopUser;
import com.example.demo.service.ShopUserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

import javax.annotation.Resource;
import java.util.List;

/**
 * 用户会员表(ShopUser)表服务实现类
 *
 * @author makejava
 * @since 2020-04-19 15:35:27
 */
@Slf4j
@Service("shopUserService")
public class ShopUserServiceImpl extends BaseApiService implements ShopUserService {
    @Resource
    private ShopUserDao shopUserDao;

    /**
     * 通过ID查询单条数据
     *
     * @param userId 主键
     * @return 实例对象
     */
    @Override
    public BaseResponse<JSONObject> queryById(@Validated  Integer userId) {

            log.warn("ShopUserServiceImpl.queryById,params={}",userId);
            JSONObject jsonObject = new JSONObject();
            jsonObject.put("results",shopUserDao.queryById(userId));
            log.warn("ShopUserServiceImpl.queryById,result={}",jsonObject);
            return setResult(200,"success",jsonObject);



    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<ShopUser> queryAllByLimit(int offset, int limit) {
        return this.shopUserDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param shopUser 实例对象
     * @return 实例对象
     */
    @Override
    public ShopUser insert(ShopUser shopUser) {
        this.shopUserDao.insert(shopUser);
        return shopUser;
    }

    /**
     * 修改数据
     *
     * @param shopUser 实例对象
     * @return 实例对象
     */
    @Override
    public ShopUser update(ShopUser shopUser) {
        this.shopUserDao.update(shopUser);
        return null;
    }

    /**
     * 通过主键删除数据
     *
     * @param userId 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer userId) {
        return this.shopUserDao.deleteById(userId) > 0;
    }
}