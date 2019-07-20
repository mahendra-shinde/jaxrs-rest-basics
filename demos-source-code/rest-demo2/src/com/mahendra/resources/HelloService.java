package com.mahendra.resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;


//  Exact URL : http://localhost:8080/RestService2/api/hello?name=<yourname> 
@Path("/hello")
public class HelloService {

	@GET
	public String sayHello(@QueryParam("name")  String name) {
		return "Hello "+name+" welcome to earth-616";
	}
	
}
