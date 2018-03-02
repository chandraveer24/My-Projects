package com.PA.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.PA.DAO.ScholarDAO;
import com.PA.Domain.Scholar;

@Service
public class ScholarServiceImpl implements ScholarService{

	@Autowired
	private ScholarDAO scholarDAO;
	
	public void addOrUpdateScholar(Scholar scholar) {
		scholarDAO.addOrUpdate(scholar);
	}

	public List<Scholar> loadAll() {
		List<Scholar> list = scholarDAO.loadAll();
		return list;
	}

	public void delete(int id) {
		scholarDAO.delete(id);
	}

	public Scholar loadById(int id) {
		Scholar scholar = scholarDAO.getById(id);
		return scholar;
	}

	public List<Scholar> loadByLastName(String lastName) {

		List<Scholar> allScholars = scholarDAO.loaddAllScholars(lastName);
		return allScholars;
	}

	public void update(Scholar scholar) {
		scholarDAO.updateScholar(scholar);
	}
	
	

	
}
