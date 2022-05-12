package com.volkruss.deposit.application.action.deposit.dormant;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.volkruss.deposit.application.action.deposit.DepositInitializeAction;
import com.volkruss.deposit.application.action.deposit.DepositResult;
import com.volkruss.deposit.domain.entity.deposit.Deposit;
import com.volkruss.deposit.domain.entity.deposit.dormant.DormantDeposit;
import com.volkruss.deposit.domain.repository.dormant.DormantRepository;

@Component("dormant")
public final class DormantInitializeAction extends DepositInitializeAction{

	@Autowired
	private DormantRepository dormantRepository;
	
	@Override
	protected Deposit get(int id) {
		DormantDeposit deposit = this.dormantRepository.findById(id);
		return deposit;
	}

	@Override
	protected Deposit complement(Deposit deposit) {
		DormantDeposit compDeposit = (DormantDeposit)deposit;
		// comp
		compDeposit.setIsNotice(true);
		return compDeposit;
	}

	@Override
	protected DepositResult toResult(Deposit deposit) {
		DormantDeposit dormantDeposit = (DormantDeposit)deposit;
		DormantResult result = new DormantResult();
		result.accountName = dormantDeposit.getAccountName();
		result.accountNumber = dormantDeposit.getAccountNumber();
		result.amount = dormantDeposit.getAmount();
		result.dormantDate = LocalDate.of(
				dormantDeposit.getDormantDate().getYear(), 
				dormantDeposit.getDormantDate().getMonth(), 
				dormantDeposit.getDormantDate().getDayOfMonth());
		result.notice = dormantDeposit.getIsNotice();
		return result;
	}

}
