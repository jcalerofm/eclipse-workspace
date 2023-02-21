<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="security" uri="http://www.springframework.org/security/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>MAVEN MVC</title>
</head>
<body>
	<h1>QUE PASA AKI!!</h1>
	<h4>MavenMVC</h4>

  <p>
    Usuario: <security:authentication property="principal.username" />
  </p>
  <p>
    Rol: <security:authentication property="principal.authorities" />
  </p>
  <br><br>

  <security:authorize access="hasRole('administrador')">
    <p><a href="${pageContext.request.contextPath}/administradores">Ir a zona Administradores</a></p>
  </security:authorize>

  <security:authorize access="hasRole('ayudante')">
    <p><a href="${pageContext.request.contextPath}/ayudantes">Ir a zona Ayudante</a></p>
  </security:authorize>

  
	<form:form action="${pageContext.request.contextPath}/logout"
		method="POST">
		<input type="submit" value="Logout" />
	</form:form>
  
</body>
</html>
