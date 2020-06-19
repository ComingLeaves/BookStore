package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import service.OpOderService;
import utils.order;
@SuppressWarnings({ "unused", "serial" })
public class GetOrders extends HttpServlet {

	
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doPost(request, response);
	}

	
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
      
		 ArrayList<order> orders=new ArrayList<order>();
		 
		 orders=OpOderService.GetOders();
		 request.setAttribute("orders",orders);
		request.getRequestDispatcher("../admin/order_list.jsp").forward(request, response);
	}

}
