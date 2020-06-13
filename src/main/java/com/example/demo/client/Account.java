package com.example.demo.client;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;


@Entity
public class Account {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	private int accountNumber;
	private String name;
	private int balance;
	
	
	@OneToMany
	private List<Transaction> transaction;
	
	protected Account() {}
	
	

	public Account(int accountNumber, String name, int balance, List<Transaction> transaction) {
		this.accountNumber = accountNumber;
		this.name = name;
		this.balance = balance;
		this.transaction = transaction;
	}



	

	public List<Transaction> getTransaction() {
		return transaction;
	}



	public void setTransaction(List<Transaction> transaction) {
		this.transaction = transaction;
	}



	@Override
	public String toString() {
		return "Account [id=" + id + ", accountNumber=" + accountNumber + ", name=" + name + ", balance=" + balance
				+ ", transaction=" + transaction + "]";
	}



	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	
	
	
	

}
