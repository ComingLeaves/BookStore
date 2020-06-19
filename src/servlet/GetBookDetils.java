package servlet;

import java.awt.Window;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import service.OpBookService;
import utils.Book;
@SuppressWarnings({ "unused", "serial" })
public class GetBookDetils extends HttpServlet {

	
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doPost(request, response);
	}

	
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String bid=request.getParameter("bookid");
		String editString=request.getParameter("edit");
		if(editString==null)
		{
			editString="0";
		}
		Book book=new Book();
		OpBookService opBookService=new OpBookService();
		
		book=opBookService.GetBookDetils(Integer.valueOf(bid).intValue());
		if(book!=null&&editString.equals("1"))
		{
			request.setAttribute("book",book);
			request.getRequestDispatcher("../admin/edit_product.jsp").forward(request,response);
		}
		else {
			request.setAttribute("book",book);
			request.getRequestDispatcher("../client/book_info.jsp").forward(request,response);
		}
	}

}
