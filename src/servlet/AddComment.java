package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import service.OpCommentService;
import utils.Comment;
@SuppressWarnings({ "unused", "serial" })
public class AddComment extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doPost(request, response);
	}

	
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		Comment comment=new Comment();
		comment.setUid(0);
		comment.setBid(0);
		comment.setUsername("");
		comment.setBookname("");
		comment.setComment("");
		comment.setTime("");
		
		if(OpCommentService.AddCom(comment))
		{
			response.sendRedirect("");
		}
	}

}
