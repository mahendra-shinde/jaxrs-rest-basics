package com.mahendra;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.core.Response;

/**
 * Servlet implementation class Test
 */
@WebServlet("/index.htm")
public class Test extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Test() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		ClientBuilder builder = ClientBuilder.newBuilder();
		Client client = builder.build();
		String resp= client.target("http://localhost:9080/RestDemo2/api/calc/add")
			
			.queryParam("n1","100").queryParam("n2", "20")
			.request().get(String.class);
		
		response.getWriter().append("Answer " + resp);
	}

}
