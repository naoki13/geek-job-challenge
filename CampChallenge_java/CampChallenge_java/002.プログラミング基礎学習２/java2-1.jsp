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
int num=3;String mes=" ";
switch(num){
    case 1:
        mes="1です。";
        break;
    case 2:
        mes="2です。";
        break;
    default:
        mes="想定外です。";
        break;
}
out.print(mes);
%>
    </body>
</html>
