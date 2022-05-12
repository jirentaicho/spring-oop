package com.volkruss.deposit.application.action.deposit.dormant;

import java.time.LocalDate;

import com.volkruss.deposit.application.action.deposit.DepositResult;

public class DormantResult extends DepositResult{
	// 休眠日
	public LocalDate dormantDate;
	// 通知済
	public boolean notice;

}
