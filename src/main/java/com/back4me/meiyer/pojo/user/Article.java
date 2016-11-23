package com.back4me.meiyer.pojo.user;

import java.util.HashSet;
import java.util.Set;

/**
 * Article entity. @author MyEclipse Persistence Tools
 */

public class Article implements java.io.Serializable {

	// Fields

	private String id;
	private Userinfo userinfo;
	private String articletype;
	private String articlename;
	private String articletheme;
	private String articledate;
	private Set pics = new HashSet(0);
	private Set comments = new HashSet(0);
	private Set zans = new HashSet(0);

	// Constructors

	/** default constructor */
	public Article() {
	}

	/** minimal constructor */
	public Article(String id, Userinfo userinfo, String articlename) {
		this.id = id;
		this.userinfo = userinfo;
		this.articlename = articlename;
	}

	/** full constructor */
	public Article(String id, Userinfo userinfo, String articletype,
			String articlename, String articletheme, String articledate,
			Set pics, Set comments, Set zans) {
		this.id = id;
		this.userinfo = userinfo;
		this.articletype = articletype;
		this.articlename = articlename;
		this.articletheme = articletheme;
		this.articledate = articledate;
		this.pics = pics;
		this.comments = comments;
		this.zans = zans;
	}

	// Property accessors

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Userinfo getUserinfo() {
		return this.userinfo;
	}

	public void setUserinfo(Userinfo userinfo) {
		this.userinfo = userinfo;
	}

	public String getArticletype() {
		return this.articletype;
	}

	public void setArticletype(String articletype) {
		this.articletype = articletype;
	}

	public String getArticlename() {
		return this.articlename;
	}

	public void setArticlename(String articlename) {
		this.articlename = articlename;
	}

	public String getArticletheme() {
		return this.articletheme;
	}

	public void setArticletheme(String articletheme) {
		this.articletheme = articletheme;
	}

	public String getArticledate() {
		return this.articledate;
	}

	public void setArticledate(String articledate) {
		this.articledate = articledate;
	}

	public Set getPics() {
		return this.pics;
	}

	public void setPics(Set pics) {
		this.pics = pics;
	}

	public Set getComments() {
		return this.comments;
	}

	public void setComments(Set comments) {
		this.comments = comments;
	}

	public Set getZans() {
		return this.zans;
	}

	public void setZans(Set zans) {
		this.zans = zans;
	}

}