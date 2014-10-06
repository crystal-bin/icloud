package com.icloud.stock.model;

// Generated Oct 6, 2014 8:52:59 AM by Hibernate Tools 3.4.0.CR1

import java.util.Date;

/**
 * StockDetail generated by hbm2java
 */
public class StockDetail implements java.io.Serializable {

	private Integer id;
	private Integer stockId;
	private String stockCode;
	private String stockName;
	private String companyInfoWork;
	private String detailContent;
	private Date createTime;
	private Date updateTime;

	public StockDetail() {
	}

	public StockDetail(Integer stockId, String stockCode, String stockName,
			String companyInfoWork, String detailContent, Date createTime,
			Date updateTime) {
		this.stockId = stockId;
		this.stockCode = stockCode;
		this.stockName = stockName;
		this.companyInfoWork = companyInfoWork;
		this.detailContent = detailContent;
		this.createTime = createTime;
		this.updateTime = updateTime;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getStockId() {
		return this.stockId;
	}

	public void setStockId(Integer stockId) {
		this.stockId = stockId;
	}

	public String getStockCode() {
		return this.stockCode;
	}

	public void setStockCode(String stockCode) {
		this.stockCode = stockCode;
	}

	public String getStockName() {
		return this.stockName;
	}

	public void setStockName(String stockName) {
		this.stockName = stockName;
	}

	public String getCompanyInfoWork() {
		return this.companyInfoWork;
	}

	public void setCompanyInfoWork(String companyInfoWork) {
		this.companyInfoWork = companyInfoWork;
	}

	public String getDetailContent() {
		return this.detailContent;
	}

	public void setDetailContent(String detailContent) {
		this.detailContent = detailContent;
	}

	public Date getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Date getUpdateTime() {
		return this.updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

}
