package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import service.OpUserinfoService;
import utils.User;
@SuppressWarnings({ "unused", "serial" })
public class GetUser extends HttpServlet {

	
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doPost(request, response);
	}

	
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		ArrayList<User> users=new ArrayList<User>();
		
		users=OpUserinfoService.getUsers();
		request.setAttribute("users",users);
		request.getRequestDispatcher("../admin/user_list.jsp").forward(request, response);
		
	}

}
