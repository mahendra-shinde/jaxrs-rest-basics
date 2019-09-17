package com.mahendra.app;

import java.rmi.RemoteException;

import javax.xml.rpc.ServiceException;

import com.mahendra.services.HelloService;
import com.mahendra.services.HelloServiceService;
import com.mahendra.services.HelloServiceServiceLocator;

public class Main2 {

	public static void main(String[] args) {
		HelloServiceService service = new HelloServiceServiceLocator();
		try {
			HelloService hello = service.getHelloService();
			String msg = hello.sayHello();
			System.out.println("Message recd: "+msg);
		} catch (ServiceException | RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
