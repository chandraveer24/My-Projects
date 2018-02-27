package com.PA.Pojo;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedNativeQuery;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import org.hibernate.annotations.Type;

@NamedQueries(
		{ 
			@NamedQuery(
					name = "retrieveStudents", 
					query = "from Clerk"
					) 
			}
				)

@NamedNativeQuery(name = "retrieveClerks", query = "SELECT * from clerk", 
                  resultClass = Clerk.class)

@Entity
@Table(name = "clerk", schema = "javatraining")
public class Clerk {

	@Id // Natural key mapping
	private String ssn;
	private String name;
	private Date joinedDate;
	private Date terminationDate;

	// 1 as true 0 as false
	@Type(type = "org.hibernate.type.NumericBooleanType")
	private boolean active;

	public Clerk() {

	}

	public Clerk(String ssn, String name, Date joinedDate, boolean active) {
		// super();
		this.ssn = ssn;
		this.name = name;
		this.joinedDate = joinedDate;
		this.active = active;
	}

	public String getSsn() {
		return ssn;
	}

	public void setSsn(String ssn) {
		this.ssn = ssn;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getJoinedDate() {
		return joinedDate;
	}

	public void setJoinedDate(Date joinedDate) {
		this.joinedDate = joinedDate;
	}

	public Date getTerminationDate() {
		return terminationDate;
	}

	public void setTerminationDate(Date terminationDate) {
		this.terminationDate = terminationDate;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	@Override
	public String toString() {
		return "Clerk [ssn=" + ssn + ", name=" + name + ", joinedDate=" + joinedDate + ", terminationDate="
				+ terminationDate + ", active=" + active + "]";
	}

}
