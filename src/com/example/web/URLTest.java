package com.example.web;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class URLTest extends HttpServlet {
	public void doGet(HttpServletRequest request,
						HttpServletResponse response)
						throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		HttpSession session = request.getSession();
		log("is session new? " + session.isNew());

		Cookie[] cookies = request.getCookies();
		if (cookies != null) {
			for (Cookie cookie : cookies) {
				log("name: " + cookie.getName());
				log("value: " + cookie.getValue());
				log("domain: " + cookie.getDomain());
				log("path: " + cookie.getPath());
				log("maxAge: " + cookie.getMaxAge());
			}
		}
		out.println(response.encodeURL("SelectBeer.do"));
		out.flush();
		out.close();
	}
}
