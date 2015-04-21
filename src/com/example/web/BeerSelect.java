package com.example.web;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.util.*;

import com.example.model.BeerExpert;

public class BeerSelect extends HttpServlet {

	public void init() throws ServletException {
		log("Inside init: " + Thread.currentThread());
	}

	public void doPost(HttpServletRequest request,
						HttpServletResponse response)
						throws IOException, ServletException {

		String color = request.getParameter("color");
		
		//BeerExpert be = new BeerExpert();
		//List<String> result = be.getBrands(color);
		//result.add("0x" + Integer.toHexString(System.identityHashCode(this)));
		//result.add(Thread.currentThread().toString());
		//result.add(String.valueOf(request.getLocalPort()));
		//result.add(request.getContextPath());
		//result.add(request.getQueryString());
		//result.add(String.valueOf(response.getBufferSize()));
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		//out.println("Beer Selection Advice<br>");
		//out.println("<br>Got beer color " + color);
		/*
		for (String brand : result)
			out.println("<br>try " + brand);*/
		/*
		request.setAttribute("styles", result);
		RequestDispatcher view = request.getRequestDispatcher("result.jsp");
		view.forward(request, response);*/
		String limit = getServletConfig().getInitParameter("limit");
		int lim = Integer.valueOf(limit);
		for (int i = 0; i < lim; ++i) {
			out.print('c');
		}
		log("Done writing output");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			log("Exception while waiting", e);
		}

		//out.flush();
		//response.sendRedirect("/Beer-v1/tongueOut.html");
	}

	public void doGet(HttpServletRequest request,
						HttpServletResponse response)
						throws IOException, ServletException {
		log("Resonse buffer size: " + response.getBufferSize());
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String limit = request.getParameter("limit");
		int lim = Integer.valueOf(limit);
		for (int i = 0; i < lim; ++i) {
			out.print('c');
		}
		log("Done writing output");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			log("Exception while waiting", e);
		}


	}
}

