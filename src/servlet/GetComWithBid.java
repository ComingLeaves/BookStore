package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import service.OpCommentService;
import utils.Comment;
@SuppressWarnings({ "unused", "serial" })
public class GetComWithBid extends HttpServlet {

	
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doPost(request, response);
	}

	
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String bid=null;
		ArrayList<Comment> list=new ArrayList<Comment>();
		 list=OpCommentService.GetComWithbid(Integer.valueOf(bid).intValue());
		 
		 request.setAttribute("comList",list);
		 request.getRequestDispatcher("").forward(request, response);
	}

}
