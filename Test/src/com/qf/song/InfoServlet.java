package com.qf.song;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/InfoServlet")//localhost:8080/Test/InfoServlet
public class InfoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
    public InfoServlet() {
        super();
    }

	@Override
	protected void service(HttpServletRequest arg0, HttpServletResponse arg1) throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.service(arg0, arg1);
		System.out.println("有人链接");
		System.out.println(arg0.getContextPath());
	}
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");//浏览器gbk(html设置为utf-8)--->服务器iso-8859-1--->控制台utf-8--->乱码，改码后正常
//		response.setCharacterEncoding("utf-8");//如此设置编码，需要在完整的页面显示才能修改成功(浏览器gbk，因此乱码，完整html设置了meta的编码属性为utf-8)
		response.setContentType("text/html;charset=utf-8");
		String username = request.getParameter("username");
		String age = request.getParameter("age");
		response.getWriter().append(username+"========"+age);
		System.out.println(username+"========"+age+"\n"+request.getRemoteAddr()+"\n"+request.getRemoteHost());
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
