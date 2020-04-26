package com.example.demo.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * (ShopUserToken)实体类
 *
 * @author makejava
 * @since 2020-04-19 15:35:28
 */
public class ShopUserToken implements Serializable {
    private static final long serialVersionUID = 281545753510935897L;
    
    private Integer id;
    
    private String token;
    
    private String loginType;
    
    private String deviceInfor;
    
    private Integer isAvailability;
    
    private Integer userId;
    
    private Date createTime;
    
    private Date updateTime;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getLoginType() {
        return loginType;
    }

    public void setLoginType(String loginType) {
        this.loginType = loginType;
    }

    public String getDeviceInfor() {
        return deviceInfor;
    }

    public void setDeviceInfor(String deviceInfor) {
        this.deviceInfor = deviceInfor;
    }

    public Integer getIsAvailability() {
        return isAvailability;
    }

    public void setIsAvailability(Integer isAvailability) {
        this.isAvailability = isAvailability;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

}