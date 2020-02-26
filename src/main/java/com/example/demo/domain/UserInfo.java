package com.example.demo.domain;

import lombok.Data;

/**
 * UserInfo
 *
 * @Description 用户信息
 * @Author renyufeng
 * @Date 2020/2/26 10:52
 **/
@Data
public class UserInfo {

    /** pk **/
    private Integer userId;

    /** 用户名 **/
    private String userName;

    /** 真实姓名 **/
    private String realName;

    /** 电话 **/
    private String phone;

    /** 备注 **/
    private String remark;
}
