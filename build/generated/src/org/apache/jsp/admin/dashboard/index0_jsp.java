package org.apache.jsp.admin.dashboard;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index0_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");

            if (session.getAttribute("user") != null) {
        
      out.write("        \n");
      out.write("        Welcome ");
      out.print(session.getAttribute("user"));
      out.write("\n");
      out.write("        <a href='../logout.jsp'>Log out</a>   \n");
      out.write("        ");
  }
            else
            {
                response.sendRedirect("../index.jsp");
            }
        
        
        
      out.write("\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
        
            String BASE_URL = "http://localhost:8080/jsp_test/admin";
     

      out.write("\t\t\n");
      out.write("<div id=\"left\">\n");
      out.write("    <h1>Dashboard</h1>\n");
      out.write("        <div class=\"menu\"><a href=\"");
      out.print(BASE_URL);
      out.write("/dashboard \"> Dashboard </a> </div>\n");
      out.write("\n");
      out.write("    <h1>User</h1>\n");
      out.write("    <div class=\"menu\"><a href=\"");
      out.print(BASE_URL);
      out.write("/user/add.jsp\"> Add User </a> </div>\n");
      out.write("    <div class=\"menu\"><a href=\"");
      out.print(BASE_URL);
      out.write("/user/index.php\"> List User </a></div>    \n");
      out.write("\n");
      out.write("    <h1>Menu Page</h1>\n");
      out.write("    <div class=\"menu\"><a href=\"");
      out.print(BASE_URL);
      out.write("/menu/add.jsp\"> Add Menu Page </a></div> \n");
      out.write("    <div class=\"menu\"><a href=\"");
      out.print(BASE_URL);
      out.write("/menu/index.php\"> List Menu Page </a></div>\n");
      out.write("\n");
      out.write("    <h1>Contact</h1>\n");
      out.write("    <div class=\"menu\"><a href=\"");
      out.print(BASE_URL);
      out.write("/contact/add.jsp\"> Add Contact </a> </div>\n");
      out.write("    <div class=\"menu\"><a href=\"");
      out.print(BASE_URL);
      out.write("/contact/index.jsp\"> List Contact </a></div>\n");
      out.write("\n");
      out.write("    <h1>Banner</h1>\n");
      out.write("    <div class=\"menu\"><a href=\"");
      out.print(BASE_URL);
      out.write("/banner/add.jsp\"> Add Banner </a> </div>\n");
      out.write("    <div class=\"menu\"><a href=\"");
      out.print(BASE_URL);
      out.write("/banner/index.jsp\"> List Banner </a></div>  \n");
      out.write("\n");
      out.write("     <h1>Product</h1>\n");
      out.write("    <div class=\"menu\"><a href=\"");
      out.print(BASE_URL);
      out.write("/category/add.jsp\"> Add Category </a> </div>\n");
      out.write("    <div class=\"menu\"><a href=\"");
      out.print(BASE_URL);
      out.write("/category/index.jsp\"> List Category</a></div>\n");
      out.write("     <div class=\"menu\"><a href=\"");
      out.print(BASE_URL);
      out.write("/product/add.jsp\"> Add  Product </a></div>  \n");
      out.write("     <div class=\"menu\"><a href=\"");
      out.print(BASE_URL);
      out.write("/product/index.jsp\"> List  Product </a></div>                        \n");
      out.write("                   \n");
      out.write("</div>\n");
      out.write("        \n");
      out.write("    </body>\n");
      out.write("</html>\n");
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
