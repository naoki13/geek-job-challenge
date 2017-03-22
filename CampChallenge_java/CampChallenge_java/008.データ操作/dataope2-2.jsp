<%-- 
    Document   : dataope
    Created on : 2017/03/22, 10:29:58
    Author     : guest1Day
以下の入力フィールドを持ったHTMLを、Javaで処理する想定で記述してください。
・名前（テキストボックス）、性別（ラジオボタン）、趣味（複数行テキストボックス）
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form action="./dataope.jsp" method="post">
            名前:<input type="text" name="txtname">
            <br>
            性別:
            男性<input type="radio" name="rdoname">
            女性<input type="radio" name="rdoname">
            <br>
            趣味:<textarea name="txaname"></textarea>
            
            <input type="submit" value="送信">
        </form>
    </body>
</html>
