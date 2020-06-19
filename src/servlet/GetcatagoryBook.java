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
public class GetcatagoryBook extends HttpServlet {

	
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doPost(request, response);
	}

	
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		
		String catagory=request.getParameter("catagory");
		String page=request.getParameter("page");
		if(page==null)
		{
			page="1";
		}
		catagory = new String(catagory.getBytes("ISO8859-1"),"UTF-8");
		ArrayList<Book> list=new ArrayList<Book>();
		list=OpBookService.getCatagoryBook(catagory,Integer.valueOf(page).intValue());
		if(list!=null)
		{
			request.setAttribute("list",list);
			request.setAttribute("ca",catagory);
			request.setAttribute("page",page);
			request.getRequestDispatcher("../client/book_list.jsp").forward(request, response);
		}
	}

}
