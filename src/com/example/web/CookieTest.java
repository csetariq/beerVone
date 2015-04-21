package com.example.web;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class CookieTest extends HttpServlet {
	public void doPost(HttpServletRequest request,
						HttpServletResponse response)
						throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");

		String username = request.getParameter("username");
		Cookie cookie = new Cookie("username", username);
		cookie.setMaxAge(1 * 60);
		response.addCookie(cookie);

		RequestDispatcher view = request.getRequestDispatcher("cookieresult.jsp");
		view.forward(request, response);
	}
}

