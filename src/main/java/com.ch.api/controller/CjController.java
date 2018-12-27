package com.ch.api.controller;

import com.ch.api.bean.CjInfo;
import com.ch.api.bean.ResultInfo;
import com.ch.api.service.CjService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class CjController {

    @Autowired
    private CjService cjService;

    @PostMapping(value = "/createCj")
    public ResultInfo createCj(@RequestParam("cjzt") String cjzt, @RequestParam("jpnr") String jpnr,
                               @RequestParam("cytj") String cytj, @RequestParam("creatTime") Date creatTime) {

        ResultInfo resultInfo = new ResultInfo();
        CjInfo cjInfo = new CjInfo();
        cjInfo.setCjzt(cjzt);
        cjInfo.setJpnr(jpnr);
        cjInfo.setCytj(cytj);
        cjInfo.setCreatTime(creatTime);
        cjService.save(cjInfo);

        resultInfo.setCode(200);
        resultInfo.setMsg("发起成功");
        resultInfo.setData("");
        return resultInfo;

    }
}
