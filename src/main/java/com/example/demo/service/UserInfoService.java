package com.example.demo.service;

import com.example.demo.domain.UserInfo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * UserInfoService
 *
 * @Description
 * @Author renyufeng
 * @Date 2020/2/26 11:05
 **/
public interface UserInfoService {

    /**
     * 获取所有的学生
     * @return 学生信息列表
     */
    List<UserInfo> selectList(@Param("realName") String realName);

    /**
     * 添加学生
     * @param userInfo 用户信息
     */
    void insertUserInfo(UserInfo userInfo);

    /**
     * 根据ID查询
     * @param userId pk
     */
    UserInfo getUserInfoById(@Param("userId") Integer userId);

    /**
     * 修改学生
     * @param userInfo 用户信息
     */
    void updateUserInfoBtId(UserInfo userInfo);

    /**
     * 删除学生
     * @param userId pk
     */
    void deleteUserInfoById(@Param("userId") Integer userId);
}
