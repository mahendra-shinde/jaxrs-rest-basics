package com.mahendra.models;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Account implements Serializable{

	private Integer accountNo;
	private String holder;
	private Double balance;
	public Account(int accountNo, String holder, double balance) {
		super();
		this.accountNo = accountNo;
		this.holder = holder;
		this.balance = balance;
	}
	public Account() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(int accountNo) {
		this.accountNo = accountNo;
	}
	public String getHolder() {
		return holder;
	}
	public void setHolder(String holder) {
		this.holder = holder;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	
	
}
