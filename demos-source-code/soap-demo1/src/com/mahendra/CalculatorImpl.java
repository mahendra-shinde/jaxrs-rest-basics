package com.mahendra;

import javax.jws.WebService;

@WebService(name="calc",endpointInterface="com.mahendra.Calculator")
public class CalculatorImpl implements Calculator {

	@Override
	public double add(int n1, int n2) {
		// TODO Auto-generated method stub
		return n1+n2;
	}

	@Override
	public double sub(int n1, int n2) {
		// TODO Auto-generated method stub
		return n1-n2;
	}
	
}
