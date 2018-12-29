package com.ch.api.bean;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "user")
public class UserInfo {

    private String uid;
    private String name;
    private String tel;

    @Id
    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }
}
