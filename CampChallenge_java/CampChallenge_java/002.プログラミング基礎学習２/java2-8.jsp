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
    String [] aaa=new String[7];
    aaa[0]="10";
    aaa[1]="100";
    aaa[2]="soeda";
    aaa[3]="hayashi";
    aaa[4]="-20";
    aaa[5]="118";
    aaa[6]="END";
    
    aaa[2]="33";
    out.print(aaa[2]);
%>
    </body>
</html>
