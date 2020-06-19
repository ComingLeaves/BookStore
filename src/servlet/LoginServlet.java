package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.jms.Session;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import service.LRService;
@SuppressWarnings({ "unused", "serial" })
public class LoginServlet extends HttpServlet {

	
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doPost(request, response);
	}

	
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	  String username =request.getParameter("uname");
	  String password =request.getParameter("pw");
	  LRService lrService=new LRService();
	  HttpSession session=request.getSession();
	  int id;
	  if((id=lrService.Login(username, password))!=-1)
	  {
		
		  session.setAttribute("uid",id);
		  session.setAttribute("username", username);
		  if(username.equals("admin"))
		  {
			  response.sendRedirect(request.getContextPath()+"/admin/index.jsp");
		  }else{
		  response.sendRedirect(request.getContextPath()+"/servlet/RecommendBook");      //鐧诲綍鎴愬姛璺宠浆鍒颁富椤�
		  }
	  }
	  else {
		  response.setContentType("text/html;charset=utf-8");
			PrintWriter out=response.getWriter();
			 
			out.print("<html><body><script type='text/javascript'聽language='javascript'>alert('鐢ㄦ埛鍚嶃�瀵嗙爜杈撳叆閿欒');window.location.href='"+request.getContextPath()+"/client/login.jsp';</script></body></html>");
			out.close();
		   // response.sendRedirect(request.getContextPath()+"/client/login.jsp");      //鐢ㄦ埛鍚嶅瘑鐮侀敊璇噸鏂拌緭鍏�
	  }
	}

}
