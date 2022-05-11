package com.pension.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.pension.common.TransactionRequest;
import com.pension.common.TransactionResponse;
import com.pension.entity.PensionDetail;
import com.pension.entity.ProcessPensionInput;
import com.pension.service.ProcessPensionService;

@RestController
public class ProcessPensionController {

	@Autowired
	ProcessPensionService processPensionService;
	
	@PostMapping("/processPension")
	public TransactionResponse processPension(@RequestBody TransactionRequest transactionRequest) {
		TransactionResponse response = processPensionService.processPension(transactionRequest);
		return processPensionService.processPension(transactionRequest);
		
	}
}
