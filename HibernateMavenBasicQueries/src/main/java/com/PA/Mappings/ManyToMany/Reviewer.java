package com.PA.Mappings.ManyToMany;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="reviewer")
public class Reviewer {

	/**
	 * 
	 */
	//private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int reviewer_Id;
	private String reviewer_name;
	
	@ManyToMany(cascade=CascadeType.ALL)
	@JoinTable (name="reviewer_task", joinColumns= {@JoinColumn(name="reviewer_Id")},
	inverseJoinColumns= {@JoinColumn(name="task_Id")})
	private List<Task> tasks=new ArrayList<Task>();

	public int getReviewer_Id() {
		return reviewer_Id;
	}

	public void setReviewer_Id(int reviewer_Id) {
		this.reviewer_Id = reviewer_Id;
	}

	public String getReviewer_name() {
		return reviewer_name;
	}

	public void setReviewer_name(String reviewer_name) {
		this.reviewer_name = reviewer_name;
	}

	public List<Task> getTasks() {
		return tasks;
	}

	public void setTasks(List<Task> tasks) {
		this.tasks = tasks;
	}
	
	
}
