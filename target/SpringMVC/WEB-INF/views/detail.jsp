<%@ page contentType="text/html;charset=ISO-8859-1" pageEncoding="ISO-8859-1" language="java" %>
<!DOCTYPE html>
<head>
    <meta charset="ISO-8859-1">
    <title>Details Page</title>
</head>

<body>
<% String name =(String) request.getAttribute("details");%>
<h1>NAME is <%= name%></h1>
</body>
</html>
