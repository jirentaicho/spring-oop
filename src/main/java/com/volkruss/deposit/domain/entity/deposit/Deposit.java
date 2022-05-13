package com.volkruss.deposit.domain.entity.deposit;

public interface Deposit {
	
	int getAccountNumber();
	
	String getAccountName();
	
	int getAmount();
	
	void setAmount(int amount);

}
