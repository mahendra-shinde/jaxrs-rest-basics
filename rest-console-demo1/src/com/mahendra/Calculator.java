package com.mahendra;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("hello")
public class Calculator {

	@GET
	public String hello() {
		return "Hello World";
	}
}
