<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h1>Index Page</h1>

<form action="Logout" method = "post">
	<input type = "submit" value="Logout" />
	<input type = "hidden" name = "${_csrf.parameterName}" value = "${_csrf.token }" />


</form>



</body>
</html>