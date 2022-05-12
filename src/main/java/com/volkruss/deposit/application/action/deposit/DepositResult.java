package com.volkruss.deposit.application.action.deposit;

public abstract class DepositResult {
	// 結果オブジェクトなので全てpublicにしていますがprivateにしてlombokなどでアクセサをつけてもいい
	public int accountNumber;
	public String accountName;
	public int amount;
}
