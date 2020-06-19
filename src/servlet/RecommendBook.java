package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import service.OpBookService;
import utils.Book;
@SuppressWarnings({  "serial", "unused" })
public class RecommendBook extends HttpServlet {

	
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doPost(request, response);
	}

	
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		ArrayList<Book> list=OpBookService.GetRecomBook();
		
		request.setAttribute("rlist",list);
		
		request.getRequestDispatcher("../client/index.jsp").forward(request, response);
	}

}
