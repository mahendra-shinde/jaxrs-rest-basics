package com.mahendra.rest;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;

import com.mahendra.models.Account;
import com.mahendra.services.AccountService;

import sun.security.provider.certpath.OCSPResponse.ResponseStatus;

@Path("account2")

/**
 * Externalized Exception  handling to another provider class instead of handling exceptions inside service methods
 * @author mahendra
 *
 */
public class AccountResource2 {
	private AccountService service = AccountService.getInstance();
	
	
	@GET @Produces("application/json") 
	public Account findById(@QueryParam("id") int accId) {
		Account acc =  service.find(accId);
		return acc;
	}
	
	@POST @Consumes("application/json")
	public Response save(Account acc){
		service.save(acc);
		return Response.ok(service.find(acc.getAccNo())).build();
		
	}
	
	@PUT @Consumes("application/json")
	public Response update(Account acc){
		service.update(acc);
		return Response.ok("Created new account").build();
	}
	
	@DELETE @Path("{id}")
	public String delete(@PathParam("id")int id) {
		service.delete(id);
		return "Record deleted!";
	}
	//Add one more method to list ALL accounts, use Path annotation with value "all"
}
