package com.odhill.dao;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;



/**
 * 
 * @author odhill
 *
 * @param <T>
 */
public abstract class GenericDaoImpl <T, E> implements GenericDao <T, E>{
	
	@PersistenceContext
	protected EntityManager em;
	
	Class<T> clazz;
	
	public GenericDaoImpl() {
		clazz = getType(getClass());
	}

	@SuppressWarnings("unchecked")
	private Class<T> getType(Class<?> clase) {
		Type tipo = clase.getGenericSuperclass();
		if(tipo instanceof ParameterizedType)
			return (Class<T>) ((ParameterizedType)tipo).getActualTypeArguments()[0];
		else
			return getType(clase.getSuperclass());
	}
	
	@SuppressWarnings("hiding")
	public <E> T find(E obj){
		return (T) em.find(clazz, obj);
	}
	
	
	public void create(T obj) {
		em.persist(obj);
	}
	
	public void update(T obj) {
		em.merge(obj);
	}
	
	public void remove(T obj) {
		em.remove(em.merge(obj));
	}

}
