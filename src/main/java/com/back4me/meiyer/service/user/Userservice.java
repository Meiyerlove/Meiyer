package com.back4me.meiyer.service.user;

import com.back4me.meiyer.pojo.user.Userinfo;



/**
 * 用户管理 业务接口
 * @author YM20034
 *
 */
public interface Userservice {

	public Userinfo login(Userinfo user);//登录

	public void editPassword(Userinfo user);//修改密码！
	

}
