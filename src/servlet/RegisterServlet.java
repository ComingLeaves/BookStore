package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import service.LRService;
import utils.User;
@SuppressWarnings({ "unused", "serial" })
public class RegisterServlet extends HttpServlet {

	
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doPost(request, response);
	}

	
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
        String username =request.getParameter("uname");
        username = new String(username.getBytes("ISO8859-1"),"UTF-8");
        String password =request.getParameter("pw");
        String gender=request.getParameter("gender");
        gender = new String(gender.getBytes("ISO8859-1"),"UTF-8");
        String telephone=request.getParameter("phone");
        String address=request.getParameter("address");
        address = new String(address.getBytes("ISO8859-1"),"UTF-8");
        String birthday=request.getParameter("birthday");
        birthday = new String(birthday.getBytes("ISO8859-1"),"UTF-8");
		User user=new User();
		user.setUsername(username);
	    user.setPassword(password);
	    user.setGender(gender);
	    user.setTelephone(telephone);
	    user.setAddress(address);
	    user.setBirthday(birthday);
	    user.setAuthority("user");
	    
	    System.out.println(username);
	    System.out.println(password);
	    System.out.println(telephone);
	    System.out.println(gender);
	    System.out.println(address);
	    System.out.println(birthday);
	    
	    LRService lrService=new LRService();
	    if(lrService.Register(user))
	    {
	    	response.setContentType("text/html;charset=utf-8");
			PrintWriter out=response.getWriter();
			 
			out.print("<html><body><script type='text/javascript'Â language='javascript'>alert('×¢²á³É¹¦');window.location.href='"+request.getContextPath()+"/client/login.jsp';</script></body></html>");
			out.close();
	    	//response.sendRedirect(request.getContextPath()+"/client/login.jsp");
	    }
	    else {
	    	response.setContentType("text/html;charset=utf-8");
			PrintWriter out=response.getWriter();
			 
			out.print("<html><body><script type='text/javascript'Â language='javascript'>alert('×¢²áÊ§°Ü');window.location.href='"+request.getContextPath()+"/client/register.jsp';</script></body></html>");
			out.close();
	    	//response.sendRedirect("Register.jsp");
		}
	}

}
