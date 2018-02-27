package com.PA.Mappings.OneToOne;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="address")
public class Address {

	@Id
	private int id;
	private String city;
	private String state;
	
	@OneToOne
	@JoinColumn(name="eId")//defines foreign key relation
	private Employee employe;
	
	public Employee getEmploye() {
		return employe;
	}
	public void setEmploye(Employee employe) {
		this.employe = employe;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
}
