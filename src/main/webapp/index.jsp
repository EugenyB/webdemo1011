<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
  <title>JSP - Hello World</title>
</head>
<body>
<h1><%= "Hello World!" %></h1>
<br/>
<a href="hello">Hello Servlet</a>
<form action="hello-servlet" method="post">
  <input type="number" name="a">
  <input type="number" name="b">
  <input type="submit" value="Sum">
</form>
</body>
</html>