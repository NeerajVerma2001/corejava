package com.api.corejava;

public class AccountModel {
	private String accountNumber;
	private String customerName;
	private double balance;

	public AccountModel(String accountNumber, String customerName, double balance) {
		this.accountNumber = accountNumber;
		this.customerName = customerName;
		this.balance = balance;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public String getCustomerName() {
		return customerName;
	}

	public double getBalance() {
		return balance;
	}
	
	public void addAmount(double amount) {
		balance += amount;
	}
}
