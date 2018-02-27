package org.PA.Inheritance;

import java.util.Date;

public class Contractor extends Person{

	private Date contractStartDate;
	private Date contractEnddate;

	public Date getContractStartDate() {
		return contractStartDate;
	}

	public void setContractStartDate(Date contractStartDate) {
		this.contractStartDate = contractStartDate;
	}

	public Date getContractEnddate() {
		return contractEnddate;
	}

	public void setContractEnddate(Date contractEnddate) {
		this.contractEnddate = contractEnddate;
	}

}
