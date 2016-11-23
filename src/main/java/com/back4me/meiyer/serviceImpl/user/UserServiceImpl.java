package com.back4me.meiyer.serviceImpl.user;

import java.util.List;

import com.back4me.meiyer.pojo.user.Userinfo;
import com.back4me.meiyer.service.base.BaseService;
import com.back4me.meiyer.service.user.Userservice;
import com.back4me.meiyer.utils.MD5Utils;


public class UserServiceImpl extends BaseService implements Userservice{

	
	public Userinfo login(Userinfo user) {
		List<Userinfo> userlist = UserDao.findNameQuery("User.login", user.getUsername(),MD5Utils.md5(user.getPassword()));
		if (!userlist.isEmpty()){
			return userlist.get(0);
		}else{
			return null;
		}
			
	}

	
	public void editPassword(Userinfo user) {
		Userinfo user2 = UserDao.queryById(user.getId());
		user2.setPassword(MD5Utils.md5(user.getPassword()));	
	}

		
	

}
