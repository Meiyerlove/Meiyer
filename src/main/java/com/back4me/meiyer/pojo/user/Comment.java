package com.back4me.meiyer.pojo.user;

import java.util.HashSet;
import java.util.Set;

/**
 * Comment entity. @author MyEclipse Persistence Tools
 */

public class Comment implements java.io.Serializable {

	// Fields

	private String id;
	private Article article;
	private Userinfo userinfo;
	private String articleid;
	private String content;
	private String commentdate;
	private Set zans = new HashSet(0);

	// Constructors

	/** default constructor */
	public Comment() {
	}

	/** minimal constructor */
	public Comment(String id, Userinfo userinfo, String articleid) {
		this.id = id;
		this.userinfo = userinfo;
		this.articleid = articleid;
	}

	/** full constructor */
	public Comment(String id, Article article, Userinfo userinfo,
			String articleid, String content, String commentdate, Set zans) {
		this.id = id;
		this.article = article;
		this.userinfo = userinfo;
		this.articleid = articleid;
		this.content = content;
		this.commentdate = commentdate;
		this.zans = zans;
	}

	// Property accessors

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
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

	public String getArticleid() {
		return this.articleid;
	}

	public void setArticleid(String articleid) {
		this.articleid = articleid;
	}

	public String getContent() {
		return this.content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getCommentdate() {
		return this.commentdate;
	}

	public void setCommentdate(String commentdate) {
		this.commentdate = commentdate;
	}

	public Set getZans() {
		return this.zans;
	}

	public void setZans(Set zans) {
		this.zans = zans;
	}

}