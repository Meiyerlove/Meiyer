package com.back4me.meiyer.pojo.user;

/**
 * Pic entity. @author MyEclipse Persistence Tools
 */

public class Pic implements java.io.Serializable {

	// Fields

	private String id;
	private Userinfo userinfo;
	private Article article;
	private String url;
	private String loaddate;
	private String pictype;

	// Constructors

	/** default constructor */
	public Pic() {
	}

	/** minimal constructor */
	public Pic(String id, String pictype) {
		this.id = id;
		this.pictype = pictype;
	}

	/** full constructor */
	public Pic(String id, Userinfo userinfo, Article article, String url,
			String loaddate, String pictype) {
		this.id = id;
		this.userinfo = userinfo;
		this.article = article;
		this.url = url;
		this.loaddate = loaddate;
		this.pictype = pictype;
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

	public Article getArticle() {
		return this.article;
	}

	public void setArticle(Article article) {
		this.article = article;
	}

	public String getUrl() {
		return this.url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getLoaddate() {
		return this.loaddate;
	}

	public void setLoaddate(String loaddate) {
		this.loaddate = loaddate;
	}

	public String getPictype() {
		return this.pictype;
	}

	public void setPictype(String pictype) {
		this.pictype = pictype;
	}

}