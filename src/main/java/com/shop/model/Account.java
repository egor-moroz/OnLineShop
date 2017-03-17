package com.shop.model;

import java.io.Serializable;

/**
 * Created by EgorPC on 17.03.2017.
 */
public class Account implements Serializable{

    public String userName;
    private String password;
    private boolean active;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }
}
