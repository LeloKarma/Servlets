package servlets;

import java.io.IOException;
import java.util.Enumeration;

import jakarta.servlet.Servlet;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;

/**
 * Servlet implementation class RequestServlet
 */
public class RequestServlet implements Servlet {
	
	public void init(ServletConfig config) throws ServletException {
		
	}
	public void destroy() {
		
	}
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		System.out.println("Server Port: " + request.getServerPort());
		System.out.println("Server Name: " + request.getServerName());
		System.out.println("Protocol: " + request.getProtocol());
		System.out.println("Character Enconding: " + request.getCharacterEncoding());
		System.out.println("Content Type: " + request.getContentType());
		System.out.println("Content Length: " + request.getContentLength());
		System.out.println("Remote Address: " + request.getRemoteAddr());
		System.out.println("Remote Host: " + request.getRemoteHost());
		System.out.println("Scheme: " + request.getScheme());
		
		Enumeration parameters = request.getParameterNames();
		while (parameters.hasMoreElements()) {
        String parameterName = (String) parameters.nextElement();
		System.out.println("Pameter Name: " + parameterName);
		System.out.println("Parameter Value: " + request.getParameter(parameterName));
	}
	
		Enumeration attributes = request.getAttributeNames();
		while (attributes.hasMoreElements()) {
        String attribute = (String) attributes.nextElement();
		System.out.println("Attribute Name: " + attribute);
		System.out.println("Attribute Value: " + request.getAttribute(attribute));

	
}
	}
	public String getServletInfo() {
		return null;
	}
	public ServletConfig getServletConfig() {
		return null;

	}
}
