package com.example.demo;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.example.demo.controller.OrderMgntController;

@ExtendWith(SpringExtension.class)
@SpringBootTest
class OrderAssignmentApplicationTests {

	@Autowired
	OrderMgntController controller;
	
	@Test
	void contextLoads() {
		Assertions.assertThat(controller).isNot(null);
	}

}
