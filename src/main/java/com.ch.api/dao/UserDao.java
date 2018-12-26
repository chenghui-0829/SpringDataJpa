package com.ch.api.dao;

import com.ch.api.bean.UserInfo;
import org.springframework.data.repository.CrudRepository;

public interface UserDao extends CrudRepository<UserInfo, Integer> {
}
