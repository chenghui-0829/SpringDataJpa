package com.ch.api.bean;

import javax.persistence.*;
import java.io.Serializable;

@Embeddable
public class CjUser implements Serializable {

    private String time;
    private UserInfo userInfo;

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
}
