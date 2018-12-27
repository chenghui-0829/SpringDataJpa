package com.ch.api.service;

import com.ch.api.bean.CjInfo;
import com.ch.api.dao.CjDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CjServiceImp implements CjService {
    @Autowired
    private CjDao cjDao;

    @Override
    public void save(CjInfo cjInfo) {

        cjDao.save(cjInfo);
    }
}
