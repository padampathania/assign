package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class marks_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<head>\n");
      out.write("<style type=\"text/css\">\n");
      out.write("\t.topbar\n");
      out.write("\t{\n");
      out.write("\t\tmargin-top: 20px;\n");
      out.write("\t}\n");
      out.write("\t.topbar a\n");
      out.write("\t{\n");
      out.write("\t\tcolor: black;\n");
      out.write("\t\ttext-decoration: none;\n");
      out.write("\t\tsize: 24px;\n");
      out.write("\t\tfont-family: verdana;\n");
      out.write("\t\tpadding: 130px;\t\t\n");
      out.write("\t}\n");
      out.write("\t.topbar a:hover\n");
      out.write("\t{\n");
      out.write("\t\tcolor: red;\n");
      out.write("\t}\n");
      out.write("\tmarquee\n");
      out.write("\t{\n");
      out.write("\t\tcolor: white;\n");
      out.write("\t\tfont-family: verdana;\n");
      out.write("\t\tpadding-top:4px; \n");
      out.write("\t\tword-wrap: 14px;\n");
      out.write("\t}\n");
      out.write("</style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\t<div class=\"logout\" >\n");
      out.write("\t\t<a href=\"index.jsp\" target=\"blank\" style=\"margin-left: 95%; text-decoration:none; \">Logout</a>\n");
      out.write("\t</div>\n");
      out.write("<div class =\"topbar\">\n");
      out.write("  <a href=\"studentinfo.html\" target=\"_self\">Student Info</a>\n");
      out.write("  <a href=\"marks.html\" target=\"_self\">Marks</a>\n");
      out.write("  <a href=\"attendance.html\" target=\"_self\">Attendance</a>\n");
      out.write("  <a href=\"time.html\t\t\" target=\"_self\">Time Table</a>\n");
      out.write("</div>\n");
      out.write("<div class=\"marque\">\n");
      out.write("\t<marquee height=\"30\" hspace=\"40\" bgcolor=\"lightgreen\" width=\"87%\" vspace=\"40\">Welcome XYZ (You are currently enrolled in 2016-CU-BE-CSE</marquee>\n");
      out.write("\n");
      out.write("<br><br>\n");
      out.write("<img src=\"gate distribution\">\n");
      out.write("</div>\n");
      out.write("</body>\n");
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
