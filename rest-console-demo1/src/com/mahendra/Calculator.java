package com.mahendra;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;

import com.mahendra.models.Message;


@Path("hello")
public class Calculator {


	/*@GET @Produces("text/plain"})
	public String hello() {
		return "Hello World";
	}*/
/*
	@GET @Produces({"application/json","application/xml"})
	public Message hello() {
		Message msg = new Message();
		msg.setSender("Mahendra");
		msg.setMessage("Hello World");
		return msg;
	}*/
	
	@GET @Produces({"application/json","application/xml"})
	public Response hello() {
		Message msg = new Message();
		msg.setSender("Mahendra");
		msg.setMessage("Hello World");
		
		return Response.ok(msg).header("Author","Mahendra").header("Content-Disposition","attachment; filename=data.xml") .build();
	
	}
	
}
