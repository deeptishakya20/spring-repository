package com.capgemini.files.client;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStreamWriter;

import com.capgemini.files.client.BankAccount;
import com.capgemini.files.client.DebitCard;

public class SerializationDemo {
	
	public static void main(String args[]) throws IOException, ClassNotFoundException{
		
		DebitCard debitCard =new DebitCard(1111222233334444L,234,11,2011);
		BankAccount bankAccount=new BankAccount(101,"John","SAVING",3400,debitCard);
		
		
		//Serialization process
		FileOutputStream fileOutputStream = new FileOutputStream("account.ser");
		ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
		
		objectOutputStream.writeObject(bankAccount);
		objectOutputStream.close();
		
		
		FileInputStream fileInputStream = new FileInputStream("account.ser");
		ObjectInputStream inputStream = new ObjectInputStream(fileInputStream);
		
		
		
		BankAccount account = (BankAccount) inputStream.readObject();
		inputStream.close();
		
		System.out.println(account);
		
		  
		
		
	}

}
