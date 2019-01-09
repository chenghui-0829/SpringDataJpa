package com.ch.api.bean;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity(name = "cj_info")
public class CjInfo implements Serializable {

    private int cjId;
    private String cjzt;
    private String jpnr;
    private String cytj;
    private String fqUser;
    private String creatTime;
    private String isJoin;
    private List<CjUser> cjUsers;

    @ElementCollection
    public List<CjUser> getCjUsers() {
        return cjUsers;
    }

    public void setCjUsers(List<CjUser> cjUsers) {
        this.cjUsers = cjUsers;
    }

    public String getFqUser() {
        return fqUser;
    }

    public void setFqUser(String fqUser) {
        this.fqUser = fqUser;
    }

    @Id
    @GeneratedValue
    public int getCjId() {
        return cjId;
    }

    public String getIsJoin() {
        return isJoin;
    }

    public void setIsJoin(String isJoin) {
        this.isJoin = isJoin;
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

    public String getCreatTime() {
        return creatTime;
    }

    public void setCreatTime(String creatTime) {
        this.creatTime = creatTime;
    }
}
