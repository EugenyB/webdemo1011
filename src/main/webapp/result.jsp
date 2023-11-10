<%--
  Created by IntelliJ IDEA.
  User: eberk
  Date: 10.11.2023
  Time: 19:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Result</title>
</head>
<body>
    <jsp:useBean id="calc" class="com.example.webdemo1011.beans.Calculator" scope="request"/>
    <h1>${calc.a} + ${calc.b} = ${calc.sum}</h1>
    <h2>${calc.a} - ${calc.b} = ${calc.a - calc.b}</h2>
</body>
</html>
