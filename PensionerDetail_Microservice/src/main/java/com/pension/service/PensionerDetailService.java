package com.pension.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pension.entity.PensionerDetail;
import com.pension.repository.PensionerDetailRepository;

@Service
public class PensionerDetailService {

	@Autowired
	PensionerDetailRepository pensionerDetailRepository;
	
	public PensionerDetail pensionerDetailByAadhaar(long aadhaarNumber) {
		return pensionerDetailRepository.getById(aadhaarNumber);
	}

	public PensionerDetail createPensioner(PensionerDetail pensionerDetail) {
		
		return pensionerDetailRepository.save(pensionerDetail);
	}

	
}
