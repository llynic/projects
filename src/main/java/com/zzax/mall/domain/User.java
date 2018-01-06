package com.zzax.mall.domain;

import java.io.Serializable;

/**
 * @Description 用户对象
 * @Created By : wangzhenjia
 * @DATE 2018-01-05 16:04 星期五
 */
public class User implements Serializable {

    private Integer id;

    /*用户名*/
    private String username;

    /*用户密码(本地不做保存)*/
    private String password;

    /*用户昵称*/
    private String nickname;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public User() { }


    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", nickname='" + nickname + '\'' +
                '}';
    }
}
