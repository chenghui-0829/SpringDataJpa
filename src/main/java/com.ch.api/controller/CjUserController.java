package com.ch.api.controller;

import com.ch.api.bean.CjInfo;
import com.ch.api.bean.CjUser;
import com.ch.api.bean.ResultInfo;
import com.ch.api.bean.UserInfo;
import com.ch.api.service.CjService;
import com.ch.api.service.CjUserService;
import com.ch.api.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.Date;

@RestController
public class CjUserController {
    @Autowired
    private CjUserService service;
    @Autowired
    private UserService userService;
    @Autowired
    private CjService cjService;

    @GetMapping(value = "/joinCj")
    public ResultInfo addCjUser(@RequestParam("uid") String uid, @RequestParam("cjid") int cjid) {

        SimpleDateFormat sDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String time = sDateFormat.format(new Date());

        ResultInfo result = new ResultInfo();
        CjUser cjUser = new CjUser();
        UserInfo userInfo = userService.findUserInfoByUid(uid);
        CjInfo cjInfo = cjService.findCjInfoByCjid(cjid);
        cjUser.setUserInfo(userInfo);
        cjUser.setCjInfo(cjInfo);
        cjUser.setTime(time);
        service.addCjUser(cjUser);
        result.setCode(200);
        result.setMsg("参与成功");
        result.setData("");
        return result;
    }


}
