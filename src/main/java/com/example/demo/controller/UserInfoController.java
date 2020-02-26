package com.example.demo.controller;

import com.example.demo.domain.UserInfo;
import com.example.demo.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * UserInfoController
 *
 * @Description
 * @Author renyufeng
 * @Date 2020/2/26 11:08
 **/
@RestController
@RequestMapping("/user")
public class UserInfoController {

    @Autowired
    private UserInfoService userInfoService;

    @RequestMapping("/index")
    public ModelAndView index(String name) {
        ModelAndView view = new ModelAndView("/user/list");
        List<UserInfo> userInfoList = userInfoService.selectList(name);
        view.addObject("userList", userInfoList);
        return view;
    }

    @RequestMapping("/modify")
    public ModelAndView update(@RequestParam(value = "userId", required = false) Integer userId) {
        ModelAndView view = new ModelAndView("/user/insert");
        if (userId != null) {
            view = new ModelAndView("/user/modify");
            UserInfo userInfo = userInfoService.getUserInfoById(userId);
            view.addObject("userInfo", userInfo);
        }
        return view;
    }

    @RequestMapping("/save")
    public void save(UserInfo userInfo, HttpServletRequest request, HttpServletResponse response) {
        if (userInfo.getUserId() != null) {
            userInfoService.updateUserInfoBtId(userInfo);
        } else {
            userInfoService.insertUserInfo(userInfo);
        }
        try {
            request.getRequestDispatcher("/user/index").forward(request, response);
        } catch (ServletException | IOException e) {
            e.printStackTrace();
        }
    }

    @RequestMapping("/delete")
    public void delete(Integer userId, HttpServletRequest request, HttpServletResponse response) {
        userInfoService.deleteUserInfoById(userId);
        try {
            request.getRequestDispatcher("/user/index").forward(request, response);
        } catch (ServletException | IOException e) {
            e.printStackTrace();
        }
    }
}
