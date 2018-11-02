/**
 * 
 */
package com.odhill.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * @author odhill
 *
 */
@Entity
@Table(name = "AUTHOR")
public class Author implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 7028015649862473123L;

	@Id
	@Column(name = "ID_AUTHOR")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long idAuthor;
	
	@Column(name = "NAME")
	private String name;
	
	@Column(name = "NATIONALITY")
	private String nationality;
	
	@Column(name = "BIRTHDATE")
	@Temporal(TemporalType.DATE)
	private Calendar birthdate;
	
	@OneToMany(fetch = FetchType.LAZY)
	@JoinColumn(name = "ID_AUTHOR")
	private List<Album> albums = new ArrayList<>();
	
	/**
	 * @return the idAuthor
	 */
	public Long getIdAuthor() {
		return idAuthor;
	}

	/**
	 * @param idAuthor the idAuthor to set
	 */
	public void setIdAuthor(Long idAuthor) {
		this.idAuthor = idAuthor;
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
	 * @return the nationality
	 */
	public String getNationality() {
		return nationality;
	}

	/**
	 * @param nationality the nationality to set
	 */
	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	/**
	 * @return the birthdate
	 */
	public Calendar getBirthdate() {
		return birthdate;
	}

	/**
	 * @param birthdate the birthdate to set
	 */
	public void setBirthdate(Calendar birthdate) {
		this.birthdate = birthdate;
	}

	/**
	 * @return the albums
	 */
	public List<Album> getAlbums() {
		return albums;
	}

	/**
	 * @param albums the albums to set
	 */
	public void setAlbums(List<Album> albums) {
		this.albums = albums;
	}
		
}
