package com.PA.Pojo.Inheritance.Single;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table (name="cd")
@DiscriminatorValue ("Region Specific")
public class SpecificRegionCD  extends CD{

	/**
	 * 
	 */
	//private static final long serialVersionUID = 1L;
	
	private String features;

	public String getFeatures() {
		return features;
	}

	public void setFeatures(String features) {
		this.features = features;
	}
	
	
}
