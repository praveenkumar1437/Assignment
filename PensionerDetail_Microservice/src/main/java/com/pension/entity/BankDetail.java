package com.pension.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class BankDetail {

	@Id
	private int accountNumber;
	private String bankName;
	private String bankType;
	@OneToOne(mappedBy = "bankDetail")
	private PensionerDetail pensionerDetail;
	
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	public int getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	
	public PensionerDetail getPensionerDetail() {
		return pensionerDetail;
	}
	public void setPensionerDetail(PensionerDetail pensionerDetail) {
		this.pensionerDetail = pensionerDetail;
	}
	public String getBankType() {
		return bankType;
	}
	public void setBankType(String bankType) {
		this.bankType = bankType;
	}
	
	
	
}
