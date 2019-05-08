package com.capgemini.bankapp.main;
import com.capgemini.bankapp.exception.LowBalanceException;
import com.capgemini.bankapp.main.BankAccount;

public class SavingAccount extends BankAccount{

	private boolean salaryAccount;
	public static final double MINIMUM_AMOUNT= 5000;

	public  SavingAccount() {

	}
	
	

	public SavingAccount(long accountNumber, String accountHolderName, String accountType, double currentBalance, boolean salaryAccount) {
		super(accountNumber, accountHolderName, accountType, currentBalance);
		this.salaryAccount = salaryAccount;
	}




	public boolean isSalaryAccount() {
		return salaryAccount;
	}

	public void setSalaryAccount(boolean salaryAccount) {
		this.salaryAccount = salaryAccount;
	}
	

	@Override
	public double withDrawBalance(double amount)throws LowBalanceException{
		if(salaryAccount) {
			return super.withDrawBalance(amount);
		}
		else {
			if(getCurrentBalance() - amount >= MINIMUM_AMOUNT)
				super.setCurrentBalance(getCurrentBalance() - amount); 
			else
				throw new LowBalanceException("you don't have sufficient fund");
				
		}
		return getCurrentBalance();
	}

	

}




