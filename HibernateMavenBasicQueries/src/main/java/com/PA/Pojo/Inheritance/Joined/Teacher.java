package com.PA.Pojo.Inheritance.Joined;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table (name="teacher")
@PrimaryKeyJoinColumn (name="teacher_id", referencedColumnName="id")
public class Teacher extends Person {

	/**
	 * 
	 */
	//private static final long serialVersionUID = 1L;

	private String subject;
	private int salary;

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

}
