package com.pension.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pension.entity.ProcessPensionInput;

public interface ProcessPensionRepository extends JpaRepository<ProcessPensionInput, Long> {

}
