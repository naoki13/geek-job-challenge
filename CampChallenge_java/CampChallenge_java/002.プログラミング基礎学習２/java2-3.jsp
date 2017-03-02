<%-- 
    Document   : java2-
    Created on : 2017/03/02, 16:05:03
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
int num=8;
for(int i=0;i<20;i++){
    out.print(num^i);
}
%>
    </body>
</html>
