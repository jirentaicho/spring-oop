package com.volkruss.deposit.application.action.deposit;

import com.volkruss.deposit.domain.entity.deposit.Deposit;

public abstract class DepositInitializeAction {
	
	public DepositResult handle(int id) {
		// リポジトリから取得する
		Deposit deposit = get(id);
		// 返却用のモデルを補完などする
		Deposit compedDeposit = complement(deposit);
		
		return toResult(compedDeposit);
	}
	
	protected abstract Deposit get(int id);
	
	protected abstract Deposit complement(Deposit deposit);
	
	protected abstract DepositResult toResult(Deposit deposit);
	
}
