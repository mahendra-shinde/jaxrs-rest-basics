package com.mahendra.models;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Account implements Serializable{
	private int accNo;
	private String customerName;
	private double balance;
	
	
	
	
	public Account() {
		super();
	}
	
	
	
	public Account(int accNo, String customerName, double balance) {
		super();
		this.accNo = accNo;
		this.customerName = customerName;
		this.balance = balance;
	}



	public int getAccNo() {
		return accNo;
	}
	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
}
