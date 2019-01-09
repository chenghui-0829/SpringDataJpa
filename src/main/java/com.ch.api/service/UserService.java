package com.ch.api.service;

import com.ch.api.bean.UserInfo;

public interface UserService {
    void save(UserInfo info);

    boolean existsUser(String tel);

    UserInfo findUserInfoByTel(String tel);
}
