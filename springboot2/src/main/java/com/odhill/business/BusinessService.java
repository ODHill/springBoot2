/**
 * 
 */
package com.odhill.business;

import java.util.List;

import com.odhill.model.Author;
import com.odhill.model.Track;

/**
 * @author odhill
 *
 */
public interface BusinessService {

	List<Track> getAllTracks();

	Author getAuthor(String idAuthor);

}
