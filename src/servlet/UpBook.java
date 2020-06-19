package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import service.OpBookService;
import utils.Book;
@SuppressWarnings({  "serial" })
public class UpBook extends HttpServlet {

	
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doPost(request, response);
	}

	
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
         
		Book book=new Book();
		String bid=request.getParameter("bid");
		String bookname=request.getParameter("bookname");
		bookname = new String(bookname.getBytes("ISO8859-1"),"UTF-8");
		String price=request.getParameter("price");
		String Bookimg=request.getParameter("bookimg");
		String catagory=request.getParameter("catagory");
		catagory = new String(catagory.getBytes("ISO8859-1"),"UTF-8");
		String pnum=request.getParameter("pnum");
		String desString=request.getParameter("description");
		desString = new String(desString.getBytes("ISO8859-1"),"UTF-8");
		String pubd=request.getParameter("pubdate");
		String authorString=request.getParameter("author");
		authorString = new String(authorString.getBytes("ISO8859-1"),"UTF-8");
	    book.setBoobid(Integer.valueOf(bid).intValue());
		book.setBookname(bookname);
		book.setPrice(price);
		book.setCategory(catagory);
		book.setBookpic(Bookimg);
		book.setPnum(Integer.valueOf(pnum).intValue());
		book.setDescription(desString);
		book.setPubdate(pubd);
		book.setAuthor(authorString);
		
		System.out.println(bid);
		System.out.println(book.getBookname());
		System.out.println(book.getPrice());
		System.out.println(book.getCategory());
		System.out.println(book.getBookpic());
		System.out.println(book.getPnum());
		System.out.println(book.getDescription());
		System.out.println(book.getPubdate());
		System.out.println(book.getAuthor());
		
		if(OpBookService.upBook(book))
		{

            response.setContentType("text/html;charset=utf-8");
			PrintWriter out=response.getWriter();
			 
			out.print("<html><body><script type='text/javascript' language='javascript'>alert('更新成功');window.location.href='../servlet/GetBookDetils?bookid="+book.getBoobid()+"&edit=1';</script></body></html>");
			out.close();
		}
		
	}

}
