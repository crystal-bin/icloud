package com.icloud.stock.model;

// Generated 2014-6-27 17:45:35 by Hibernate Tools 3.4.0.CR1

import java.util.Date;

/**
 * StockDateHistory generated by hbm2java
 */
public class StockDateHistory implements java.io.Serializable {

	private Integer id;
	private String stockCode;
	private Integer stockId;
	private Date createTime;
	private Double openPrice;
	private Double highPrice;
	private Double lowPrice;
	private Double closePrice;
	private Long volume;
	private Double adjPrice;

	public StockDateHistory() {
	}

	public StockDateHistory(String stockCode, Integer stockId, Date createTime,
			Double openPrice, Double highPrice, Double lowPrice,
			Double closePrice, Long volume, Double adjPrice) {
		this.stockCode = stockCode;
		this.stockId = stockId;
		this.createTime = createTime;
		this.openPrice = openPrice;
		this.highPrice = highPrice;
		this.lowPrice = lowPrice;
		this.closePrice = closePrice;
		this.volume = volume;
		this.adjPrice = adjPrice;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getStockCode() {
		return this.stockCode;
	}

	public void setStockCode(String stockCode) {
		this.stockCode = stockCode;
	}

	public Integer getStockId() {
		return this.stockId;
	}

	public void setStockId(Integer stockId) {
		this.stockId = stockId;
	}

	public Date getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Double getOpenPrice() {
		return this.openPrice;
	}

	public void setOpenPrice(Double openPrice) {
		this.openPrice = openPrice;
	}

	public Double getHighPrice() {
		return this.highPrice;
	}

	public void setHighPrice(Double highPrice) {
		this.highPrice = highPrice;
	}

	public Double getLowPrice() {
		return this.lowPrice;
	}

	public void setLowPrice(Double lowPrice) {
		this.lowPrice = lowPrice;
	}

	public Double getClosePrice() {
		return this.closePrice;
	}

	public void setClosePrice(Double closePrice) {
		this.closePrice = closePrice;
	}

	public Long getVolume() {
		return this.volume;
	}

	public void setVolume(Long volume) {
		this.volume = volume;
	}

	public Double getAdjPrice() {
		return this.adjPrice;
	}

	public void setAdjPrice(Double adjPrice) {
		this.adjPrice = adjPrice;
	}

}
