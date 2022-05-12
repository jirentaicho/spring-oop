package com.volkruss.deposit.application.usecase.ordinary.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.volkruss.deposit.application.action.deposit.DepositInitializeAction;
import com.volkruss.deposit.application.action.deposit.ordinary.OrdinaryResult;
import com.volkruss.deposit.application.usecase.ordinary.OrdinaryInitializeUseCase;

@Component
public class OrdinaryInitializeUseCaseImpl implements OrdinaryInitializeUseCase{
	
	@Autowired
	@Qualifier("ordinary")
	private DepositInitializeAction action;
	
	@Override
	public OrdinaryResult findOrdinaryDiposit(int id) {
		// ここで共通のActionを利用する
		OrdinaryResult result = (OrdinaryResult) this.action.handle(id);
		// 結果を返却する
		return result;
	}

}
