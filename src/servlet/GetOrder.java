package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import service.OpOderService;
import utils.order;
@SuppressWarnings({ "unused", "serial" })
public class GetOrder extends HttpServlet {

	
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doPost(request, response);
	}


	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String oid =request.getParameter("oid");
		
		order order=OpOderService.GetOrder(oid);
		
		request.setAttribute("order",order);
		request.getRequestDispatcher("../admin/order_detail.jsp").forward(request, response);
		
	}

}
