<%--
  Created by IntelliJ IDEA.
  User: HP
  Date: 2021-04-18
  Time: 23:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<img src="${imgPath}">
<form method="post" action="/test/download?filename=${imgPath}">
    <input type="submit" value="文件下载">
</form>
</body>
</html>
