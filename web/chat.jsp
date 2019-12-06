<%--
  Created by IntelliJ IDEA.
  User: n2god
  Date: 06/12/2019
  Time: 11:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8"
         language="java"
         pageEncoding="UTF-8"
%>

<%
    String login = request.getParameter("login");
    if (pageContext.getAttribute("login") == null){
    	pageContext.setAttribute("login", login);
    }
%>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>
        Witaj <%= pageContext.getAttribute("login")%>
    </title>
</head>
<body>
    <h1>Witaj: <%=pageContext.getAttribute("login")%></h1>
</body>
</html>
