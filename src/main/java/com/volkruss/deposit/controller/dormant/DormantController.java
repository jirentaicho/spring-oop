package com.volkruss.deposit.controller.dormant;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.volkruss.deposit.application.usecase.dormant.DormantInitializeUseCase;

@RestController
public class DormantController {
	
	@Autowired
	private DormantInitializeUseCase dormantInitializeUseCase;

	@GetMapping("/api/dormant/get/{id}")
	public Object find(@PathVariable("id") int id) {
		return dormantInitializeUseCase.findDormantDeposit(id);
	}
	
}
