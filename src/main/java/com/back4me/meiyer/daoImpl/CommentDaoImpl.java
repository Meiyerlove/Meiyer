package com.back4me.meiyer.daoImpl;

import java.io.Serializable;
import java.util.List;

import org.hibernate.criterion.DetachedCriteria;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import com.back4me.meiyer.dao.CommentDao;

public class CommentDaoImpl<T> extends HibernateDaoSupport implements CommentDao<T> {
	
	private String classname;
	
	
	
	public CommentDaoImpl(String classname) {
		this.classname = classname;
	}

	
	public void save(T obj) {
		this.getHibernateTemplate().save(obj);
		
	}

	
	public void delect(T obj) {
		this.getHibernateTemplate().delete(obj);
		
	}

	
	public void update(T obj) {
		this.getHibernateTemplate().update(obj);
		
	}

	
	public T queryById(Serializable id) {
		Class<?> clazz=null;
		try {
			clazz=Class.forName(classname);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	return (T) this.getHibernateTemplate().get(clazz, id);
	
	}

	
	public List<T> findAll() {
		
		return this.getHibernateTemplate().find("from "+classname); //hql≤È—Ø
	}

	
	public List<T> findNameQuery(String queryNmae, Object... value) {
		
		return this.getHibernateTemplate().findByNamedQuery(queryNmae,value);
	}

	
	public List<T> findByCriteria(DetachedCriteria detachedCriteria) {
		
		return this.getHibernateTemplate().findByCriteria(detachedCriteria);
	}

}
