<%-- 
    Document   : edit_do
    Created on : 2022-3-23, 11:31:08
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
             <jsp:useBean id ="aa" class="com.xhu.model.book" />   
             <%             
             try{    
             int bid =Integer.parseInt(request.getParameter("id"));
             String bname =request.getParameter("bname");
             String bauthor =request.getParameter("bauthor");
             String bpublish =request.getParameter("bpublish");
            float bprice = Float.parseFloat(request.getParameter("bprice"))   ;
            aa.setBid(bid);
            aa.setBname(bname);
            aa.setBauthor(bauthor);
            aa.setBpublish(bpublish);
            aa.setBprice(bprice);
             
            }catch(Exception ex){
             out.println("参数为空或者参数格式错误！");
             }
             if(DBUtil.ModifyBook(aa)>0 ){
             out.println("修改成功！");
             }
        else
        out.println("修改失败！");
        out.println("<br><a href =index.jsp>返回</a>");
        response.setHeader("Refresh", "5;url=index.jsp");      
        %>      
    </body>
</html>
