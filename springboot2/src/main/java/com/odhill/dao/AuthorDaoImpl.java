package com.odhill.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.odhill.model.Author;

/**
 * 
 * @author odhill
 *
 */
@Repository
public class AuthorDaoImpl extends GenericDaoImpl <Author, Long> implements AuthorDao {

	@Override
	public List<Author> getAll() {
		// TODO Auto-generated method stub
		return null;
	}


}
