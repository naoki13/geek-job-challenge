<%-- 
    Document   : dataope3
    Created on : 2017/03/22, 13:50:47
    Author     : 尚輝
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.util.Date"%>
<%@page import="javax.servlet.http.Cookie"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
          Date time=new Date();
          Cookie c=new Cookie("LastLogin",time.toString());
          response.addCookie(c);
          
          Cookie cs[]=request.getCookies();
          if(cs !=null){
              for(int i=0;i<cs.length;i++){
                  if(cs[i].getName().equals("LastLogin")){
                      out.print("最終ログイン："+cs[i].getValue());
                      break;
                  }
              }
          }
        %>
    </body>
</html>
