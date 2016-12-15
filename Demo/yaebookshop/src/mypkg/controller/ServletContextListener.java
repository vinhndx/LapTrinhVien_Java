package mypkg.controller;


import javax.servlet.ServletContextEvent;
import javax.servlet.annotation.WebListener;

@WebListener
public class ServletContextListener implements javax.servlet.ServletContextListener {

    public void contextDestroyed(ServletContextEvent arg0)  { 
    	//System.out.println("DAng stop server");
    }

    public void contextInitialized(ServletContextEvent arg0)  { 
         //System.out.println("DAng start server");
    	try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
    }
	
}
