<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="com.Employee.Employee" %>
    <%@ page import="java.util.*" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%List<Employee> e=(List<Employee>)request.getAttribute("list"); %>
<table>
<tr>
<th>EmpNo</th><th>EmpName</th></tr>

<% for(Employee e1:e){%>
<tr><td><%=e1.getEmpno() %></td><td><%=e1.getEmpname() %></td></tr>
<%}%> 
</table>



</body>
</html>