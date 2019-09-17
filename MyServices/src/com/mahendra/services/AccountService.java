package com.mahendra.services;

import com.mahendra.models.Account;


public interface AccountService {

	public Account[] getAccounts();
	
	public void save(Account acc);
	
}
