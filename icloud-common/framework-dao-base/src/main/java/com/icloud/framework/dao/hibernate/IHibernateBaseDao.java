package com.icloud.framework.dao.hibernate;

import java.util.List;

import com.icloud.framework.dao.hibernate.HiberanateEnum.OperationEnum;

public interface IHibernateBaseDao<T> {
	Class<T> getDomainClass();

	public T getById(Integer id);

	public void update(T t);

	public void save(T t);

	public void delete(T t);

	public List<T> findAll();

	public void deleteById(Integer id);

	public long count();

	public long count(String hql);

	public void deteleteAll();

	public long countByProperty(String paramname, Object value);

	public List<T> findByProperty(String hql, Object[] values);

	public List<T> findByProperty(String paramName, Object value);

	public List<T> findByProperty(String paramName, Object value, int start,
			int limit);

	public List<T> findByProperty(String[] paramNames, Object[] values,
			String sortParam, boolean isAsc, int start, int limit);

	public List<T> findByProperty(String[] paramNames,
			OperationEnum[] operations, Object[] values, String sortParam,
			boolean isAsc, int start, int limit);

	public List<T> findByProperty(String[] paramNames, Object[] values,
			String sortParam, boolean isAsc);

	public long countByProperty(String[] paramNames, Object[] values);

	public long countByProperty(String[] paramNames,
			OperationEnum[] operations, Object[] values);

	public List<T> findAll(int start, int limit);

	public List<T> findByProperty(String hql, int start, int limit);

	public List<T> findByProperty(String hql);

	public void deleteByProperty(String param, Object value);
}
