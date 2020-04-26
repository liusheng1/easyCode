package com.example.demo.entity;

import com.example.demo.base.BaseDo;
import lombok.Data;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;
import java.io.Serializable;
import java.util.Date;

/**
 * 用户会员表(ShopUser)实体类
 *
 * @author makejava
 * @since 2020-04-19 15:35:27
 */
@Data
public class ShopUser extends BaseDo implements Serializable {
    private static final long serialVersionUID = -96938465767632377L;
    /**
    * user_id
    */
    @NotEmpty(message = "id 不能为空")
    private Integer userId;
    /**
    * 手机号
    */
    @NotBlank
    @NotEmpty
    private String mobile;
    /**
    * 邮箱号
    */
    @NotEmpty
    @Email
    private String email;
    /**
    * 密码
    */
    @Pattern(regexp = "hjsdjkhfdsjkhffjkh",message = "njknhjklhfjkh")
    private String password;
    /**
    * 用户名
    */
    private String userName;
    /**
    * 性别  1男  2女
    */
    private Object sex;
    /**
    * 年龄
    */
    private Object age;
    /**
    * 注册时间
    */
    private Date createTime;
    /**
    * 是否可用 1正常  2冻结
    */
    private Object isAvalible;
    /**
    * 用户头像
    */
    private String picImg;
    /**
    * QQ联合登陆id
    */
    private String qqOpenid;
    /**
    * 微信公众号关注id
    */
    private String wxOpenid;


    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Object getSex() {
        return sex;
    }

    public void setSex(Object sex) {
        this.sex = sex;
    }

    public Object getAge() {
        return age;
    }

    public void setAge(Object age) {
        this.age = age;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Object getIsAvalible() {
        return isAvalible;
    }

    public void setIsAvalible(Object isAvalible) {
        this.isAvalible = isAvalible;
    }

    public String getPicImg() {
        return picImg;
    }

    public void setPicImg(String picImg) {
        this.picImg = picImg;
    }

    public String getQqOpenid() {
        return qqOpenid;
    }

    public void setQqOpenid(String qqOpenid) {
        this.qqOpenid = qqOpenid;
    }

    public String getWxOpenid() {
        return wxOpenid;
    }

    public void setWxOp0enid(String wxOpenid) {
        this.wxOpenid = wxOpenid;
    }

}