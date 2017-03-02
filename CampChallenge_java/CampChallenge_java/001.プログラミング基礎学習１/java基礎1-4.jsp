<%-- 
    Document   : java基礎1-
    Created on : 2017/03/02, 11:09:53
    Author     : guest1Day
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
<%
 int a=2;
 int b=8;
 out.print(a+b);
 out.print("<br>");
 out.print(a-b);
 out.print("<br>");
 out.print(a*b);
 out.print("<br>");
 out.print(b/a);
%>
    </body>
</html>
