package com.mahendra.app;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

import com.mahendra.resources.CalculatorService;

import io.swagger.jaxrs.config.BeanConfig;

@ApplicationPath("/api")
public class AppConfig extends Application {
	
	public AppConfig() {
		  	BeanConfig beanConfig = new BeanConfig();
	        beanConfig.setVersion("1.0.2");
	        beanConfig.setSchemes(new String[]{"http"});
	        beanConfig.setHost("localhost:9080");
	        beanConfig.setBasePath("/RestDemo3/api");
	        beanConfig.setResourcePackage("com.mahendra.resources");	        
	        beanConfig.setScan(true);
	}
	
	@Override
	public Set<Class<?>> getClasses() {
		HashSet<Class<?>> classes = new HashSet<>();
		classes.add(io.swagger.jaxrs.listing.ApiListingResource.class);
		classes.add(io.swagger.jaxrs.listing.SwaggerSerializers.class);
		classes.add(CalculatorService.class);
		System.out.println("Config loaded");
		return classes;
	}
	
}
