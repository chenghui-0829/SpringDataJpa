package com.ch.api.controller;

import com.ch.api.bean.CjInfo;
import com.ch.api.bean.ResultInfo;
import com.ch.api.service.CjService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

@RestController
public class CjController {

    @Autowired
    private CjService cjService;

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

        ArrayList<CjInfo> list = cjService.findAll();

        ResultInfo resultInfo = new ResultInfo();
        resultInfo.setCode(200);
        resultInfo.setMsg("获取成功");
        resultInfo.setData(list);
        return resultInfo;
    }

}
