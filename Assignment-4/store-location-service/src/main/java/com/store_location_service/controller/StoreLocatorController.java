package com.store_location_service.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.store_location_service.entity.Store;
import com.store_location_service.service.StoreLocatorService;

@RestController
public class StoreLocatorController {
	
	@Autowired
	private StoreLocatorService service;
	
	@PostMapping("/storeLocator/{pincode}")
	public List<Store> getStoreDetails(@PathVariable String pincode){
		
		return service.getStoreDetails(pincode);
	}

}
