package com.back4me.meiyer.web.action.user;

import org.apache.commons.lang3.StringUtils;
import org.apache.struts2.ServletActionContext;

import com.back4me.meiyer.action.base.BaseAction;
import com.back4me.meiyer.pojo.user.Userinfo;
import com.opensymphony.xwork2.ModelDriven;


public class LoginAction extends BaseAction implements ModelDriven<Userinfo> {

	private String chekcode;

	private Userinfo user = new Userinfo();

	@Override
	public Userinfo getModel() {

		return user;
	}

	public void setChekcode(String chekcode) {
		this.chekcode = chekcode;
	}

	public String execute() {
		String code = (String) ServletActionContext.getRequest().getSession()
				.getAttribute("key");
		if (chekcode == null || !chekcode.equals(code)) {
			this.addActionError("验证码错误！");
			return INPUT;
		}
		if (!StringUtils.isEmpty(user.getUsername())
				&& !StringUtils.isEmpty(user.getPassword())) {

			Userinfo loginuser = userservice.login(user);
			if (loginuser == null) {
				this.addActionError("用户名或者密码错误！");
				return INPUT;
			} else {
				ServletActionContext.getRequest().getSession()
						.setAttribute("user", loginuser);
				return SUCCESS;
			}
		} else {
			this.addActionError("用户名和密码不能为空！");
			return INPUT;
		}

	}

}
