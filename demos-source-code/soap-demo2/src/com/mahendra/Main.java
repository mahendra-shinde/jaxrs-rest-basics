package com.mahendra;

import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;

public class Main {

	public static void main(String[] args) {
		try {
			Service service = Service.create(new URL("http://localhost:5000/calc"),
					new QName("http://mahendra.com/", "CalculatorImplService"));
			Calculator calc = service.getPort(Calculator.class);
			double ans = calc.add(100, 12);
			System.out.println("Answer is " + ans);
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
