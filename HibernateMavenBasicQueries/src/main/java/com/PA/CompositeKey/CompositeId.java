package com.PA.CompositeKey;

import java.io.Serializable;

import javax.persistence.Embeddable;

@Embeddable
public class CompositeId implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String firstname;
	private String lastname;
	private String phoneNo;
	
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
	
	
}
