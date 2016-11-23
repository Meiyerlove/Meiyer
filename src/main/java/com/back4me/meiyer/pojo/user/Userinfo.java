package com.back4me.meiyer.pojo.user;

import java.util.HashSet;
import java.util.Set;

/**
 * Userinfo entity. @author MyEclipse Persistence Tools
 */

public class Userinfo implements java.io.Serializable {

	// Fields

	private String id;
	private String username;
	private String password;
	private String usertpe;
	private String address;
	private String birth;
	private String registedate;
	private String posonmsg;
	private Boolean islogined;
	private Set pics = new HashSet(0);
	private Set comments = new HashSet(0);
	private Set articles = new HashSet(0);
	private Set zans = new HashSet(0);

	// Constructors

	/** default constructor */
	public Userinfo() {
	}

	/** minimal constructor */
	public Userinfo(String id, String username, String password) {
		this.id = id;
		this.username = username;
		this.password = password;
	}

	/** full constructor */
	public Userinfo(String id, String username, String password,
			String usertpe, String address, String birth, String registedate,
			String posonmsg, Boolean islogined, Set pics, Set comments,
			Set articles, Set zans) {
		this.id = id;
		this.username = username;
		this.password = password;
		this.usertpe = usertpe;
		this.address = address;
		this.birth = birth;
		this.registedate = registedate;
		this.posonmsg = posonmsg;
		this.islogined = islogined;
		this.pics = pics;
		this.comments = comments;
		this.articles = articles;
		this.zans = zans;
	}

	// Property accessors

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUsertpe() {
		return this.usertpe;
	}

	public void setUsertpe(String usertpe) {
		this.usertpe = usertpe;
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getBirth() {
		return this.birth;
	}

	public void setBirth(String birth) {
		this.birth = birth;
	}

	public String getRegistedate() {
		return this.registedate;
	}

	public void setRegistedate(String registedate) {
		this.registedate = registedate;
	}

	public String getPosonmsg() {
		return this.posonmsg;
	}

	public void setPosonmsg(String posonmsg) {
		this.posonmsg = posonmsg;
	}

	public Boolean getIslogined() {
		return this.islogined;
	}

	public void setIslogined(Boolean islogined) {
		this.islogined = islogined;
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

	public Set getArticles() {
		return this.articles;
	}

	public void setArticles(Set articles) {
		this.articles = articles;
	}

	public Set getZans() {
		return this.zans;
	}

	public void setZans(Set zans) {
		this.zans = zans;
	}

}