package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class add_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <style>\n");
      out.write("            a{text-decoration:none;}\n");
      out.write("            a:link {color: blue}\n");
      out.write("            a:visited {color: blue}\n");
      out.write("            table {\n");
      out.write("                border:solid 1px #cccccc;\n");
      out.write("                border-collapse: collapse;\n");
      out.write("                border-spacing: 0;\n");
      out.write("            }\n");
      out.write("             .td1{\n");
      out.write("                color: blue;\n");
      out.write("                background-color:darkgray;\n");
      out.write("                opacity: 0.8;\n");
      out.write("                text-align: center;\n");
      out.write("                font-size: 17px;\n");
      out.write("                text-align: left;\n");
      out.write("            }\n");
      out.write("            .td2{\n");
      out.write("                background-color:gainsboro;\n");
      out.write("                font-size: 15px;\n");
      out.write("                border: 1px  solid gainsboro;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("       <center>\n");
      out.write("        <form action=\"add_do.jsp\" method=\"post\">\n");
      out.write("            <table border=\"1\" >\n");
      out.write("                <caption style=\" font-size: 20px; color: blue ; font-weight:bold;\"> 录入图书信息</caption>\n");
      out.write("                <tr><td class=\"td1\">书名：</td><td><input class=\"td2\" type=\"text\" name=\"bname\"></td></tr>\n");
      out.write("                <tr><td class=\"td1\">作者：</td><td><input class=\"td2\" type=\"text\" name=\"bauthor\"></td></tr>\n");
      out.write("                <tr><td class=\"td1\">出版社：</td><td><input class=\"td2\" type=\"text\" name=\"bpublish\"></td></tr>\n");
      out.write("                <tr><td class=\"td1\">价格：</td><td><input class=\"td2\"  type=\"text\" name=\"bprice\"></td></tr>\n");
      out.write("                <tr><td colspan=\"2\"><input style=\"width:70px;\"type=\"submit\" value=\"保存\">\n");
      out.write("                        <input style=\"width:66px;\"type=\"reset\" value=\"重置\">\n");
      out.write("                        <a  href=\"index.jsp\" >返回</a></td>\n");
      out.write("                    </tr>\n");
      out.write("            </table>\n");
      out.write("        </form>\n");
      out.write("    </center>\n");
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
