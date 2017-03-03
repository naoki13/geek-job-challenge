<%-- 
    Document   : java2-
    Created on : 2017/03/02, 16:05:03
    Author     : guest1Day
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.util.HashMap"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
<%
    HashMap<String,String>hmap=new HashMap<String,String>();
    hmap.put("1","AAA");
    hmap.put("hello","world");
    hmap.put("soeda","33");
    hmap.put("20","20");
    
out.print(hmap.get("1"));
%>
    </body>
</html>
