package com.store_location_service.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.store_location_service.entity.Store;

public interface StoreLocatorRepository extends JpaRepository<Store, String>{

	
}
