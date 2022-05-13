package com.volkruss.deposit.domain.entity.deposit;

import com.volkruss.deposit.domain.entity.deposit.account.Account;
import com.volkruss.deposit.domain.entity.deposit.account.Balance;

public abstract class BaseDeposit implements Deposit{
	
	protected Account account;
	
	protected Balance balance;
	
	@Override
	public final int getAccountNumber() {
		return this.account.getNumber();
	}
			
	@Override
	public final String getAccountName() {
		return this.account.getName();
	}
	
	@Override
	public int getAmount() {
		return this.balance.inquiry();
	}

}
