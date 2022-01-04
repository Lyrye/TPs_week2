<%--
  Created by IntelliJ IDEA.
  User: Lila
  Date: 04/01/2022
  Time: 11:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Tempertarue</title>
</head>
<body>
<p>
    La temperature en France est de:<% request.getAttribute("fr");%>
    La temperature en Allemagne est de:<% request.getAttribute("de");%>
    La temperature en Angleterre est de:<% request.getAttribute("en");%>
</p>

</body>
</html>
