package com.mahendra;

import javax.xml.ws.Endpoint;

public class Main {

	public static void main(String[] args) {
		Calculator calc = new CalculatorImpl();
		Endpoint.publish("http://localhost:5000/calc", calc);
		System.out.println("Service published!");
	}

}
