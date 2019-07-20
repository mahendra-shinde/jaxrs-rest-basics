package com.mahendra;

import javax.jws.WebService;

@WebService
public interface Calculator {

	public double add(int n1, int n2);
	public double sub(int n1, int n2);
}
