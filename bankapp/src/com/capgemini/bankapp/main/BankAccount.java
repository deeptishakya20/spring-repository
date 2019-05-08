package com.capgemini.bankapp.main;

import com.capgemini.bankapp.exception.DebitLimitExceededException;
import com.capgemini.bankapp.exception.LowBalanceException;

public class BankAccount {

	private long accountNumber;
	private String accountHolderName;
	private String accountType;
	private double currentBalance;

	public BankAccount() {
		super();
	}

	public BankAccount(long accountNumber, String accountHolderName, String accountType, double currentBalance) {
		super();
		this.accountNumber = accountNumber;
		this.accountHolderName = accountHolderName;
		this.accountType = accountType;
		this.currentBalance = currentBalance;
	}

	public long getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getAccountHolderName() {
		return accountHolderName;
	}

	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public double getCurrentBalance() {
		return currentBalance;
	}

	public void setCurrentBalance(double currentBalance) {
		this.currentBalance = currentBalance;
	}

	public double depositBalance(double amount) {
		currentBalance = currentBalance + amount;
		return currentBalance;
	}

	public double withDrawBalance(double amount) throws LowBalanceException, DebitLimitExceededException{
		if (currentBalance >= amount) {
			currentBalance = currentBalance - amount;
			return currentBalance;
		} else {
			throw new LowBalanceException("You do not have sufficient balance");
			
		}
	}

}
