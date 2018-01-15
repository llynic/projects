package com.zzax.mall.domain;

public class Buyer {
    private Integer id;

    private String nickname;

    private String realname;

    private String address;

    private String telephone;

    private String email;

    public Buyer(Integer id, String nickname, String realname, String address, String telephone, String email) {
        this.id = id;
        this.nickname = nickname;
        this.realname = realname;
        this.address = address;
        this.telephone = telephone;
        this.email = email;
    }

    public Buyer() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname == null ? null : nickname.trim();
    }

    public String getRealname() {
        return realname;
    }

    public void setRealname(String relname) {
        this.realname = relname == null ? null : relname.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone == null ? null : telephone.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }
}