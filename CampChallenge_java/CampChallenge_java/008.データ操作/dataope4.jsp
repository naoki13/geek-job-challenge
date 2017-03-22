<%-- 
    Document   : dataope4
    Created on : 2017/03/22, 15:24:50
    Author     : 尚輝
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.util.*"%>
<%@page import="javax.servlet.http.HttpSession"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            Date time=new Date();
            
            HttpSession hs=request.getSession();
            hs.setAttribute("LastLogin", time.toString());
            
            hs=request.getSession();
            out.print("最終ログイン；"+hs.getAttribute("LastLogin"));
                
        %>
    </body>
</html>
