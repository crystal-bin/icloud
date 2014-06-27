package com.icloud.stock.model;

// Generated 2014-6-27 17:45:35 by Hibernate Tools 3.4.0.CR1

import java.util.Date;

/**
 * UserAccess generated by hbm2java
 */
public class UserAccess implements java.io.Serializable {

	private Integer id;
	private User user;
	private int userAccessType;
	private String userAccessIp;
	private String userAccessDescription;
	private Date createTime;

	public UserAccess() {
	}

	public UserAccess(User user, int userAccessType) {
		this.user = user;
		this.userAccessType = userAccessType;
	}

	public UserAccess(User user, int userAccessType, String userAccessIp,
			String userAccessDescription, Date createTime) {
		this.user = user;
		this.userAccessType = userAccessType;
		this.userAccessIp = userAccessIp;
		this.userAccessDescription = userAccessDescription;
		this.createTime = createTime;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public User getUser() {
		return this.user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public int getUserAccessType() {
		return this.userAccessType;
	}

	public void setUserAccessType(int userAccessType) {
		this.userAccessType = userAccessType;
	}

	public String getUserAccessIp() {
		return this.userAccessIp;
	}

	public void setUserAccessIp(String userAccessIp) {
		this.userAccessIp = userAccessIp;
	}

	public String getUserAccessDescription() {
		return this.userAccessDescription;
	}

	public void setUserAccessDescription(String userAccessDescription) {
		this.userAccessDescription = userAccessDescription;
	}

	public Date getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

}
