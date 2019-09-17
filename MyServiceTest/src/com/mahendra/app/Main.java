package com.mahendra.app;

import javax.xml.namespace.QName;

import org.apache.axis.client.Call;
import org.apache.axis.client.Service;

public class Main {

	public static void main(String[] args) {
		try {
			String endpoint = "http://localhost:9080/MyServices/services/HelloService";

			Service service = new Service();
			Call call = (Call) service.createCall();

			call.setTargetEndpointAddress(new java.net.URL(endpoint));
			//Provide the method name and it's namespace (defualt namespace is REVERSE package name)
			call.setOperationName(new QName("http://services.mahendra.com", "sayHello"));

			String ret = (String) call.invoke(new Object[] {});

			System.out.println("Sent 'Hello!', got '" + ret + "'");
		} catch (Exception e) {
			System.err.println(e.toString());
		}
	}

}
