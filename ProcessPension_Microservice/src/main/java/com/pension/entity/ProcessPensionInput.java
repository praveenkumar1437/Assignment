package com.pension.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class ProcessPensionInput {

	@Id
	private long aadharNumber;
	@OneToOne(cascade = CascadeType.ALL)
	private PensionDetail pensionDetail;
	

	public long getAadharNumber() {
		return aadharNumber;
	}

	public void setAadharNumber(long aadharNumber) {
		this.aadharNumber = aadharNumber;
	}

	public PensionDetail getPensionDetail() {
		return pensionDetail;
	}

	public void setPensionDetail(PensionDetail pensionDetail) {
		this.pensionDetail = pensionDetail;
	}
	
	
	
	
}
