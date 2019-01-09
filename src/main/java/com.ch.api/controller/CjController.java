package com.ch.api.controller;

import com.ch.api.bean.*;
import com.ch.api.service.CjService;
import com.ch.api.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Set;

@RestController
public class CjController {

    @Autowired
    private CjService cjService;
    @Autowired
    private UserService userService;

    @PostMapping(value = "/createCj")
    public ResultInfo createCj(@RequestParam("cjzt") String cjzt, @RequestParam("jpnr") String jpnr,
                               @RequestParam("cytj") String cytj, @RequestParam("fqUser") String fqUser) {

        SimpleDateFormat sDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String time = sDateFormat.format(new Date());

        ResultInfo resultInfo = new ResultInfo();
        CjInfo cjInfo = new CjInfo();
        cjInfo.setCjzt(cjzt);
        cjInfo.setJpnr(jpnr);
        cjInfo.setCytj(cytj);
        cjInfo.setCreatTime(time);
        cjInfo.setFqUser(fqUser);
        cjService.save(cjInfo);

        resultInfo.setCode(200);
        resultInfo.setMsg("发起成功");
        resultInfo.setData("");
        return resultInfo;

    }

    @GetMapping("/getCjList")
    public ResultInfo getCjList() {

        List<CjListEntity> list = cjService.getCjList();

        ResultInfo resultInfo = new ResultInfo();
        resultInfo.setCode(200);
        resultInfo.setMsg("获取成功");
        resultInfo.setData(list);
        return resultInfo;
    }

    @GetMapping("/getCjDetails")
    public ResultInfo getCjDetails(@RequestParam("cjId") int cjId) {

        CjInfo cjInfo = cjService.findCjInfoByCjid(cjId);
        ResultInfo resultInfo = new ResultInfo();
        resultInfo.setCode(200);
        resultInfo.setMsg("获取成功");
        resultInfo.setData(cjInfo);
        return resultInfo;
    }


    @GetMapping(value = "/joinCj")
    public ResultInfo addCjUser(@RequestParam("tel") String tel, @RequestParam("cjid") int cjid) {

        SimpleDateFormat sDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String time = sDateFormat.format(new Date());

        ResultInfo result = new ResultInfo();
        CjUser cjUser = new CjUser();
        UserInfo userInfo = userService.findUserInfoByTel(tel);
        cjUser.setUserInfo(userInfo);
        cjUser.setTime(time);
        CjInfo cjInfo = cjService.findCjInfoByCjid(cjid);
        List<CjUser> cjUserSet = cjInfo.getCjUsers();
        cjUserSet.add(cjUser);
        cjInfo.setCjUsers(cjUserSet);

        result.setCode(200);
        result.setMsg("参与成功");
        result.setData("");
        return result;
    }
}
