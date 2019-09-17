package com.mahendra.daos;

import java.util.LinkedList;
import java.util.List;

import com.mahendra.models.Account;

public class AccountDAO {
	
	private static AccountDAO dao = new AccountDAO();
	
	List<Account> acc = new LinkedList<Account>();

	public static AccountDAO getInstance() {
		return dao;
	}
	
	private AccountDAO() {
		System.out.println("Populating the accounts");
		acc.add(new Account(101,"Xyz",25000));
		acc.add(new Account(102,"ayz",20000));
		acc.add(new Account(103,"yTz",25000));
	}
	
	public Account[] getAccounts() {
		return  acc.toArray(new Account[acc.size()]);
	}
	
	public void save(Account a) {
		acc.add(a);		
	}
}
