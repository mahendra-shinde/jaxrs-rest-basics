package com.mahendra;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("calc")
public class Calculator {

	@GET
	public String hello() {
		return "Hello World";
	}
}
