<%-- 
    Document   : index
    Created on : 2022-3-21, 17:27:56
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
            .tc{
                color: blue;
                background-color:darkgray;
                opacity: 0.8;
                text-align: center;
            }
            .ts{
                background-color:gainsboro;
                font-size: 17px;
            }
            table {
                border:solid 1px #cccccc;
                border-collapse: collapse;
                border-spacing: 0;
            }
            td {
                text-align: center; 
            }
        </style>
        
    <center>
        <h1 style=" font-size: 20px; color: blue ; font-weight:bold;">保健品促销活动管理系统</h1>
        <%
        ArrayList<book> bf =DBUtil.SearchBookAll();
        %>
        <table cellpadding="15">
            <caption ><a href="add.jsp" style="color: blue; ">添加图书信息</a></caption>
            <td class="tc">开始时间</td><td class="tc">结束时间</td>
            <td class="tc">促销保健品</td><td class="tc">价格</td><td class="tc" colspan="2" style=" text-align: center;">管理</td>
        <%
        for(book b1:bf){
        %>
            <tr><td  class="ts"><%=b1.getBname()%></td>
            <td class="ts"><%= b1.getBauthor()%></td>  
            <td class="ts"><%=b1.getBpublish()%></td>  
            <td class="ts"><%= b1.getBprice()%></td>  
            <td class="ts" style="color: blue;"><a href="edit.jsp?id=<%=b1.getBid()%>">修改</a></td>  
            <td  class="ts" style="color: blue;"><a href="del.jsp?id=<%=b1.getBid()%>">删除</a></td>  
           <%
           }
           %>  
        </tr>   
        </table>
     </center>
    </body>
</html>
