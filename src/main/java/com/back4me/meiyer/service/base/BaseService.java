package com.back4me.meiyer.service.base;

import javax.annotation.Resource;

import com.back4me.meiyer.dao.CommentDao;
import com.back4me.meiyer.pojo.user.Userinfo;


/**
 * 业务层抽象组件 （实现业务层代码复用）
 * @author YM20034
 *
 */
public abstract class BaseService {
	@Resource(name="UserDao")
	protected CommentDao<Userinfo> UserDao;

}
