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
String a=request.getParameter("param1");
int moto=Integer.parseInt(a);
out.print(moto);             //元の数字を表示
out.print("<br>");
while(moto%2==0){
    moto/=2;                 //2で割れるだけ割る
    out.println(2);
}
for(int i=3;i*i<=moto;i+=2){
    while(moto%i==0){
    moto/=i;                 //奇数で割れるだけ割る
    out.println(i);
}
}
    out.print(moto);         //最大の素数を表示
    out.print("<br>");
if(moto>=10){
    out.print("その他");
}



%>
    </body>
</html>
