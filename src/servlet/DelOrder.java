package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import service.OpOderService;
@SuppressWarnings({ "unused", "serial" })
public class DelOrder extends HttpServlet {

	
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doPost(request, response);
	}

	
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String oid =request.getParameter("oid");
		if(OpOderService.DelOrder(oid));
		{
			
			response.sendRedirect("../servlet/GetOrders");
		}
	}

}
