<%--
  Created by IntelliJ IDEA.
  User: HP
  Date: 2021-04-10
  Time: 22:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/apitest" method="post">

    <table align="center">
        <caption><h1 style="color: green">测试参数绑定</h1></caption>
        <tr>
            <td>账号：</td>
            <td><input type="text" name="username"></td>
        </tr>

        <tr>
            <td>密码：</td>
            <td><input type="password" name="password"></td>
        </tr>

        <tr>
            <td>年龄：</td>
            <td><input type="text" name="age"></td>
        </tr>

        <tr>
            <td>性别</td>
            <td>
                <input type="radio" name="gender" value="男"> 男
                <input type="radio" name="gender" value="女" checked> 女
            </td>
        </tr>

        <tr>
            <td>信息</td>
            <td>
                <input type="text" name="info">
            </td>
        </tr>
        <tr>
            <td colspan="2" align="center" >
                <input type="submit" value="提交">&nbsp;&nbsp;&nbsp;&nbsp;
                <input type="reset" value="刷新">
            </td>
        </tr>
    </table>

</form>

</body>
</html>
