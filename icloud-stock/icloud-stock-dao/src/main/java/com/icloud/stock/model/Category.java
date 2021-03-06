package com.icloud.stock.model;

// Generated 2014-6-27 17:45:35 by Hibernate Tools 3.4.0.CR1

import java.util.HashSet;
import java.util.Set;

/**
 * Category generated by hbm2java
 */
public class Category implements java.io.Serializable {

	private Integer id;
	private String categoryName;
	private Double categoryRank;
	private String categoryCategoryType;
	private Set categoryStocks = new HashSet(0);

	public Category() {
	}

	public Category(String categoryName, Double categoryRank,
			String categoryCategoryType, Set categoryStocks) {
		this.categoryName = categoryName;
		this.categoryRank = categoryRank;
		this.categoryCategoryType = categoryCategoryType;
		this.categoryStocks = categoryStocks;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCategoryName() {
		return this.categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	public Double getCategoryRank() {
		return this.categoryRank;
	}

	public void setCategoryRank(Double categoryRank) {
		this.categoryRank = categoryRank;
	}

	public String getCategoryCategoryType() {
		return this.categoryCategoryType;
	}

	public void setCategoryCategoryType(String categoryCategoryType) {
		this.categoryCategoryType = categoryCategoryType;
	}

	public Set getCategoryStocks() {
		return this.categoryStocks;
	}

	public void setCategoryStocks(Set categoryStocks) {
		this.categoryStocks = categoryStocks;
	}

}
