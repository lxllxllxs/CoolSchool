package com.yiyekeji.coolschool.inter;


import com.yiyekeji.coolschool.model.UserInfo;

import java.util.List;

public interface IUserInfo {
	UserInfo selectUserByID(int id);
	UserInfo  verifyUserLogin(String username, String pwd);
	List<UserInfo> getLinkManList(String senderId);

	void addUser(UserInfo userInfo);

}
