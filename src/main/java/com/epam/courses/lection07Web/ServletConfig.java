package com.epam.courses.lection07Web;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class ServletConfig implements ServletContextListener 
{
    
    @Override
    public void contextInitialized(ServletContextEvent servletContextEvent) {
        ServletContext context = servletContextEvent.getServletContext();
        context.setInitParameter("timeZone", "London");
    }

    @Override
    public void contextDestroyed(ServletContextEvent servletContextEvent) {

    }
}
