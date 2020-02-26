package com.example.demo.service.impl;

import com.example.demo.domain.UserInfo;
import com.example.demo.mapper.UserInfoMapper;
import com.example.demo.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * UserInfoServiceImpl
 *
 * @Description
 * @Author renyufeng
 * @Date 2020/2/26 11:06
 **/
@Service
public class UserInfoServiceImpl implements UserInfoService {

    @Autowired private UserInfoMapper userInfoMapper;

    @Override
    public List<UserInfo> selectList(String realName) {
        return userInfoMapper.selectList(realName);
    }

    @Override
    public void insertUserInfo(UserInfo userInfo) {
        userInfoMapper.insertUserInfo(userInfo);
    }

    @Override
    public UserInfo getUserInfoById(Integer userId) {
        return userInfoMapper.getUserInfoById(userId);
    }

    @Override
    public void updateUserInfoBtId(UserInfo userInfo) {
        userInfoMapper.updateUserInfoBtId(userInfo);
    }

    @Override
    public void deleteUserInfoById(Integer userId) {
        userInfoMapper.deleteUserInfoById(userId);
    }
}
