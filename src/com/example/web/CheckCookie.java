package com.example.web;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class CheckCookie extends HttpServlet {
	public void doGet(HttpServletRequest request,
						HttpServletResponse response)
						throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		
		Cookie[] cookies = request.getCookies();
		
		if (cookies != null) {
			for (Cookie cookie : cookies) {
				if (cookie.getName().equals("username")) {
					out.println("Hi " + cookie.getValue());
					break;
				}
			}
		}
	}
}

