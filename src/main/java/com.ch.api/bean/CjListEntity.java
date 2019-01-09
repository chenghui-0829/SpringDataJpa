package com.ch.api.bean;

import javax.persistence.Entity;
import java.io.Serializable;

public class CjListEntity implements Serializable {

    private int cjId;
    private String cjzt;
    private String jpnr;
    private String cytj;
    private String fqUser;
    private String creatTime;

    public CjListEntity() {
    }

    public CjListEntity(int cjId, String cjzt, String jpnr, String cytj, String fqUser, String creatTime) {
        this.cjId = cjId;
        this.cjzt = cjzt;
        this.jpnr = jpnr;
        this.cytj = cytj;
        this.fqUser = fqUser;
        this.creatTime = creatTime;
    }

    public int getCjId() {
        return cjId;
    }

    public void setCjId(int cjId) {
        this.cjId = cjId;
    }

    public String getCjzt() {
        return cjzt;
    }

    public void setCjzt(String cjzt) {
        this.cjzt = cjzt;
    }

    public String getJpnr() {
        return jpnr;
    }

    public void setJpnr(String jpnr) {
        this.jpnr = jpnr;
    }

    public String getCytj() {
        return cytj;
    }

    public void setCytj(String cytj) {
        this.cytj = cytj;
    }

    public String getFqUser() {
        return fqUser;
    }

    public void setFqUser(String fqUser) {
        this.fqUser = fqUser;
    }

    public String getCreatTime() {
        return creatTime;
    }

    public void setCreatTime(String creatTime) {
        this.creatTime = creatTime;
    }
}
