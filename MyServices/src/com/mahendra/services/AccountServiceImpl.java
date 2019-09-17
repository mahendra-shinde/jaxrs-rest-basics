package com.mahendra.services;

import javax.jws.WebMethod;
import javax.jws.WebService;

import com.mahendra.daos.AccountDAO;
import com.mahendra.models.Account;

@WebService(endpointInterface="com.mahendra.services.AccountService")
public class AccountServiceImpl implements AccountService {
	private AccountDAO dao = AccountDAO.getInstance();

	public AccountServiceImpl() {
		
	}
	
	@WebMethod
	@Override
	public Account[] getAccounts() {
		System.out.println("Getting all accounts!");
		return dao.getAccounts();
	}

	@WebMethod
	@Override
	public void save(Account ac) {
		
		System.out.println("Adding new account!");
		dao.save(ac);
		
	}

}
