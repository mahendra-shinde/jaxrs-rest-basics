package com.mahendra.resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;

@Path("/calc")
public class CalculatorService {

	@GET
	@Path("/add")
	public String add(@QueryParam("n1") int n1, @QueryParam("n2") int n2)
	{
		return "Answer : "+ (n1+n2);
	}
	
	
}
