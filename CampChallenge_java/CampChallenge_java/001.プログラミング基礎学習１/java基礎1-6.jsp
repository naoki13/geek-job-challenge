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
    String a=request.getParameter("param1");//商品の種類
    String b=request.getParameter("param2");//購入数
    String c=request.getParameter("param3");//総額
    int i=Integer.parseInt(a);
    int ii=Integer.parseInt(b);
    int iii=Integer.parseInt(c);
    if(i==1){
       out.println("雑貨"); 
    }else if(i==2){
        out.println("生鮮食品");
    }else{
         out.println("その他");
}
    out.print("<br>");
    out.println("単価："+iii/ii+"円");
    out.print("<br>");
    if(iii>=5000){
        out.println(iii*0.05+"ポイント付与");
    }else if(iii>=3000){
        out.println(iii*0.04+"ポイント付与");
    }    
    
%>
    </body>
</html>
