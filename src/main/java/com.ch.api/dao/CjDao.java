package com.ch.api.dao;

import com.ch.api.bean.CjInfo;
import org.springframework.data.repository.CrudRepository;

public interface CjDao extends CrudRepository<CjInfo, Integer> {
}
