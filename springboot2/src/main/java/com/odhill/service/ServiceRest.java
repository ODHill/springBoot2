/**
 * 
 */
package com.odhill.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.odhill.business.BusinessService;
import com.odhill.model.Author;
import com.odhill.model.Track;

/**
 * @author odhill
 *
 */
@RestController
@RequestMapping(value="/rest")
public class ServiceRest {
	
	@Autowired
	private BusinessService businessService;	
	
	@GetMapping(value="/tracks", produces= MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<Track>> getAllTracks() {
		return new ResponseEntity<List<Track>>(businessService.getAllTracks(), HttpStatus.OK);
	}
	
	@GetMapping(value="/author/{id}", produces= MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Author> getAuthor(@PathVariable("id")String idAuthor) {
		return new ResponseEntity<Author>(businessService.getAuthor(idAuthor), HttpStatus.OK);
	}
	

}
