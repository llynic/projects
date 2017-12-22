package com.zzax.mall.entity;

import javax.validation.constraints.NotNull;

/**
 * @Description
 * @Created By : wangzhenjia
 * @DATE 2017-12-22 11:09 星期五
 */
public class User {
    private String username;
    private String password;


    @NotNull(message = "用户名不能为空")
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
    @NotNull(message = "密码不能为空")
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
