/**
 * 
 */
package com.odhill.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 * @author odhill
 *
 */
@Entity
@Table(name="TRACK")
@NamedQueries(
		@NamedQuery(name = "getAllTracks", query = "SELECT track FROM Track track"))
public class Track implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 8202459082740161315L;
	
	public static final String QUERY_GET_ALL_TRACKS = "getAllTracks";

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ID_TRACK")
	private Long idTrack;
	
	@Column(name="NAME")
	private String name;

	/**
	 * @return the idTrack
	 */
	public Long getIdTrack() {
		return idTrack;
	}

	/**
	 * @param idTrack the idTrack to set
	 */
	public void setIdTrack(Long idTrack) {
		this.idTrack = idTrack;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	

}
