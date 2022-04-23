<%-- 
    Document   : add
    Created on : 2022-3-22, 22:59:02
    Author     : Super
--%>

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
                background-color:gainsboro;
                font-size: 15px;
                border: 1px  solid gainsboro;
            }
        </style>
       <center>
        <form action="add_do.jsp" method="post">
            <table border="1" >
                <caption style=" font-size: 20px; color: blue ; font-weight:bold;"> 添加促销保健品的活动</caption>
                <tr><td class="td1">开始时间：</td><td><input class="td2" type="text" name="bname"></td></tr>
                <tr><td class="td1">结束时间：</td><td><input class="td2" type="text" name="bauthor"></td></tr>
                <tr><td class="td1">促销保健品：</td><td><input class="td2" type="text" name="bpublish"></td></tr>
                <tr><td class="td1">价格：</td><td><input class="td2"  type="text" name="bprice"></td></tr>
                <tr><td colspan="2"><input style="width:70px;"type="submit" value="保存">
                        <input style="width:66px;"type="reset" value="重置">
                        <a  href="index.jsp" >返回</a></td>
                    </tr>
            </table>
        </form>
    </center>
    </body>
</html>
