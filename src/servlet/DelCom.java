package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import service.OpCommentService;
@SuppressWarnings({ "unused", "serial" })
public class DelCom extends HttpServlet {

	
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doPost(request, response);
	}

	
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String id=request.getParameter("cid");
		OpCommentService.Delcom(Integer.valueOf(id).intValue());
		response.sendRedirect(request.getContextPath()+"/servlet/GetComWithUid");
		
	
	}

}
