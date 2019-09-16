package com.mahendra.app;

import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;


/**
 * Single JaxRS Application can have ZERO or MORE Providers
 * @author mahendra
 *
 */

@Provider
public class ExceptionHandler implements  ExceptionMapper<AppException>{

	@Override
	public Response toResponse(AppException arg0) {
		System.out.println("Exception occured: "+arg0.getMessage());
		return Response.status(Response.Status.NOT_FOUND).type("text/plain").entity(arg0.getMessage()).build();
	}
	
		

	
}
