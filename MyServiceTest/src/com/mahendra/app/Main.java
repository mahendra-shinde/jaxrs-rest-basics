package com.mahendra.app;

import javax.xml.namespace.QName;

import org.apache.axis.client.Call;
import org.apache.axis.client.Service;

public class Main {

	public static void main(String[] args) {
		try {
			String endpoint = "http://www.dneonline.com/calculator.asmx";

			Service service = new Service();
			Call call = (Call) service.createCall();

			call.setTargetEndpointAddress(new java.net.URL(endpoint));
			//Provide the method name and it's namespace (defualt namespace is REVERSE package name)
			call.setOperationName(new QName("http://tempuri.org", "add"));

			String ret = (String) call.invoke(new Object[] {10,25});

			System.out.println("Sent 'Hello!', got '" + ret + "'");
		} catch (Exception e) {
			System.err.println(e.toString());
		}
	}

}
