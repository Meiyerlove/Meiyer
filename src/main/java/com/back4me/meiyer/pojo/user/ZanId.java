package com.back4me.meiyer.pojo.user;

/**
 * ZanId entity. @author MyEclipse Persistence Tools
 */

public class ZanId implements java.io.Serializable {

	// Fields

	private String id;
	private String articleorcomid;
	private String userid;

	// Constructors

	/** default constructor */
	public ZanId() {
	}

	/** full constructor */
	public ZanId(String id, String articleorcomid, String userid) {
		this.id = id;
		this.articleorcomid = articleorcomid;
		this.userid = userid;
	}

	// Property accessors

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getArticleorcomid() {
		return this.articleorcomid;
	}

	public void setArticleorcomid(String articleorcomid) {
		this.articleorcomid = articleorcomid;
	}

	public String getUserid() {
		return this.userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof ZanId))
			return false;
		ZanId castOther = (ZanId) other;

		return ((this.getId() == castOther.getId()) || (this.getId() != null
				&& castOther.getId() != null && this.getId().equals(
				castOther.getId())))
				&& ((this.getArticleorcomid() == castOther.getArticleorcomid()) || (this
						.getArticleorcomid() != null
						&& castOther.getArticleorcomid() != null && this
						.getArticleorcomid().equals(
								castOther.getArticleorcomid())))
				&& ((this.getUserid() == castOther.getUserid()) || (this
						.getUserid() != null && castOther.getUserid() != null && this
						.getUserid().equals(castOther.getUserid())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getId() == null ? 0 : this.getId().hashCode());
		result = 37
				* result
				+ (getArticleorcomid() == null ? 0 : this.getArticleorcomid()
						.hashCode());
		result = 37 * result
				+ (getUserid() == null ? 0 : this.getUserid().hashCode());
		return result;
	}

}