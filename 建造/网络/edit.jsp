<%-- 
    Document   : edit
    Created on : 2022-3-23, 11:30:55
    Author     : Super
--%>

<%@page import="com.xhu.dao.DBUtil"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.xhu.model.book"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <style>
            a{text-decoration:none;}
            a:link {color: blue}
            a:visited {color: blue}
            table {
                border:solid 1px #cccccc;
                border-collapse: collapse;
                border-spacing: 0;
            }
            .td1{
                color: blue;
                background-color:darkgray;
                opacity: 0.8;
                text-align: center;
                font-size: 17px;
                text-align: left;
            }
            .td2{
                background-color:lightgrey;
                font-size: 15px;
                border:none ;
                height:30px;
            }
        </style>
    <center>    
              <%	
               int id =Integer.parseInt(request.getParameter("id"));  
               book b =new book();
               b =DBUtil.SearchBook(id);
               %>
         <form action="edit_do.jsp" method="post">
             <input type="hidden" name="id" value="<%= id%>" />
            <table border="1" >
                <caption style=" font-size: 20px; color: blue ; font-weight:bold;">修改保健品的信息</caption>
                <tr><td class="td1">开始时间：</td><td><input class="td2" type="text" name="bname" value="<%=b.getBname()%>"></td></tr>
                <tr><td class="td1">结束时间：</td><td><input  class="td2"type="text" name="bauthor" value="<%=b.getBauthor()%>"></td></tr>
                <tr><td class="td1">促销保健品：</td><td><input  class="td2"type="text" name="bpublish" value="<%=b.getBpublish()%>"></td></tr>
                <tr><td class="td1">价格：</td><td><input  class="td2" type="text" name="bprice" value="<%=b.getBprice()%>"></td></tr>
                <tr><td ><input style="width:68px;height:25px;"type="submit" value="修改"></td><td><a href="index.jsp" >返回</a></td></tr>
            </table>   
        </form> 
    </center>
    </body>
</html>
