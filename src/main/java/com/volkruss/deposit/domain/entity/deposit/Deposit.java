package com.volkruss.deposit.domain.entity.deposit;

public interface Deposit {
	
	int getAccountNumber();
	
	void setAccountNumber(int number);
	
	String getAccountName();
	
	void setAccountName(String name);
	
	int getAmount();
	
	void setAmount(int amount);

}
