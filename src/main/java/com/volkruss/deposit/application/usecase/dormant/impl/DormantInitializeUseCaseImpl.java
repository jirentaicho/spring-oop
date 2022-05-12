package com.volkruss.deposit.application.usecase.dormant.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.volkruss.deposit.application.action.deposit.DepositInitializeAction;
import com.volkruss.deposit.application.action.deposit.dormant.DormantResult;
import com.volkruss.deposit.application.usecase.dormant.DormantInitializeUseCase;

@Component
public class DormantInitializeUseCaseImpl implements DormantInitializeUseCase{

	@Autowired
	@Qualifier("dormant")
	private DepositInitializeAction action;
	
	@Override
	public DormantResult findDormantDeposit(int id) {
		DormantResult result = (DormantResult) action.handle(id);
		return result;
	}

}
