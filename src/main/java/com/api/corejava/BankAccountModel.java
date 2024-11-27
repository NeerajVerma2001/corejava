package com.api.corejava;

import java.util.HashMap;
import java.util.Map;

public class BankAccountModel {
	private Map<String, AccountModel> accounts;

	public BankAccountModel() {
		this.accounts = new HashMap<>();
	}

	public void addAccount(String accountNumber, String customerName, double balance) {
		accounts.put(accountNumber, new AccountModel(accountNumber, customerName, balance));
	}

	public void displayBankDetails(String accountNumber) {
		if (accounts.containsKey(accountNumber)) {
			AccountModel model = accounts.get(accountNumber);
			System.out.println("this is account number : " + model.getAccountNumber());
			System.out.println("this is the customer name : " + model.getCustomerName());
			System.out.println("this is the balance : " + model.getBalance());
		} else {
			System.out.println("Not Found :) ");
		}
	}

	public void addBalance(String accountNumber, double balance) {
		if (accounts.containsKey(accountNumber)) {
			AccountModel accountAdd = accounts.get(accountNumber);
			accountAdd.addAmount(balance);
			System.out.println(" aad account number :- " + accountAdd.getAccountNumber());
			System.out.println(" add balace show :- " + accountAdd.getBalance());
		} else {
			System.out.println("not found account number  ");
		}
	}
	
	public Map<String, AccountModel> getAccounts() {
        return accounts;
    }

}
