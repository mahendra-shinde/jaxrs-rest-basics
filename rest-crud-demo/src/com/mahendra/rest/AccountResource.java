package com.mahendra.rest;

import javax.ws.rs.*;

import com.mahendra.models.Account;
import com.mahendra.services.AccountService;

@Path("account")
public class AccountResource {
	private AccountService service = new AccountService();
	
	
	@GET @Produces("application/json") 
	public Account findById(@QueryParam("id") int accId) {
		return service.find(accId);
	}
	
	
}
