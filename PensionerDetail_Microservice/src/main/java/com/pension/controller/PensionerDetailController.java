package com.pension.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.pension.entity.PensionerDetail;
import com.pension.service.PensionerDetailService;

@RestController
public class PensionerDetailController {

	@Autowired
	PensionerDetailService pensionerDetailService;
	
	@GetMapping("/PensionerDetailByAadhaar/{aadhaarNumber}")
	public PensionerDetail pensionerDetailByAadhaar(@PathVariable long aadhaarNumber) {
		return pensionerDetailService.pensionerDetailByAadhaar(aadhaarNumber);
	}
	@PostMapping("/createPensioner")
	public PensionerDetail createPensioner(@RequestBody PensionerDetail pensionerDetail) {
		return pensionerDetailService.createPensioner(pensionerDetail);
	}
}
