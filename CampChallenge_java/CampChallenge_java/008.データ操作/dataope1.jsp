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
        <form action="dataope1.jsp" method="post">
            名前:<input type="text" name="N">
            <br>
            性別:
            男性<input type="radio" name="M">
            女性<input type="radio" name="F">
            <br>
            趣味:<textarea name="Fa" rows="4" cols="20"></textarea>
            
            <input type="submit" value="送信">
            
        </form>
    </body>
</html>
