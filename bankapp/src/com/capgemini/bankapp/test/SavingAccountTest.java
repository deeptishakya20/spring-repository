package com.capgemini.bankapp.test;
import static org.junit.Assert.*;


import org.junit.Test;

import com.capgemini.bankapp.exception.LowBalanceException;
import com.capgemini.bankapp.main.SavingAccount;


public class SavingAccountTest {
	
	private SavingAccount saving;
	
	
	@Test
	public void testSavingAccountWithDefaultConstructor() {
		saving=new SavingAccount();
		assertNotNull(saving);
		
	}
	//Testing without LowBalanceException in case of saving account as a salary account
	@Test
	public void testSavingAccountWithoutLowBalanceExceptionInSavingAccount() throws LowBalanceException{
		saving=new SavingAccount(101,"Deepti","SAVING",16000,true);
		assertEquals(13000,saving.withDrawBalance(3000),0.1);

	}
	
	//Testing with LowBalanceException in case of saving account as a salary account
	@Test (expected = LowBalanceException.class)
	public void testSavingAccountWithLowBalanceExceptionInSavingAccount() throws LowBalanceException{
		saving=new SavingAccount(101,"Deepti","SAVING",5000,true);
		assertEquals(5000,saving.withDrawBalance(8000),0.1);

	}
	
	//Testing without LowBalanceException in case of saving account as a not salary account
	@Test
	public void testSavingAccountWithoutLowBalanceExceptionInSalaryAccount() throws LowBalanceException{
		saving=new SavingAccount(101,"Deepti","SAVING",16000,false);
		assertEquals(13000,saving.withDrawBalance(3000),0.1);

	}
	
	//Testing with LowBalanceException in case of saving account as a not salary account
	@Test (expected = LowBalanceException.class)
	public void testSavingAccountWithLowBalanceExceptionInSalaryAccount() throws LowBalanceException{
		saving=new SavingAccount(101,"Deepti","SAVING",5000,false);
		assertEquals(5000,saving.withDrawBalance(8000),0.1);

	}
}
