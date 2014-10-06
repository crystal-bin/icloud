package com.icloud.stock.model;

// Generated Oct 6, 2014 8:52:59 AM by Hibernate Tools 3.4.0.CR1

import java.util.Date;

/**
 * JuhuasuanDetail generated by hbm2java
 */
public class JuhuasuanDetail implements java.io.Serializable {

	private Integer id;
	private String perfer;
	private String perferHost;
	private String perferIp;
	private String urlId;
	private Date createTime;
	private String otherParam;
	private Integer userId;

	public JuhuasuanDetail() {
	}

	public JuhuasuanDetail(String perfer, String perferHost, String perferIp,
			String urlId, Date createTime, String otherParam, Integer userId) {
		this.perfer = perfer;
		this.perferHost = perferHost;
		this.perferIp = perferIp;
		this.urlId = urlId;
		this.createTime = createTime;
		this.otherParam = otherParam;
		this.userId = userId;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getPerfer() {
		return this.perfer;
	}

	public void setPerfer(String perfer) {
		this.perfer = perfer;
	}

	public String getPerferHost() {
		return this.perferHost;
	}

	public void setPerferHost(String perferHost) {
		this.perferHost = perferHost;
	}

	public String getPerferIp() {
		return this.perferIp;
	}

	public void setPerferIp(String perferIp) {
		this.perferIp = perferIp;
	}

	public String getUrlId() {
		return this.urlId;
	}

	public void setUrlId(String urlId) {
		this.urlId = urlId;
	}

	public Date getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public String getOtherParam() {
		return this.otherParam;
	}

	public void setOtherParam(String otherParam) {
		this.otherParam = otherParam;
	}

	public Integer getUserId() {
		return this.userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

}
