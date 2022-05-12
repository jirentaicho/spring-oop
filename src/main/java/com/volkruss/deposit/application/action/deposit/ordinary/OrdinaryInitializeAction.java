package com.volkruss.deposit.application.action.deposit.ordinary;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.volkruss.deposit.application.action.deposit.DepositInitializeAction;
import com.volkruss.deposit.application.action.deposit.DepositResult;
import com.volkruss.deposit.domain.entity.deposit.Deposit;
import com.volkruss.deposit.domain.entity.deposit.ordinary.OrdinaryDeposit;
import com.volkruss.deposit.domain.repository.ordinary.OrdinaryRepository;

@Component("ordinary")
public class OrdinaryInitializeAction extends DepositInitializeAction{

	@Autowired
	private OrdinaryRepository ordinaryRepository; 
	
	@Override
	protected Deposit get(int id) {
		OrdinaryDeposit deposit = this.ordinaryRepository.findById(id);
		return deposit;
	}

	@Override
	protected Deposit complement(Deposit deposit) {
		OrdinaryDeposit ordinaryDeposit = (OrdinaryDeposit)deposit;
		// 補完する
		ordinaryDeposit.setInterest(this.calcLogic(ordinaryDeposit.getAmount()));
		return ordinaryDeposit;
	}
	
	private int calcLogic(int amt) {
		// 本来は別のクラスなどが担当する
		return amt * 2;
	}

	@Override
	protected DepositResult toResult(Deposit deposit) {
		OrdinaryDeposit ordinaryDeposit = (OrdinaryDeposit)deposit;
		
		OrdinaryResult result = new OrdinaryResult();
		result.accountName = ordinaryDeposit.getAccountName();
		result.accountNumber = ordinaryDeposit.getAccountNumber();
		result.amount = ordinaryDeposit.getAmount();
		result.withdrawDate = LocalDate.of(
				ordinaryDeposit.getWithdrawDate().getYear(),
				ordinaryDeposit.getWithdrawDate().getMonth(),
				ordinaryDeposit.getWithdrawDate().getDayOfMonth());
		result.interest = ordinaryDeposit.getInterest();
		return result;
	}

}
