package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import service.OpCommentService;
import utils.Comment;
@SuppressWarnings({ "unused", "serial" })
public class GetComWithUid extends HttpServlet {

	
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doPost(request, response);
	}

	
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		int uid= (Integer) request.getSession(false).getAttribute("uid");
		System.out.println(uid);
		
		ArrayList<Comment> list=new ArrayList<Comment>();
		 list=OpCommentService.GetComWithuid(uid);
		 
		request.setAttribute("comList",list);
	    request.getRequestDispatcher("../MyJsp.jsp").forward(request, response);
		
	}

}
