package com.ch.api.service;

import com.ch.api.bean.CjUser;
import com.ch.api.dao.CjUserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CjUserServiceImp implements CjUserService {
    @Autowired
    private CjUserDao cjUserDao;

    @Override
    public void addCjUser(CjUser cjUser) {

        cjUserDao.save(cjUser);
    }
}
