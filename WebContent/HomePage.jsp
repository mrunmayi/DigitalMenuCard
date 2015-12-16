
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<% String name = request.getParameter("username");
//out.println(name);
%> 
<br><br><br><br>
<center>Welcome <% out.println(name);
%></center>
<center>Your Table number is 5 <% 
%></center>

<form name="Homepg" action="Homw" method="get">
<br><br><br><br> <center>
<input type="button" name="water" value="Bring water"> &nbsp;&nbsp;
<input type="button" name="Menu" value="Check Menu" onclick="method())"> &nbsp;&nbsp;
<input type="button" name="Oder" value="Place order"> &nbsp;&nbsp;
<input type="button" name="Bill" value="Give Bill"> 
</center>

</form>
</body>
</html>