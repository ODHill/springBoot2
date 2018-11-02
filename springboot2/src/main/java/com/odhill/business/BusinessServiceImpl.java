package com.odhill.business;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.odhill.dao.AuthorDao;
import com.odhill.dao.TrackDao;
import com.odhill.model.Author;
import com.odhill.model.Track;

/**
 * 
 * @author odhill
 *
 */
@Service
public class BusinessServiceImpl implements BusinessService {
	
	@Autowired
	private TrackDao trackDao;
	
	@Autowired
	private AuthorDao authorDao;	
	
	@Override
	public List<Track> getAllTracks() {
		
		return trackDao.getAll();
		
	}
	
	@Override
	public Author getAuthor(String idAuthor) {
		
		return authorDao.find(Long.valueOf(idAuthor));
		
	}

}
