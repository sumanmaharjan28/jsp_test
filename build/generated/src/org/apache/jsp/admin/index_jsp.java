package org.apache.jsp.admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>    \n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"css/admin_style.css\"/>\n");
      out.write("        <style>\n");
      out.write("            .errormsg{\n");
      out.write("                    display: block;\n");
      out.write("                    width: 250px;\n");
      out.write("                    height: 22px;\n");
      out.write("                    line-height: 22px;\n");
      out.write("                    font-size : 13px;\n");
      out.write("                    color: white;\n");
      out.write("                    font-weight: bold;\n");
      out.write("                    background: #FF9D9D url(images/stop.gif) no-repeat 10px center; \n");
      out.write("                    padding: 3px 10px 3px 40px;\n");
      out.write("                    margin: 10px 0;\n");
      out.write("                    border: 1px solid #FF0000;\n");
      out.write("                    /* border-bottom: 2px solid #FF0000; */\n");
      out.write("            }\n");
      out.write("\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("\t\n");
      out.write("    <body> \n");
      out.write("            <form name=\"f1\" action=\"login_validate.jsp\" method=\"POST\">   \t        \n");
      out.write("    <div style=\"padding-top:200px;\"> \n");
      out.write("            <div style=\"border:1px solid gray; width:330px; margin:0 auto;\">\t\t        \t\t        \n");
      out.write("            <table width=\"330px\" align=\"center\" style=\"border-collapse: collapse; font-size:14px\" cellpadding=\"10px\">\n");
      out.write("                <tr bgcolor=\"#4F8ECB\">\t\t\t\t\n");
      out.write("                    <td colspan=2\"\">  <b> Login </b></td>\t\t\t\t\t\t\n");
      out.write("                </tr>\n");
      out.write("                <tr>\t\t\t\t\n");
      out.write("                    <td width=\"130\"> Username </td>\n");
      out.write("                    <td width=\"200\"> <input type=\"text\" name=\"txtUsername\">  </td>\n");
      out.write("                </tr>\t\t\t\t\t\t\t \t\n");
      out.write("                <tr>\t\t\t\t\n");
      out.write("                    <td> Password </td>\n");
      out.write("                    <td> <input type=\"password\" name=\"txtPassword\">  </td>\n");
      out.write("                </tr>\t\n");
      out.write("                <tr>\t\t\t\t\n");
      out.write("                    <td>&nbsp;  </td>\n");
      out.write("                    <td> <input name=\"btnLogin\" type=\"submit\" value=\"Login\"> </td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\t\t\t\t\n");
      out.write("                    <td colspan=\"2\"> ");
 
      out.write(" </td>\n");
      out.write("                </tr>\n");
      out.write("            </table>\n");
      out.write("            </div>          \t        \t\t\n");
      out.write("            </div>\t\n");
      out.write("            </form>\n");
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
