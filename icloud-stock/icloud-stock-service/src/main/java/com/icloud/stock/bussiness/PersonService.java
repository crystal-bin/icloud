package com.icloud.stock.bussiness;

public interface PersonService {
	public int save(String name);

	public void update(String name, Integer id);

	public String getPersonName(Integer id);
}
