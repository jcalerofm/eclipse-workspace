<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
<link
	href="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css"
	rel="stylesheet" id="bootstrap-css">
<script
	src="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"></script>
<script
	src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<style>
	body {
	margin: 0;
	padding: 0;
	background-color: #17a2b8;
	height: 100vh;
}

#login .container #login-row #login-column #login-box {
	margin-top: 120px;
	max-width: 600px;
	height: 320px;
	border: 1px solid #9C9C9C;
	background-color: #EAEAEA;
}

#login .container #login-row #login-column #login-box #login-form {
	padding: 20px;
}

#login .container #login-row #login-column #login-box #login-form #register-link
	{
	margin-top: -85px;
}

.formatoError{
	color: red;
}

.formatoLogout{
	color: green;
	font-weight: bold;
}
</style>
</head>
<body>
<h2 style="text-align:center;">Página de login</h2>

<form:form action="${pageContext.request.contextPath }/verificarUsuario" method="POST">
	<c:if test="${param.error!=null}">
		<strong class="formatoError">Usuario o contraseña incorrecta</strong>
	</c:if>
	<p>
		Usuario: <input type="text" name="username"/>
	</p>
	<p>
		Contraseña: <input type="password" name="password"/>
	</p>
	<input type="submit" value="Login"/>
</form:form>
</body>
</html>