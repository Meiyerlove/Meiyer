package com.back4me.meiyer.pojo.user;

/**
 * Zan entity. @author MyEclipse Persistence Tools
 */

public class Zan implements java.io.Serializable {

	// Fields

	private ZanId id;
	private Comment comment;
	private Article article;
	private Userinfo userinfo;
	private String zandate;

	// Constructors

	/** default constructor */
	public Zan() {
	}

	/** minimal constructor */
	public Zan(ZanId id, Comment comment, Article article, Userinfo userinfo) {
		this.id = id;
		this.comment = comment;
		this.article = article;
		this.userinfo = userinfo;
	}

	/** full constructor */
	public Zan(ZanId id, Comment comment, Article article, Userinfo userinfo,
			String zandate) {
		this.id = id;
		this.comment = comment;
		this.article = article;
		this.userinfo = userinfo;
		this.zandate = zandate;
	}

	// Property accessors

	public ZanId getId() {
		return this.id;
	}

	public void setId(ZanId id) {
		this.id = id;
	}

	public Comment getComment() {
		return this.comment;
	}

	public void setComment(Comment comment) {
		this.comment = comment;
	}

	public Article getArticle() {
		return this.article;
	}

	public void setArticle(Article article) {
		this.article = article;
	}

	public Userinfo getUserinfo() {
		return this.userinfo;
	}

	public void setUserinfo(Userinfo userinfo) {
		this.userinfo = userinfo;
	}

	public String getZandate() {
		return this.zandate;
	}

	public void setZandate(String zandate) {
		this.zandate = zandate;
	}

}