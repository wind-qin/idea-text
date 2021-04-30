<%--
  Created by IntelliJ IDEA.
  User: HP
  Date: 2021-04-08
  Time: 17:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登陆</title>
</head>
<body>

<h1 align="center" style="color: greenyellow">登陆</h1>

<form action="/index" method="post">
    <table align="center">
        <tr>
            <td>姓名：</td>
            <td><input type="text" name="name"></td>
        </tr>

        <tr>
            <td>年龄：</td>
            <td><input type="text" name="age"></td>
        </tr>

        <tr>
            <td>
                <input type="submit" value="提交">
                <input type="reset" value="刷新">
            </td>
        </tr>
    </table>
</form>

</body>
</html>
