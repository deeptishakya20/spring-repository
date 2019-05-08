package com.capgemini.bankapp.main;

import com.capgemini.bankapp.exception.DebitLimitExceededException;

public class CurrentAccount extends BankAccount{

	private double debitLimit;
	private double borrowedAmount;

	public CurrentAccount() {
		super();

	}

	public CurrentAccount(long accountId, String accountHolderName,String accountType, double accountBalance, double debitLimit) {
		super(accountId, accountHolderName, accountType, accountBalance);
		this.debitLimit = debitLimit;
	}

	public double getDebitLimit() {
		return debitLimit;
	}

	public void setDebitLimit(double debitLimit) {
		this.debitLimit = debitLimit;
	}

	public double getBorrowedAmount() {
		return borrowedAmount;
	}

	public void setBorrowedAmount(double borrowedAmount) {
		this.borrowedAmount = borrowedAmount;
	}
	
	@Override
	public double withDrawBalance(double amount) throws DebitLimitExceededException {
		double temp = getCurrentBalance() - amount;
		if(temp >= 0)
			setCurrentBalance(temp);
		else if(Math.abs(temp) <= (debitLimit - borrowedAmount)) {
			setCurrentBalance(0);
			borrowedAmount = borrowedAmount + Math.abs(temp);
		}
		else
			throw new DebitLimitExceededException("Debit Limit exceeded......");
		
		return getCurrentBalance();
	}
	
	@Override
	public double depositBalance(double amount) {
		if(borrowedAmount == 0)
			return super.depositBalance(amount);
		else if(amount >= borrowedAmount) {
			setCurrentBalance(amount - borrowedAmount);
			borrowedAmount = 0;			
		}
		else {
			borrowedAmount = borrowedAmount - amount;
		}
		return getCurrentBalance();
	}
	
	
}



