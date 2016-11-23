package com.back4me.meiyer.dao;

import java.io.Serializable;
import java.util.List;
import org.hibernate.criterion.DetachedCriteria;

/**
 * 通用dao接口
 * @author YM20034
 *
 */
public interface CommentDao<T> {
	/**
	 * 增
	 * @param obj
	 */
	public void save(T obj);
	
	/**
	 * 
	 * 删除
	 * @param obj
	 */
	public void delect(T obj);
	
	/**
	 * 
	 * 修改
	 * @param obj
	 */
	public void update(T obj);
	
	/**
	 * 
	 * 根据id查询
	 * @param id
	 * @return
	 */
	public T queryById(Serializable id);
	
	
	/**
	 * 查询所有
	 * @return
	 */
	public List<T> findAll();
	
	
	/**
	 * 
	 * 条件查询
	 * @param queryNmae
	 * @param value
	 * @return
	 */
	public List<T> findNameQuery(String queryNmae, Object...value);//根据hql查询
	
	public List<T> findByCriteria(DetachedCriteria detachedCriteria);//根据条件查询

}
