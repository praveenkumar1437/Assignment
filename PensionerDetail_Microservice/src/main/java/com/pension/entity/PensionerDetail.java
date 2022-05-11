package com.pension.entity;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class PensionerDetail {

	@Id
	private long aadhaarNumber;
	private String name;
	private Date dob;
	private String pan;
	private float salaryEarned;
	private float allowances;
	private String pensionType;
	@OneToOne(cascade = CascadeType.ALL)
	private BankDetail bankDetail;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public String getPan() {
		return pan;
	}
	public void setPan(String pan) {
		this.pan = pan;
	}
	public float getSalaryEarned() {
		return salaryEarned;
	}
	public void setSalaryEarned(float salaryEarned) {
		this.salaryEarned = salaryEarned;
	}
	public float getAllowances() {
		return allowances;
	}
	public void setAllowances(float allowances) {
		this.allowances = allowances;
	}
	
	public BankDetail getBankDetail() {
		return bankDetail;
	}
	public void setBankDetail(BankDetail bankDetail) {
		this.bankDetail = bankDetail;
	}
	public long getAadhaarNumber() {
		return aadhaarNumber;
	}
	public void setAadhaarNumber(long aadhaarNumber) {
		this.aadhaarNumber = aadhaarNumber;
	}
	public String getPensionType() {
		return pensionType;
	}
	public void setPensionType(String pensionType) {
		this.pensionType = pensionType;
	}
	
}
