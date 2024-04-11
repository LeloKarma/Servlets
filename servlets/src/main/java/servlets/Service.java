package servlets;

import java.io.IOException;

import jakarta.servlet.Servlet;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;

/**
 * Servlet implementation class Service
 */
public class Service implements Servlet {
	
	public void init(ServletConfig config) throws ServletException {
		System.out.println("init");
	}
	
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		System.out.println("service");
	}
	
	public void destroy() {
		System.out.println("destroy");
	}
	public String getServletInfo() {
		return null;
	}
	public ServletConfig getServletConfig() {
		return null;
	}
}