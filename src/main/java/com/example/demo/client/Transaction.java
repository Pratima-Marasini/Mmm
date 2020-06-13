package com.example.demo.client;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Transaction {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	private int acountNumber;
	private int balance;
	private String date;
	
	protected Transaction() {}
	
	public Transaction(int acountNumber, int balance, String date) {
		this.acountNumber = acountNumber;
		this.balance = balance;
		this.date = date;
	}


	@Override
	public String toString() {
		return "Transaction [id=" + id + ", acountNumber=" + acountNumber + ", balance=" + balance + ", date=" + date
				+ "]";
	}


	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public int getAcountNumber() {
		return acountNumber;
	}


	public void setAcountNumber(int acountNumber) {
		this.acountNumber = acountNumber;
	}


	public int getBalance() {
		return balance;
	}


	public void setBalance(int balance) {
		this.balance = balance;
	}


	public String getDate() {
		return date;
	}


	public void setDate(String date) {
		this.date = date;
	}
	
	
	
	
	

}

