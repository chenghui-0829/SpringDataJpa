package com.ch.api.service;

import com.ch.api.bean.UserInfo;
import com.ch.api.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImp implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public void save(UserInfo info) {

        userDao.save(info);
    }

    @Override
    public boolean existsUser(String tel) {
        return userDao.existsUserInfoByTel(tel);
    }

    @Override
    public UserInfo findUserInfoByTel(String tel) {
        return userDao.findUserInfoByTel(tel);
    }
}
