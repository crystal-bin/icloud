package com.icloud.stock.model;

// Generated Jan 29, 2015 9:21:11 PM by Hibernate Tools 3.4.0.CR1

import java.util.Date;

/**
 * UserUrlAccessCount generated by hbm2java
 */
public class UserUrlAccessCount implements java.io.Serializable {

	private Integer id;
	private Integer userId;
	private Integer count;
	private Integer allCount;
	private Date createTime;
	private Integer validCount;
	private Integer validAllCount;

	public UserUrlAccessCount() {
	}

	public UserUrlAccessCount(Integer userId, Integer count, Integer allCount,
			Date createTime, Integer validCount, Integer validAllCount) {
		this.userId = userId;
		this.count = count;
		this.allCount = allCount;
		this.createTime = createTime;
		this.validCount = validCount;
		this.validAllCount = validAllCount;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getUserId() {
		return this.userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public Integer getCount() {
		return this.count;
	}

	public void setCount(Integer count) {
		this.count = count;
	}

	public Integer getAllCount() {
		return this.allCount;
	}

	public void setAllCount(Integer allCount) {
		this.allCount = allCount;
	}

	public Date getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Integer getValidCount() {
		return this.validCount;
	}

	public void setValidCount(Integer validCount) {
		this.validCount = validCount;
	}

	public Integer getValidAllCount() {
		return this.validAllCount;
	}

	public void setValidAllCount(Integer validAllCount) {
		this.validAllCount = validAllCount;
	}

}
