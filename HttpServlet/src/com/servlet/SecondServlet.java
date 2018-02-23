package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SecondServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String name=req.getParameter("user_name");
		String pass=req.getParameter("password");
		//System.out.println("Servlet In" +name);
		
		resp.setContentType("text/html");
		PrintWriter out=resp.getWriter();
		out.print("<html><body>");
		out.print("<b>Hii! Http servlet</b>"+" "+name);
		out.print("</body></html>");
	}

}
