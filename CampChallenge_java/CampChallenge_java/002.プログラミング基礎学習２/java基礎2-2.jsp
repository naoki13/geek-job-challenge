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
String g="A";String mes=" ";
switch(g){
    case "A":
        mes="英語";
        break;
    case "あ":
        mes="日本語";
        break;

}
out.print(mes);
%>
    </body>
</html>
