package com.icloud.stock.vo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.dozer.DozerBeanMapper;

import com.icloud.stock.model.Stock;

public class StockVO {

	private Integer id;
	private String stockName;
	private String stockCode;
	private Date createTime;
	private Date updateTime;
	private String stockLocation;
	private String descrition;
	private String stockAllCode;
	private Double currentPrice;
	private Double chg;
	private Double percent;
	private Double lastClose;
	private Double open;
	private Double high;
	private Double low;
	private Double volume;
	private Double high52w;
	private Double low52w;
	private Double amount;
	private Double preLow;
	private Double preHigh;
	private Integer prePercent;
	private Integer preCare;
	private Double flowStock;
	private Double totalStock;
	private Double totalMoney;

	public StockVO() {
	}

	public StockVO(String stockCode) {
		this.stockCode = stockCode;
	}

	public static StockVO convert(com.icloud.stock.model.Stock stock) {
		DozerBeanMapper mapper = new DozerBeanMapper();
		StockVO stockVo = (StockVO) mapper.map(stock, StockVO.class);
		// 或者是
		// DestinationObject destObject = new DestinationObject();
		// mapper.map(sourceObject, destObject);
		return stockVo;
	}

	public static List<StockVO> convert(List<Stock> stocks) {
		DozerBeanMapper mapper = new DozerBeanMapper();
		List<StockVO> list = new ArrayList<StockVO>();
		for (Stock stock : stocks) {
			StockVO stockVo = (StockVO) mapper.map(stock, StockVO.class);
			list.add(stockVo);
		}
		return list;
	}

	public StockVO(String stockName, String stockCode, Date createTime,
			Date updateTime, String stockLocation, String descrition,
			String stockAllCode, Double currentPrice, Double chg,
			Double percent, Double lastClose, Double open, Double high,
			Double low, Double volume, Double high52w, Double low52w,
			Double amount, Double preLow, Double preHigh, Integer prePercent,
			Integer preCare, Double flowStock, Double totalStock,
			Double totalMoney) {
		this.stockName = stockName;
		this.stockCode = stockCode;
		this.createTime = createTime;
		this.updateTime = updateTime;
		this.stockLocation = stockLocation;
		this.descrition = descrition;
		this.stockAllCode = stockAllCode;
		this.currentPrice = currentPrice;
		this.chg = chg;
		this.percent = percent;
		this.lastClose = lastClose;
		this.open = open;
		this.high = high;
		this.low = low;
		this.volume = volume;
		this.high52w = high52w;
		this.low52w = low52w;
		this.amount = amount;
		this.preLow = preLow;
		this.preHigh = preHigh;
		this.prePercent = prePercent;
		this.preCare = preCare;
		this.flowStock = flowStock;
		this.totalStock = totalStock;
		this.totalMoney = totalMoney;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getStockName() {
		return this.stockName;
	}

	public void setStockName(String stockName) {
		this.stockName = stockName;
	}

	public String getStockCode() {
		return this.stockCode;
	}

	public void setStockCode(String stockCode) {
		this.stockCode = stockCode;
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

	public String getStockLocation() {
		return this.stockLocation;
	}

	public void setStockLocation(String stockLocation) {
		this.stockLocation = stockLocation;
	}

	public String getDescrition() {
		return this.descrition;
	}

	public void setDescrition(String descrition) {
		this.descrition = descrition;
	}

	public String getStockAllCode() {
		return this.stockAllCode;
	}

	public void setStockAllCode(String stockAllCode) {
		this.stockAllCode = stockAllCode;
	}

	public Double getCurrentPrice() {
		return this.currentPrice;
	}

	public void setCurrentPrice(Double currentPrice) {
		this.currentPrice = currentPrice;
	}

	public Double getChg() {
		return this.chg;
	}

	public void setChg(Double chg) {
		this.chg = chg;
	}

	public Double getPercent() {
		return this.percent;
	}

	public void setPercent(Double percent) {
		this.percent = percent;
	}

	public Double getLastClose() {
		return this.lastClose;
	}

	public void setLastClose(Double lastClose) {
		this.lastClose = lastClose;
	}

	public Double getOpen() {
		return this.open;
	}

	public void setOpen(Double open) {
		this.open = open;
	}

	public Double getHigh() {
		return this.high;
	}

	public void setHigh(Double high) {
		this.high = high;
	}

	public Double getLow() {
		return this.low;
	}

	public void setLow(Double low) {
		this.low = low;
	}

	public Double getVolume() {
		return this.volume;
	}

	public void setVolume(Double volume) {
		this.volume = volume;
	}

	public Double getHigh52w() {
		return this.high52w;
	}

	public void setHigh52w(Double high52w) {
		this.high52w = high52w;
	}

	public Double getLow52w() {
		return this.low52w;
	}

	public void setLow52w(Double low52w) {
		this.low52w = low52w;
	}

	public Double getAmount() {
		return this.amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	public Double getPreLow() {
		return this.preLow;
	}

	public void setPreLow(Double preLow) {
		this.preLow = preLow;
	}

	public Double getPreHigh() {
		return this.preHigh;
	}

	public void setPreHigh(Double preHigh) {
		this.preHigh = preHigh;
	}

	public Integer getPrePercent() {
		return this.prePercent;
	}

	public void setPrePercent(Integer prePercent) {
		this.prePercent = prePercent;
	}

	public Integer getPreCare() {
		return this.preCare;
	}

	public void setPreCare(Integer preCare) {
		this.preCare = preCare;
	}

	public Double getFlowStock() {
		return this.flowStock;
	}

	public void setFlowStock(Double flowStock) {
		this.flowStock = flowStock;
	}

	public Double getTotalStock() {
		return this.totalStock;
	}

	public void setTotalStock(Double totalStock) {
		this.totalStock = totalStock;
	}

	public Double getTotalMoney() {
		return this.totalMoney;
	}

	public void setTotalMoney(Double totalMoney) {
		this.totalMoney = totalMoney;
	}

}
