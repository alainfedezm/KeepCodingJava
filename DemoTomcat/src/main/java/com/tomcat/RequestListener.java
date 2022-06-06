package com.tomcat;

import jakarta.servlet.ServletRequestEvent;
import jakarta.servlet.ServletRequestListener;
import jakarta.servlet.annotation.WebListener;


@WebListener
public class RequestListener implements ServletRequestListener {
	
	
	@Override
	public void requestInitialized(ServletRequestEvent sre) {
		// TODO Auto-generated method stub
		System.out.println("Request iniciada por " + sre.getServletRequest().getServerName());
		//ServletRequestListener.super.requestInitialized(sre);
		
	}
	
	@Override
	public void requestDestroyed(ServletRequestEvent sre) {
		// TODO Auto-generated method stub
		System.out.println(sre.getServletRequest().getServerName());
		//ServletRequestListener.super.requestDestroyed(sre);
		
	}

}
