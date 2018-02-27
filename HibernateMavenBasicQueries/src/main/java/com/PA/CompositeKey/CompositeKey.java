package com.PA.CompositeKey;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="composite")
public class CompositeKey {

	@Id
	private CompositeId id;
	private String location;
	
	public CompositeId getId() {
		return id;
	}
	public void setId(CompositeId id) {
		this.id = id;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	
	
}
