package com.PA.Pojo.Inheritance.Joined;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name="stu")
@PrimaryKeyJoinColumn (name="student_id", referencedColumnName="id")
public class Student extends Person {

	/**
	 * +
	 */
	//private static final long serialVersionUID = 1L;

	private String instructor;
	private String Specialization;

	public String getInstructor() {
		return instructor;
	}

	public void setInstructor(String instructor) {
		this.instructor = instructor;
	}

	public String getSpecialization() {
		return Specialization;
	}

	public void setSpecialization(String specialization) {
		Specialization = specialization;
	}

}
