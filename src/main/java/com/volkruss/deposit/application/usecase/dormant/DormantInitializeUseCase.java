package com.volkruss.deposit.application.usecase.dormant;

import com.volkruss.deposit.application.action.deposit.dormant.DormantResult;

public interface DormantInitializeUseCase {
	DormantResult findDormantDeposit(int id);
}
