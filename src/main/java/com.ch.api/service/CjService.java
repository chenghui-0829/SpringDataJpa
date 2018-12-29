package com.ch.api.service;

import com.ch.api.bean.CjInfo;

import java.util.ArrayList;
import java.util.List;

public interface CjService {

    void save(CjInfo cjInfo);

    ArrayList<CjInfo> findAll();
}
