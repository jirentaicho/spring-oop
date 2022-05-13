package com.volkruss.deposit.domain.entity.deposit.account;

public class Account {
	
	private int number;
	private String name;
	
	public Account(int number, String name) {
		this.number = number;
		this.name = name;
	}
	
	public void updateName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
	public int getNumber() {
		return this.number;
	}
		
}
