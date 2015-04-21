package com.example.web;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class CodeStream extends HttpServlet {
	public void doGet(HttpServletRequest request,
						HttpServletResponse response)
						throws ServletException, IOException {

		ServletContext context = getServletContext();
		InputStream in = context.getResourceAsStream("/setup.exe");

		response.setContentType("application/octet-stream");
		response.addHeader("Accept-Ranges", "bytes");
		response.addHeader("Accept-Ranges", "kilobytes");

		OutputStream out = response.getOutputStream();

		byte[] block = new byte[2048];
		int readCount = 0;

		log("Begin download - " + Thread.currentThread());
		while ((readCount = in.read(block)) != -1) {
			out.write(block, 0, readCount);
		}
		log("End download - " + Thread.currentThread());

		out.flush();
		out.close();
		in.close();
	}
}

