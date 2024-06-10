<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page isELIgnored="false"%>
<%-- <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %> --%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h2>This is Home page!</h2>

	<h5>Getting the data from controller using expression</h5>
	id : ${id}
	<br> Name: ${name}
	<br> Subject: ${subject }


	<br>
	<hr>

	<h5>Getting the data using scriplet tags</h5>
	Id:
	<%=request.getAttribute("id")%>
	Name:
	<%=request.getAttribute("name")%>
	Subject:
	<%=request.getAttribute("subject")%>
	
	<br>
	<hr>
	
	<h5>List data iterator using core tage</h5>
	
	<%-- <c:forEach items="${subject }" var="sub">
		<c:out value="${sub}"></c:out>
	</c:forEach> --%>
	
</body>
</html>