package com.t3h.listener;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;


//@WebListener
public class SessionListener implements HttpSessionListener {

   
    public void sessionCreated(HttpSessionEvent arg0)  { 
        System.out.println("Session created: " + arg0.getSession().getId());
    }

	
    public void sessionDestroyed(HttpSessionEvent arg0)  { 
    	  System.out.println("Session Destroyed: " + arg0.getSession().getId());
    }
	
}
