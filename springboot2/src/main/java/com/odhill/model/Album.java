/**
 * 
 */
package com.odhill.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * @author odhill
 *
 */
@Entity
@Table(name="ALBUM")
public class Album implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -2330413679527543333L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ID_ALBUM")
	private Long idAlbum;
	
	@Column(name = "NAME")
	private String name;
	
	@Column(name = "YEAR")
	private int year;
	
	@OneToMany
	@JoinColumn(name = "ID_ALBUM")
	private List<Track> tracks = new ArrayList<>();

	/**
	 * @return the idAlbum
	 */
	public Long getIdAlbum() {
		return idAlbum;
	}

	/**
	 * @param idAlbum the idAlbum to set
	 */
	public void setIdAlbum(Long idAlbum) {
		this.idAlbum = idAlbum;
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

	/**
	 * @return the year
	 */
	public int getYear() {
		return year;
	}

	/**
	 * @param year the year to set
	 */
	public void setYear(int year) {
		this.year = year;
	}

	/**
	 * @return the tracks
	 */
	public List<Track> getTracks() {
		return tracks;
	}

	/**
	 * @param tracks the tracks to set
	 */
	public void setTracks(List<Track> tracks) {
		this.tracks = tracks;
	}		
 
}
