package com.example.listener;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class MyHttpSessionListener implements HttpSessionListener {
	public void sessionCreated(HttpSessionEvent event) {
		System.out.println("Session created " + event.getSession().getId());
	}
	
	public void sessionDestroyed(HttpSessionEvent event) {
		System.out.println("Session destroyed " + event.getSession().getId());
	}

}

