package com.yiyekeji.coolschool.controller;

import com.yiyekeji.coolschool.bean.ResponseFactory;
import com.yiyekeji.coolschool.bean.UserInfoFactory;
import com.yiyekeji.coolschool.inter.IUserInfo;
import com.yiyekeji.coolschool.model.UserInfo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.io.IOException;
import java.io.InputStream;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
@RequestMapping("/UserController")
public class UserController {
	@Autowired
	IUserInfo userMapper;


	@RequestMapping("test")
	public void   test(HttpServletRequest request,HttpServletResponse response) throws IOException {
		System.out.println("hello world!");
	}

	static int count=1;
	@RequestMapping("login")
	public void  upload(HttpServletRequest request,HttpServletResponse response) throws IOException {
		System.out.println("login");
		InputStream inputStream = request.getInputStream();
		UserInfoFactory.UserInfo userInfo = UserInfoFactory.UserInfo.parseFrom(inputStream);
		inputStream.close();
		ResponseFactory.Response.Builder builder = ResponseFactory.Response.newBuilder();
		if (userMapper.verifyUserLogin(userInfo.getUsername(), userInfo.getPassword()) != null) {
			System.out.println("登录成功！" + count);
			builder.setStatus("1");
			builder.setResultmsg("登录成功！");
			count++;
		} else {
			builder.setStatus("0");
			builder.setResultmsg("登录失败");
		}
		builder.build().writeTo(response.getOutputStream());
	}

	@RequestMapping("testDatabase")
	public void  testDatabase(HttpServletRequest request,HttpServletResponse response) throws IOException {
		if (userMapper.verifyUserLogin("lxl1", "123") != null) {
			System.out.println("登录成功！");
		} else {
		}
	}


	@RequestMapping("add1000")
	public void addUserInfo() {
		System.out.println("添加1000个用户！");
		for (int i=1;i<10;i++){
			UserInfo userInfo = new UserInfo();
			userInfo.setUsername("lxl"+i);
			userInfo.setPwd("123");
			userMapper.addUser(userInfo);
		}
		System.out.println("添加完成！");
	}
	
	
	@RequestMapping("download")
	public  void  download(HttpServletRequest request,HttpServletResponse response){

	}
}
