package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import service.OpUserinfoService;
@SuppressWarnings("serial")
public class ModifyPass extends HttpServlet {

	
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doPost(request, response);
	}

	
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String uid=request.getParameter("uid");
		String pw=request.getParameter("pw");
		OpUserinfoService oService=new OpUserinfoService();
		if(oService.ModifyPass(uid,pw))
		{
			response.setContentType("text/html;charset=utf-8");
			PrintWriter out=response.getWriter();
			 
			out.print("<html><body><script type='text/javascript' language='javascript'>alert('修改成功');window.location.href='../admin/revise_password.jsp';</script></body></html>");
			out.close();
		
		}
	}

}
