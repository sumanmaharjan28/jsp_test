package org.apache.jsp.admin.dashboard;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_005fwo_005finc_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write('\n');

    if (session.getAttribute("user") == null) 
    {
        response.sendRedirect("../index.jsp");
    }

      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\n");
      out.write("<head>\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\n");
      out.write("<title>Dashboard W/O Includes</title>\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"../css/admin_style.css\"/>\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("    <div id=\"container\">\n");
      out.write("        <div id=\"header\">\n");
      out.write("            <div class=\"logo\"> \n");
      out.write("            </div>\n");
      out.write("            <div class=\"company-name\">\n");
      out.write("                <h2>Company Name</h2>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"user-login-info\">\n");
      out.write("                Welcome, \n");
      out.write("                ");
 
                   // out.println("User"); 
                    out.println(session.getAttribute("user"));

                
      out.write(" | <a href=\"../logout.jsp\">Logout</a>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        ");
 
            String BASE_URL = "http://localhost:8080/jsp_test/admin";

        
      out.write("\n");
      out.write("        <div id=\"left\">\n");
      out.write("            <div class=\"menu\"><a href=\"");
      out.print(BASE_URL);
      out.write("/dashboard/index.jsp\"> Dashboard </a> </div>\n");
      out.write("            <h1>User</h1>\n");
      out.write("            <div class=\"menu\"><a href=\"");
      out.print(BASE_URL);
      out.write("/user/add.jsp\"> Add User </a> </div>\n");
      out.write("            <div class=\"menu\"><a href=\"");
      out.print(BASE_URL);
      out.write("/user/index.jsp\"> List User </a></div>    \n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <div id=\"main\">\n");
      out.write("                <h3> Dashboard </h3>\n");
      out.write("            <p> Dashboard content here ..... </p>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <div class=\"clear_float\"></div>\n");
      out.write("        <div id=\"footer\">\n");
      out.write("                Footer Section\n");
      out.write("        </div>\n");
      out.write("    \n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
