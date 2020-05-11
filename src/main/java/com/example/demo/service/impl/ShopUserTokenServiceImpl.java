package com.example.demo.service.impl;

import com.example.demo.entity.ShopUserToken;
import com.example.demo.dao.ShopUserTokenDao;
import com.example.demo.service.ShopUserTokenService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * (ShopUserToken)表服务实现类
 *
 * @author makejava
 * @since 2020-04-19 15:35:28
 */
@Service("shopUserTokenService")
public class ShopUserTokenServiceImpl implements ShopUserTokenService {
    @Resource
    private ShopUserTokenDao shopUserTokenDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */


    @Override
    public ShopUserToken queryById(HttpServletResponse response, HttpServletRequest request, Integer id) {
        String x_user_tokrn = request.getHeader("X_user_token");
        if(x_user_tokrn.equals("dajiahao")){
           return  this.shopUserTokenDao.queryById(id) ;
        }else {
            return  null ;
        }

    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<ShopUserToken> queryAllByLimit(int offset, int limit) {
        return this.shopUserTokenDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param shopUserToken 实例对象
     * @return 实例对象
     */
    @Override
    public ShopUserToken insert(ShopUserToken shopUserToken) {
        this.shopUserTokenDao.insert(shopUserToken);
        return shopUserToken;
    }

    /**
     * 修改数据
     *
     * @param shopUserToken 实例对象
     * @return 实例对象
     */
    @Override
    public ShopUserToken update(ShopUserToken shopUserToken) {
        this.shopUserTokenDao.update(shopUserToken);
      //  return this.queryById(shopUserToken.getId());
        return  null;
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.shopUserTokenDao.deleteById(id) > 0;
    }
}