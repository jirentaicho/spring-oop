package com.volkruss.deposit.domain.entity.deposit;

import com.volkruss.deposit.domain.entity.deposit.account.Account;

public abstract class BaseDeposit implements Deposit{
	
	protected Account account;
	
	private int amount;
	
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
		return this.amount;
	}

	@Override
	public void setAmount(int amount) {
		this.amount = amount;
	}
}
