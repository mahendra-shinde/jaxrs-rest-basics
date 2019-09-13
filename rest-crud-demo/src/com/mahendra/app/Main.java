package com.mahendra.app;


import java.io.IOException;

import com.sun.jersey.api.container.httpserver.HttpServerFactory;
import com.sun.jersey.api.core.PackagesResourceConfig;
import com.sun.jersey.api.core.ResourceConfig;
import com.sun.net.httpserver.HttpServer;

public class Main {

	public static void main(String[] args) {
		//Define package name that contains all REST Resources
		ResourceConfig rc = new PackagesResourceConfig("com.mahendra");
		try {
			//Launch an HTTP Server at port 4000
			HttpServer server = HttpServerFactory.create("http://localhost:4000/", rc);
			server.start();
		} catch (IllegalArgumentException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
