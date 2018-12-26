package com.ch.api.controller;

import com.ch.api.bean.UserInfo;
import com.ch.api.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("save")
    public String save() {

        UserInfo userInfo = new UserInfo();
        userInfo.setName("张2");
        userService.save(userInfo);
        return "保存成功";
    }

}
