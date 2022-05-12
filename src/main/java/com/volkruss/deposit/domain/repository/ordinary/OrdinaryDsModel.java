package com.volkruss.deposit.domain.repository.ordinary;

import java.time.LocalDate;

public class OrdinaryDsModel {
	public String accountName;
	public int amount;
	public LocalDate withdrawDate;
	public int accountNumber;
	public OrdinaryDsModel(String name,int number,int amount,LocalDate withdraw) {
		this.accountName = name;
		this.accountNumber = number;
		this.amount = amount;
		this.withdrawDate = LocalDate.of(
				withdraw.getYear(), withdraw.getMonth(), withdraw.getDayOfMonth());
	}
}
