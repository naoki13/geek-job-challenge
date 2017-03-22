<%-- 
    Document   : dataope1
    Created on : 2017/03/22, 12:56:11
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
            request.setCharacterEncoding("UTF-8");
            
            String n=request.getParameter("N");
            String s=request.getParameter("M");
            String se=request.getParameter("F");
            String syu=request.getParameter("Fa");
            
            out.print(n);
            out.print("<br>");
            out.print(s);
            out.print("<br>");
            out.print(se);
            out.print("<br>");
            out.print(syu);
            %>
    </body>
</html>
