package com.ch.api.dao;

import com.ch.api.bean.UserInfo;
import org.springframework.data.repository.Repository;

public interface UserDao extends Repository<UserInfo, String> {

    void save(UserInfo userInfo);

    Boolean existsUserInfoByTel(String tel);

    UserInfo findUserInfoByTel(String tel);
}
