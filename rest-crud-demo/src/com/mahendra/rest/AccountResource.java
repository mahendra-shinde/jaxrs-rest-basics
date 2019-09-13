package com.mahendra.rest;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;

import com.mahendra.models.Account;
import com.mahendra.services.AccountService;

@Path("account")
public class AccountResource {
	private AccountService service = AccountService.getInstance();
	
	
	@GET @Produces("application/json") 
	public Account findById(@QueryParam("id") int accId) {
		return service.find(accId);
	}
	
	@POST @Consumes("application/json")
	public Response save(Account acc){
		service.save(acc);
		return Response.ok("Created new account").build();
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
