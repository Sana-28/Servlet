package com.bridgelabz.servletListener;

import java.io.PrintWriter;

import javax.servlet.ServletRequest;
import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;

public class RequestListener implements ServletRequestListener {

	@Override
	public void requestInitialized(ServletRequestEvent servletRequestEvent) {
		ServletRequest request = servletRequestEvent.getServletRequest();
		System.out.println("Request Initialzed...");
		System.out.println("Processing....");
		
	}
	
	@Override
	public void requestDestroyed(ServletRequestEvent servletRequestEvent) {
		ServletRequest request = servletRequestEvent.getServletRequest();
		System.out.println("Request Destroyed...");
	}
}
