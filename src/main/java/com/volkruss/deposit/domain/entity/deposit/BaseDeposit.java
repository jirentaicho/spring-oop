package com.volkruss.deposit.domain.entity.deposit;

public abstract class BaseDeposit implements Deposit{
	
	private int accountNumber;
	
	private String accountName;
	
	private int amount;
	
	@Override
	public final int getAccountNumber() {
		return this.accountNumber;
	}
			
	@Override
	public final String getAccountName() {
		return this.accountName;
	}
	
	@Override
	public int getAmount() {
		return this.amount;
	}

	@Override
	public void setAccountNumber(int number) {
		this.accountNumber = number;
	}

	@Override
	public void setAccountName(String name) {
		this.accountName = name;
	}

	@Override
	public void setAmount(int amount) {
		this.amount = amount;
	}
}
