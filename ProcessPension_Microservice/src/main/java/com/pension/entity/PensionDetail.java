package com.pension.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class PensionDetail {

	@Id
	private Integer pid;
	private double pensionAmount;
	private int BankServiceCharge;
	@OneToOne(mappedBy ="pensionDetail")
	private ProcessPensionInput pensionInput;
	
	public double getPensionAmount() {
		return pensionAmount;
	}
	public void setPensionAmount(double pensionAmount) {
		this.pensionAmount = pensionAmount;
	}
	public int getBankServiceCharge() {
		return BankServiceCharge;
	}
	public void setBankServiceCharge(int bankServiceCharge) {
		BankServiceCharge = bankServiceCharge;
	}
	public Integer getPid() {
		return pid;
	}
	public void setPid(Integer pid) {
		this.pid = pid;
	}
	public ProcessPensionInput getPensionInput() {
		return pensionInput;
	}
	public void setPensionInput(ProcessPensionInput pensionInput) {
		this.pensionInput = pensionInput;
	}
	
	
	
}
