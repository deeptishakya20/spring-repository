package com.capgemini.bankapp.test;

import static org.junit.Assert.*;

import org.junit.jupiter.api.Test;

import com.capgemini.bankapp.exception.DebitLimitExceededException;
import com.capgemini.bankapp.main.CurrentAccount;


public class CurrentAccountTest {

	private CurrentAccount current;
	
	@Test
	public void testCurrentAccountWithDefaultConstructor() {
		current=new CurrentAccount();
		assertNotNull(current);
		
	}
	
	@Test
	public void  testCurrentAccountWhenAccountBalanceIsSufficient() throws DebitLimitExceededException {
		current=new CurrentAccount(101,"Deepti","CURRENT",16000,20000);
		assertEquals(500, current.withDrawBalance(44500),0.01);
	}
	

	
	@Test
	public void testCurrentBankAccountWithdrawWithFundWithinDebitLimit() throws DebitLimitExceededException
	{
		assertEquals(0, current.withDrawBalance(51000),0.01);
		assertEquals(6000, ((CurrentAccount) current).getBorrowedAmount(), 0.01);
	}
	
	
	@Test
	public void testCurrentBankAccountWithdrawWithFundWithDebitLimitExceeded() throws DebitLimitExceededException
	{
		assertEquals(45000, current.withDrawBalance(56000),0.01);
		assertEquals(0, ((CurrentAccount) current).getBorrowedAmount(), 0.01);
	}
	
	@Test
	public void testCurrentBankAccountDepositWithNoBorrowedAmount()
	{
		assertEquals(65000, current.depositBalance(20000),0.01);
	}
	
	@Test
	public void testCurrentBankAccountDepositWithAmountGreaterThanBorrowedAmount() throws DebitLimitExceededException
	{
		current = new CurrentAccount(101, "John Doe", "SAVING", 45000, 10000);
		assertEquals(0, current.withDrawBalance(47000),0.01);
		assertEquals(2000, current.getBorrowedAmount(),0.01);
		assertEquals(8000, current.depositBalance(10000),0.01);
	}
	
	@Test
	public void testCurrentBankAccountDepositWithAmountLessThanBorrowedAmount() throws DebitLimitExceededException
	{
		CurrentAccount account = new CurrentAccount(101, "John Doe", "SAVING", 45000, 10000);
		assertEquals(0, account.withDrawBalance(47000),0.01);
		assertEquals(2000, account.getBorrowedAmount(),0.01);
		assertEquals(0, account.withDrawBalance(1000),0.01);
		assertEquals(1000, account.getBorrowedAmount(),0.01);
	}

}