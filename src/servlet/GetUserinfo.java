package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import service.OpUserinfoService;
import utils.User;
@SuppressWarnings({ "unused", "serial" })
public class GetUserinfo extends HttpServlet {

	
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doPost(request, response);
	}

	
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
         HttpSession session=request.getSession();
         String uid=(String) session.getAttribute("uid");
		 if(!uid.isEmpty())
		 {
			 User user=new User();
			 user=OpUserinfoService.getinfo(Integer.valueOf(uid).intValue());
			 request.setAttribute("Userinfo",user);
			 request.getRequestDispatcher("Userinfo.jsp").forward(request, response);
		 }
		 else {
			response.sendRedirect("Login.jsp");
		}
	}

}
