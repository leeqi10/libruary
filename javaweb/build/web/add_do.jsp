<%-- 
    Document   : add_do
    Created on : 2022-3-21, 17:16:57
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
                request.setCharacterEncoding("utf-8");
                response.setCharacterEncoding("utf-8");
            %>
        <jsp:useBean id ="bb" class="com.xhu.model.book"/>
        <jsp:setProperty name="bb" property="*"/>
        <%
        if(DBUtil.InsertBook(bb)>0){
        out.println("保存成功！");
        }
        else
        out.println("保存失败！");
        out.println("<br><a href =index.jsp>返回</a>");
        response.setHeader("Refresh", "5;url=index.jsp");
        %>   
    </body>
</html>
