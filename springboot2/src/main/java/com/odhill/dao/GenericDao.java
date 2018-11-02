package com.odhill.dao;

import java.util.List;

/**
 * 
 * @author odhill
 *
 * @param <T>
 */
public interface GenericDao<T, E> {
	
	@SuppressWarnings("hiding")
	<E> T find(E obj);
		
	void create(T obj);
	
	List<T> getAll();
	
	void remove(T obj);
	
	void update(T obj);

}
