package com.volkruss.deposit.controller.ordinary;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.volkruss.deposit.application.action.deposit.ordinary.OrdinaryResult;
import com.volkruss.deposit.application.usecase.ordinary.OrdinaryInitializeUseCase;

@RestController
public class OrdinaryController {
	
	@Autowired
	private OrdinaryInitializeUseCase ordinaryInitializeUseCase;
	
	@GetMapping("/api/ordinary/get/{id}")
	public OrdinaryResult get(@PathVariable("id") int id) {
		// usercaseの利用
		OrdinaryResult result = this.ordinaryInitializeUseCase.findOrdinaryDiposit(id);
		return result;
	}
}
