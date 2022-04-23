package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.xhu.dao.DBUtil;
import java.util.ArrayList;
import com.xhu.model.book;

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
      out.write("\n");
      out.write("\n");
      out.write("\n");
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
      out.write("  \n");
      out.write("            a{text-decoration:none;}\n");
      out.write("            a:link {color: blue}\n");
      out.write("            a:visited {color: blue}\n");
      out.write("            .tc{\n");
      out.write("                color: blue;\n");
      out.write("                background-color:darkgray;\n");
      out.write("                opacity: 0.8;\n");
      out.write("                text-align: center;\n");
      out.write("            }\n");
      out.write("            .ts{\n");
      out.write("                background-color:gainsboro;\n");
      out.write("                font-size: 17px;\n");
      out.write("            }\n");
      out.write("            table {\n");
      out.write("                border:solid 1px #cccccc;\n");
      out.write("                border-collapse: collapse;\n");
      out.write("                border-spacing: 0;\n");
      out.write("            }\n");
      out.write("            td {\n");
      out.write("                text-align: center; \n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("        \n");
      out.write("    <center>\n");
      out.write("        <h1 style=\" font-size: 20px; color: blue ; font-weight:bold;\">图书管理系统</h1>\n");
      out.write("        ");

        ArrayList<book> bf =DBUtil.SearchBookAll();
        
      out.write("\n");
      out.write("        <table cellpadding=\"15\">\n");
      out.write("            <caption ><a href=\"add.jsp\" style=\"color: blue; \">添加图书信息</a></caption>\n");
      out.write("            <td class=\"tc\">书名</td><td class=\"tc\">作者</td>\n");
      out.write("            <td class=\"tc\">出版社</td><td class=\"tc\">价格</td><td class=\"tc\" colspan=\"2\" style=\" text-align: center;\">管理</td>\n");
      out.write("        ");

        for(book b1:bf){
        
      out.write("\n");
      out.write("            <tr><td  class=\"ts\">");
      out.print(b1.getBname());
      out.write("</td>\n");
      out.write("            <td class=\"ts\">");
      out.print( b1.getBauthor());
      out.write("</td>  \n");
      out.write("            <td class=\"ts\">");
      out.print(b1.getBpublish());
      out.write("</td>  \n");
      out.write("            <td class=\"ts\">");
      out.print( b1.getBprice());
      out.write("</td>  \n");
      out.write("            <td class=\"ts\" style=\"color: blue;\"><a href=\"edit.jsp?id=");
      out.print(b1.getBid());
      out.write("\">修改</a></td>  \n");
      out.write("            <td  class=\"ts\" style=\"color: blue;\"><a href=\"del.jsp?id=");
      out.print(b1.getBid());
      out.write("\">删除</a></td>  \n");
      out.write("           ");

           }
           
      out.write("  \n");
      out.write("        </tr>   \n");
      out.write("        </table>\n");
      out.write("     </center>\n");
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
