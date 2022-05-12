package com.volkruss.deposit.domain.entity.deposit.ordinary;

import java.time.LocalDate;

import com.volkruss.deposit.domain.entity.deposit.BaseDeposit;

public final class OrdinaryDeposit extends BaseDeposit{
	
	private LocalDate withdrawDate;
	
	// 補完項目
	private int interest;
	
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
