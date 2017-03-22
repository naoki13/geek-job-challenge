<%-- 
    Document   : dataope5
    Created on : 2017/03/22, 16:26:04
    Author     : 尚輝
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
           <% HttpSession hs=request.getSession(true);
              request.setCharacterEncoding("UTF-8");         //文字コードを指定
                
           hs.setAttribute("NN",request.getParameter("N"));    //入力された文字列をセッションに格納
           hs.setAttribute("SS",request.getParameter("S"));    //同情
           hs.setAttribute("TATA",request.getParameter("TA")); //同情
           %>
           
        <form action="./dataope5.jsp" method="post">
            名前：<input type="text"name="N"value=
                      <%
                          if(hs.getAttribute("NN") !=null){
                              out.print(hs.getAttribute("NN"));
                          }  //初期値を設定
                          %>
                      >
            <br>
            性別:
            男性<input type="radio"name="S"value="男性"
                     <%
                     if(hs.getAttribute("SS") !=null&&hs.getAttribute("SS").equals("男性")){
                         out.print("checked");
                     }        //単にSSがnullでないなら、
                              //だけだと女性にマークされてても男性に
                              //初期値が設定されてしまうので、
                              //&&以降で条件を記述
                     %>
                     >
            女性<input type="radio"name="S"value="女性"
                     <%
                     if(hs.getAttribute("SS") !=null&&hs.getAttribute("SS").equals("女性")){
                         out.print("checked");
                     }         //初期値を設定(男性のところと一緒)
                     %>
                     >
            <br>
            趣味：<textarea name="TA"　rows="50" cols="30">
                <%
                if(hs.getAttribute("TATA") !=null){
                    out.print(hs.getAttribute("TATA"));
                }              //初期値を設定
                %>
            </textarea>
            <br>
            <input type="submit"name="SS"value="送信">
        </form>
    </body>
</html>
