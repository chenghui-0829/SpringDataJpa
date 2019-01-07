package com.ch.api.bean;

import javax.persistence.*;

@Entity(name = "cj_user")
public class CjUser {

    private int id;
    private String time;
    private UserInfo userInfo;
    private CjInfo cjInfo;

    @ManyToOne
    @JoinColumn(name = "cjid")
    public CjInfo getCjInfo() {
        return cjInfo;
    }

    public void setCjInfo(CjInfo cjInfo) {
        this.cjInfo = cjInfo;
    }

    @ManyToOne
    @JoinColumn(name = "uid")
    public UserInfo getUserInfo() {
        return userInfo;
    }

    public void setUserInfo(UserInfo userInfo) {
        this.userInfo = userInfo;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    @Id
    @GeneratedValue
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
