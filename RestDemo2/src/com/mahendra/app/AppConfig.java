package com.mahendra.app;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

import com.mahendra.resources.CalculatorService;

@ApplicationPath("/api")
public class AppConfig extends Application {
	
	@Override
	public Set<Class<?>> getClasses() {
		HashSet<Class<?>> classes = new HashSet<>();
		classes.add(CalculatorService.class);
		System.out.println("Config loaded");
		return classes;
	}
	
}
