<%-- 
    Document   : del
    Created on : 2022-3-23, 0:25:09
    Author     : Super
--%>

<%@page import="com.xhu.dao.DBUtil"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
        String ss =request.getParameter("id");
        int id =Integer.parseInt(ss);
         if(DBUtil.DelBook(id)>0)
         out.print("删除成功！");
         else
         out.print("删除失败！");
         out.println("<br><a href =index.jsp>返回</a>");
    response.setHeader("Refresh", "5;url=index.jsp");
        %>
    </body>
</html>
