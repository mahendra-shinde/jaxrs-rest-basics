package com.mahendra.services;

import javax.jws.WebMethod;
import javax.jws.WebService;

//Annotate the service implementation and interface as "WebService"
//OPTIONALLY, can provide namespace name and service interface
@WebService
public class HelloService {

	@WebMethod //Optionally, can define the operation name, default operation name is same as method name
	public String sayHello() {
		return "Hello world";
	}
}
