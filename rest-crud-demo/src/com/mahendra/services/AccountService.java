package com.mahendra.services;

import java.util.*;

import com.mahendra.app.AppException;
import com.mahendra.models.Account;

public class AccountService {

	private Map<Integer, Account> accounts = new HashMap<>();
	
	//Singleton Object
	private static AccountService service = new AccountService();
	
	public static AccountService getInstance() {
		return service;
	}
	
	private AccountService() {
		super();
		accounts.put(101,new Account(101, "Vallya", 120000));
		accounts.put(102, new Account(102,"Bodi",230000));
	}

	public void save(Account acc) {
		
		if(find(acc.getAccNo())!=null) {
			throw new AppException("Record already exists!");
		}
		System.out.println("Adding new account "+acc.getAccNo());
		accounts.put(acc.getAccNo(),acc);
	}
	
	public void update(Account acc) {
		Account old = find(acc.getAccNo());
		if(old==null) {
			throw new AppException("Account "+acc.getAccNo()+" does not exists!");
		}
		old.setBalance(acc.getBalance());
		old.setCustomerName(acc.getCustomerName());
	}

	public Account find(int accNo) {
		Account acc = accounts.get(accNo);
		if(acc==null)
			throw new AppException("Account "+accNo+ "Does not exists!");
		return acc;
	}
	
	public List<Account> getAll(){
		Collection<Account> values = accounts.values();
		List<Account> temp = new ArrayList<>();
		temp.addAll(values);
		return temp;
	}
	
	public boolean delete(int accNo) {
		if(find(accNo)!=null) {
		accounts.remove(accNo);
		return true;
		}
		throw new AppException("Account "+accNo+ "Does not exists!");		
	}
	
}
