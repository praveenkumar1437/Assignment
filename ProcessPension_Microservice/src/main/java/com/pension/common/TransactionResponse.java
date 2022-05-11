package com.pension.common;

import com.pension.entity.ProcessPensionInput;

public class TransactionResponse {

 private ProcessPensionInput processPensionInput;
 private PensionerDetail pensionerDetail;
 
 
public TransactionResponse(ProcessPensionInput processPensionInput, PensionerDetail pensionerDetail) {
	super();
	this.processPensionInput = processPensionInput;
	this.pensionerDetail = pensionerDetail;
}
public ProcessPensionInput getProcessPensionInput() {
	return processPensionInput;
}
public void setProcessPensionInput(ProcessPensionInput processPensionInput) {
	this.processPensionInput = processPensionInput;
}
public PensionerDetail getPensionerDetail() {
	return pensionerDetail;
}
public void setPensionerDetail(PensionerDetail pensionerDetail) {
	this.pensionerDetail = pensionerDetail;
}
 
 
}
