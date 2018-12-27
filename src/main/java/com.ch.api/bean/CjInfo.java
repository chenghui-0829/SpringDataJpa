package com.ch.api.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

@Entity(name = "cj_info")
public class CjInfo {

    private int cjId;
    private String cjzt;
    private String jpnr;
    private String cytj;
    private Date creatTime;

    @Id
    @GeneratedValue
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

    public Date getCreatTime() {
        return creatTime;
    }

    public void setCreatTime(Date creatTime) {
        this.creatTime = creatTime;
    }
}
