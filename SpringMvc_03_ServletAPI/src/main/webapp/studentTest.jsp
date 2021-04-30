<%--
  Created by IntelliJ IDEA.
  User: HP
  Date: 2021-04-10
  Time: 10:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<form action="/complexty" method="post">

    <table align="center">
        <caption><h1 style="color: green">测试参数绑定</h1></caption>
        <tr>
            <td>账号：</td>
            <td><input type="text" name="list[0].username"></td>
        </tr>

        <tr>
            <td>密码：</td>
            <td><input type="password" name="list[1].password"></td>
        </tr>

        <tr>
            <td>年龄：</td>
            <td><input type="text" name="map['age'].age"></td>
        </tr>

        <tr>
            <td>性别</td>
            <td>
                <input type="radio" name="map['gender'].gender" value="男"> 男
                <input type="radio" name="map['gender'].gender" value="女" checked> 女
            </td>
        </tr>

        <tr>
            <td>生日</td>
            <td><input type="date" name="map['birthday'].birthday"></td>
        </tr>

        <tr>
            <td>信息</td>
            <td>
                <input type="text" name="map['info'].info">
            </td>
        </tr>
        <tr>
            <td align="center" >
                <input type="submit" value="提交">&nbsp;&nbsp;&nbsp;&nbsp;
                <input type="reset" value="刷新">
            </td>
        </tr>
    </table>

</form>

</body>
</html>
