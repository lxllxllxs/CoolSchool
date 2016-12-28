package com.yiyekeji.coolschool.model;


/**
 * 注意：属性不分大小写
 * Created by lxl on 2016/11/2.
 */
public class UserInfo {
    private  String userName;
    private String userId;
    private  String  imgUrl;
    private String pwd;
    private  int id;

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPwd() {

        return pwd;
    }

    @Override
    public String toString() {
        return "UserInfo{" +
                "userName='" + userName + '\'' +
                ", userId='" + userId + '\'' +
                ", imgUrl='" + imgUrl + '\'' +
                ", pwd='" + pwd + '\'' +
                ", id=" + id +
                '}';
    }


    public void setPwd(String pwd) {
        this.pwd = pwd;
    }



    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public UserInfo() {
    }

}
