

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author AM
 */
//A Simple Servlet

import java.io.*;
import javax.servlet.*;
public class HelloServlet extends GenericServlet {
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		pw.println("<B>Hello!");
		pw.close();
	}
}

