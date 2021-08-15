package com.core.api.core.user;

public class User {

    private final int userId;
    private final String identity;
    private final String password;
    private final String name;
    private final Integer companyId;
    private final String phoneNum;
    private final String userImage;
    private final String celebrityUrl;
    private final Boolean celebrity;
    private final String serviceAddress;

    public User() {
        userId = 0;
        identity = "youyou";
        password = "123";
        name = "sy";
        companyId = null;
        phoneNum = "123";
        userImage = null;
        celebrityUrl = null;
        celebrity = false;
        serviceAddress = null;
    }

    public User(int userId, String identity, String password, String name, Integer companyId, String phoneNum, String userImage, String celebrityUrl, Boolean celebrity, String serviceAddress) {
        this.userId = userId;
        this.identity = identity;
        this.password = password;
        this.name = name;
        this.companyId = companyId;
        this.phoneNum = phoneNum;
        this.userImage = userImage;
        this.celebrityUrl = celebrityUrl;
        this.celebrity = celebrity;
        this.serviceAddress = serviceAddress;
    }

    public int getUserId() {
        return userId;
    }

    public String getIdentity(){
        return identity;
    }
    public String getPassword() {
        return password;
    }

    public String getName() {
        return name;
    }

    public Integer getCompanyId() {
        return companyId;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public String getUserImage() {
        return userImage;
    }

    public String getCelebrityUrl() {
        return celebrityUrl;
    }

    public Boolean getCelebrity() {
        return celebrity;
    }

    public String getServiceAddress() {
        return serviceAddress;
    }
}
