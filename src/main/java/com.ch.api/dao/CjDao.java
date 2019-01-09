package com.ch.api.dao;

import com.ch.api.bean.CjInfo;
import com.ch.api.bean.CjListEntity;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.Repository;

import java.util.ArrayList;
import java.util.List;

public interface CjDao extends Repository<CjInfo, Integer> {

    void save(CjInfo cjInfo);

    ArrayList<CjInfo> findAll();

    CjInfo findCjInfoByCjId(int cjid);

    //注意这里from后面的cj_info必须与CjInfo定义Entity的名字一样
    @Query(value = "select new com.ch.api.bean.CjListEntity(cj.cjId,cj.cjzt,cj.jpnr,cj.cytj," +
            "cj.fqUser,cj.creatTime) from cj_info cj")
    List<CjListEntity> getCjList();


}
