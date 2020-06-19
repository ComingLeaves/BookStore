package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import service.OpUserinfoService;
import utils.User;
@SuppressWarnings({ "unused", "serial" })
public class UpdataServlet extends HttpServlet {

	
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doPost(request, response);
	}

	
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		    String username =null;
	        String password =null;
	        String gender=null;
	        String telephone=null;
	        String address=null;
	        String birthday=null;
	        String uid=null;
			User user=new User();
			user.setUid(Integer.valueOf(uid).intValue());
			user.setUsername(username);
		    user.setPassword(password);
		    user.setGender(gender);
		    user.setTelephone(telephone);
		    user.setAddress(address);
		    user.setBirthday(birthday);
		    user.setAuthority("user");
		    OpUserinfoService oService=new OpUserinfoService();
		    if(oService.upDatainfo(user))
		    {
		    	response.sendRedirect("");
		    }
	}

}
