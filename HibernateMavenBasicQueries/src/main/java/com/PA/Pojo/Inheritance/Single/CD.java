package com.PA.Pojo.Inheritance.Single;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Table (name="cd")
@Inheritance (strategy=InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn (name="cd_type", discriminatorType=DiscriminatorType.STRING )
@DiscriminatorValue("cd")
public class CD  {

	/**
	 * 
	 */
	//private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue (strategy=GenerationType.IDENTITY)
	@Column(name="cd_id")
	private int id;
	private String title;
	private String artist;
	
	@Column(name="purshaseDate")
	private Date purchaseDate;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	public Date getPurchaseDate() {
		return purchaseDate;
	}

	public void setPurchaseDate(Date purchaseDate) {
		this.purchaseDate = purchaseDate;
	}

}
