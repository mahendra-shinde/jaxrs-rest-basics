package com.mahendra.resources;

import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;

import com.mahendra.dao.ProductDAO;
import com.mahendra.entities.Product;

@Path("products")
public class ProductService {

	private ProductDAO dao = new ProductDAO();
	//    http://localhost:8080/ProductCatalog/api/products
	@GET @Produces({"application/json","application/xml"})
	public Product[] findAll() {
		return dao.getAll();
	}
	
	//   http://localhost:8080/ProductCatalog/api/products/by?id=101
	@GET  @Path("by") @Produces({"application/json","application/xml"})
	public Product find(@QueryParam("id") int id) {
		return dao.findById(id);
	}
}
