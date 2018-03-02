package com.PA.Services;

import java.util.List;

import com.PA.Domain.Scholar;

public interface ScholarService {

	public void addOrUpdateScholar(Scholar scholar);
	
	public List<Scholar> loadAll();
	
	public void delete(int id);
	
	public Scholar loadById(int id);
	
	public List<Scholar> loadByLastName(String lastName);
	
	public void update(Scholar scholar);
	
}
