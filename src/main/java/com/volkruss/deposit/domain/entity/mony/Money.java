package com.volkruss.deposit.domain.entity.mony;

public class Money {
	
	private int value;
	
	public Money(int value) {
		this.value = value;
	}
	
	public Money add(int value) {
		return new Money(this.value += value);
	}
	
	public Money sub(int value) {
		return new Money(this.value -= value);
	}
	
	public int getValue() {
		return this.value;
	}
	
	
}
