package com.pension.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.pension.common.PensionerDetail;
import com.pension.common.TransactionRequest;
import com.pension.common.TransactionResponse;
import com.pension.entity.PensionDetail;
import com.pension.entity.ProcessPensionInput;
import com.pension.repository.ProcessPensionRepository;

@Service
public class ProcessPensionService {
	
	@Autowired
	private ProcessPensionRepository processPensionRepository;
	
	@Autowired
	private RestTemplate template;

	public TransactionResponse processPension(TransactionRequest request) {
		
		ProcessPensionInput pensionInput = request.getProcessPensionInput();
		PensionerDetail pensionerDetail = request.getPensionerDetail();
		
		
		
		//client-side load balancing
		PensionerDetail pensionerResponse = template.postForObject("http://PENSIONDETAIL-SERVICE/PensionerDetailByAadhaar/{aadhaarNumber}", pensionerDetail,
				PensionerDetail.class);
		
		
		return new TransactionResponse(pensionInput,pensionerResponse);
	}
	
}
