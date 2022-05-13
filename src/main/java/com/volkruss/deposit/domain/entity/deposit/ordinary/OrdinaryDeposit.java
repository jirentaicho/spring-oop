package com.volkruss.deposit.domain.entity.deposit.ordinary;

import java.time.LocalDate;

import com.volkruss.deposit.domain.entity.deposit.BaseDeposit;
import com.volkruss.deposit.domain.entity.deposit.account.Account;
import com.volkruss.deposit.domain.entity.deposit.account.Balance;

public final class OrdinaryDeposit extends BaseDeposit{
	
	private LocalDate withdrawDate;
		
	// 補完項目
	private int interest;
	
	public OrdinaryDeposit(String name,int number,int amt) {
		this.account = new Account(number,name);
		this.balance = new Balance(amt);
	}
	
	public void setWithdrawDate(LocalDate withdrawDate) {
		this.withdrawDate = LocalDate.of(
				withdrawDate.getYear(), withdrawDate.getMonth(), withdrawDate.getDayOfMonth());
	}
	
	public LocalDate getWithdrawDate() {
		return LocalDate.of(
				this.withdrawDate.getYear(), this.withdrawDate.getMonth(), this.withdrawDate.getDayOfMonth());
	}
	
	public void setInterest(int interest) {
		this.interest = interest;
	}
	
	public int getInterest() {
		return this.interest;
	}
	
}
