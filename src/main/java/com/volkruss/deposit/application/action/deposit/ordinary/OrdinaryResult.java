package com.volkruss.deposit.application.action.deposit.ordinary;

import java.time.LocalDate;

import com.volkruss.deposit.application.action.deposit.DepositResult;


public class OrdinaryResult extends DepositResult{

	public LocalDate withdrawDate;
	
	public int interest;

}
