package com.volkruss.deposit.domain.repository.dormant;

import java.time.LocalDate;

public class DormantDsModel {
	public String accountName;
	public int amount;
	public LocalDate dormantDate;
	public int accountNumber;
	
	public DormantDsModel(String name,int number,int amount,LocalDate dormantDate) {
		this.accountName = name;
		this.accountNumber = number;
		this.amount = amount;
		this.dormantDate = LocalDate.of(
				dormantDate.getYear(), dormantDate.getMonth(), dormantDate.getDayOfMonth());
	}
	
}
