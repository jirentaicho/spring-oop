package com.volkruss.deposit.domain.entity.deposit.account;

import com.volkruss.deposit.domain.entity.mony.Money;

public class Balance {
	
	private Money amount;
	
	public Balance(int amt) {
		this.amount = new Money(amt);
	}
	
	public void add(int plus) {
		this.amount = this.amount.add(plus);
	}
	
	public void sub(int sub) {
		this.amount = this.amount.sub(sub);
	}
	
	public int inquiry() {
		return this.amount.getValue();
	}

}
