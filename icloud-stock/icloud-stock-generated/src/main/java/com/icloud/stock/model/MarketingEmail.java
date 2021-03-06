package com.icloud.stock.model;

// Generated Jan 29, 2015 9:21:11 PM by Hibernate Tools 3.4.0.CR1

import java.util.Date;

/**
 * MarketingEmail generated by hbm2java
 */
public class MarketingEmail implements java.io.Serializable {

	private Integer id;
	private String email;
	private String ditch;
	private Integer active;
	private Integer accessCount;
	private Date lastUpdateTime;
	private Date lastSendTime;
	private String acccessDetail;

	public MarketingEmail() {
	}

	public MarketingEmail(String email, String ditch, Integer active,
			Integer accessCount, Date lastUpdateTime, Date lastSendTime,
			String acccessDetail) {
		this.email = email;
		this.ditch = ditch;
		this.active = active;
		this.accessCount = accessCount;
		this.lastUpdateTime = lastUpdateTime;
		this.lastSendTime = lastSendTime;
		this.acccessDetail = acccessDetail;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDitch() {
		return this.ditch;
	}

	public void setDitch(String ditch) {
		this.ditch = ditch;
	}

	public Integer getActive() {
		return this.active;
	}

	public void setActive(Integer active) {
		this.active = active;
	}

	public Integer getAccessCount() {
		return this.accessCount;
	}

	public void setAccessCount(Integer accessCount) {
		this.accessCount = accessCount;
	}

	public Date getLastUpdateTime() {
		return this.lastUpdateTime;
	}

	public void setLastUpdateTime(Date lastUpdateTime) {
		this.lastUpdateTime = lastUpdateTime;
	}

	public Date getLastSendTime() {
		return this.lastSendTime;
	}

	public void setLastSendTime(Date lastSendTime) {
		this.lastSendTime = lastSendTime;
	}

	public String getAcccessDetail() {
		return this.acccessDetail;
	}

	public void setAcccessDetail(String acccessDetail) {
		this.acccessDetail = acccessDetail;
	}

}
