package com.odhill.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.odhill.model.Track;

/**
 * 
 * @author odhill
 *
 */
@Repository
public class TrackDaoImpl extends GenericDaoImpl <Track, Long> implements TrackDao {

	@SuppressWarnings("unchecked")
	public List<Track> getAll() {
		return em.createNamedQuery(Track.QUERY_GET_ALL_TRACKS).getResultList();
	}

}
