<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>403</title>
</head>
<body>

	<h1>Error Page</h1>
	<h2>${message }</h2>
	<a href="<c:url value='/'/>">Index</a>

</body>
</html>