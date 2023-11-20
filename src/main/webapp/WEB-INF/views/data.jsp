<%@ page contentType="text/html;charset=ISO-8859-1" pageEncoding="ISO-8859-1" language="java" %>
<!DOCTYPE html>
<head>
    <meta charset="ISO-8859-1">
    <title>Details Page</title>
</head>

<body>
<% String name =(String) request.getAttribute("data");
   String phone =(String) request.getAttribute("phone"); %>
<h1>NAME is <%= name%></h1><br>
<h1>Phone is <%= phone%></h1>
</body>
</html>
