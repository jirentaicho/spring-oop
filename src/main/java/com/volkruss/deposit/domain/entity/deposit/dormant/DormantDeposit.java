package com.volkruss.deposit.domain.entity.deposit.dormant;

import java.time.LocalDate;

import com.volkruss.deposit.domain.entity.deposit.BaseDeposit;

public class DormantDeposit extends BaseDeposit{
	
	private LocalDate dormantDate;
	
	//　補完項目
	private boolean isNotice = false;
	
	public void setDormantDate(LocalDate dormantDate) {
		this.dormantDate = LocalDate.of(
				dormantDate.getYear(),
				dormantDate.getMonth(), 
				dormantDate.getDayOfMonth());
	}
	
	public LocalDate getDormantDate() {
		return LocalDate.of(
				this.dormantDate.getYear(),
				this.dormantDate.getMonth(),
				this.dormantDate.getDayOfMonth());
	}

	public void setIsNotice(boolean notice) {
		this.isNotice = notice;
	}
	
	public boolean getIsNotice() {
		return this.isNotice;
	}
	
}
