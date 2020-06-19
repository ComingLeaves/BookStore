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
@SuppressWarnings({ "unused", "serial" })
public class GetBook extends HttpServlet {


	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doPost(request, response);
	}

	
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		ArrayList<Book> list=new ArrayList<Book>();
		String page=request.getParameter("page");
		if(page==null)
		{
			page="1";
		}
		list=OpBookService.getBook(Integer.valueOf(page).intValue());
		request.setAttribute("list",list);
		request.setAttribute("page",page);
		request.getRequestDispatcher("../admin/product_list.jsp").forward(request, response);
	}

}
