package com.PA.Pojo.Inheritance.Single;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table (name="cd")
@DiscriminatorValue ("International")
public class InernationalCD extends CD{

	/**
	 * 
	 */
	//private static final long serialVersionUID = 1L;
	
	private String country;

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}
	
	
}
