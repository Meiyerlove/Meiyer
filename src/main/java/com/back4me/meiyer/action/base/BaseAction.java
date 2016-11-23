package com.back4me.meiyer.action.base;
/**
 * 公共抽象action（为了实现一些代码的复用）
 */
import javax.annotation.Resource;

import com.back4me.meiyer.service.user.Userservice;
import com.opensymphony.xwork2.ActionSupport;


public abstract class BaseAction extends ActionSupport{
	
	@Resource(name="userservice")
	protected Userservice userservice; //可直接被子类使用
}
