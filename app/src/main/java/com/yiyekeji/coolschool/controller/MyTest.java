package com.yiyekeji.coolschool.controller;

import com.yiyekeji.coolschool.inter.IUserInfo;
import com.yiyekeji.coolschool.model.UserInfo;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by lxl on 2016/12/25.
 */
public class MyTest {
    @Autowired
    IUserInfo iUserInfo;
    public static void main(String[] a){
        new MyTest().addUserInfo();
    }

    private void addUserInfo(){
        for (int i=3;i<1003;i++){
            UserInfo userInfo = new UserInfo();
            userInfo.setUserName("lxl"+i);
            userInfo.setPwd("123");
            iUserInfo.addUser(userInfo);
        }
    }
}
