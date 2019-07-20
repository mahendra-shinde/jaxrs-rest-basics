package com.mahendra.app;

import javax.ws.rs.ApplicationPath;

import com.sun.jersey.api.core.PackagesResourceConfig;

// 	Resulting URL: 
//     http://localhost:8080/RestService2/api/
@ApplicationPath("/api")
public class MyApplication extends PackagesResourceConfig{
	public MyApplication() {
		// Package which contains all REST resources (Class with @Path annotations)
		super("com.mahendra.resources");
	}
}
