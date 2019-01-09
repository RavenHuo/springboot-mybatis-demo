package com.raven.entity;

public class User {

    private int userId;
    private String userName;
    private String userPassWord;
    private String userSex;
    public int getUserId() {
        return userId;
    }
    public void setUserId(int userId) {
        this.userId = userId;
    }
    public String getUserName() {
        return userName;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }
    public String getUserPassWord() {
        return userPassWord;
    }
    public void setUserPassWord(String userPassWord) {
        this.userPassWord = userPassWord;
    }
    public String getUserSex() {
        return userSex;
    }
    public void setUserSex(String userSex) {
        this.userSex = userSex;
    }
}
