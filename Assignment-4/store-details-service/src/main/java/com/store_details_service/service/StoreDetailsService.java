package com.store_details_service.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.store_details_service.entity.Store;
import com.store_details_service.repository.StoreDetailRepository;

@Service
public class StoreDetailsService {
	@Autowired
	private StoreDetailRepository repo;

	public Store saveStoreDetails(Store store) {
		return repo.save(store);
	}

}
