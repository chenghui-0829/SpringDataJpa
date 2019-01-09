package com.ch.api.controller;

import com.ch.api.bean.ResultInfo;
import com.ch.api.bean.UserInfo;
import com.ch.api.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping(value = "/login")
    public ResultInfo save(@RequestParam("tel") String tel) {

        ResultInfo resultInfo = new ResultInfo();
        boolean exists = userService.existsUser(tel);

        if (exists) {
            System.out.println("====用户已存在=====");
            resultInfo.setCode(200);
            resultInfo.setMsg("登录成功");
            resultInfo.setData("");
            return resultInfo;
        }

        UserInfo userInfo = new UserInfo();
        String uid = UUID.randomUUID().toString();
        userInfo.setName("用户" + uid.substring(uid.length() - 6, uid.length()));
        userInfo.setUid(uid);
        userInfo.setTel(tel);
        userService.save(userInfo);
        resultInfo.setCode(200);
        resultInfo.setMsg("登录成功");
        resultInfo.setData("");
        return resultInfo;
    }


}
