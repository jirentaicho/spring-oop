package com.volkruss.deposit.application.usecase.ordinary;

import com.volkruss.deposit.application.action.deposit.ordinary.OrdinaryResult;

public interface OrdinaryInitializeUseCase {
	OrdinaryResult findOrdinaryDiposit(int id);
}
