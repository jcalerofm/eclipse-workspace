<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Formulario Login</title>
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

.formatoError {
	color: red;
}

.formatoLogout {
	color: green;
	font-weight: bold;
}
</style>
</head>
<body>

	<div id="login">
		<h3 class="text-center text-white pt-5">Formulario de Login</h3>

		<div class="container">

			<div id="login-row"
				class="row justify-content-center align-items-center">
				<div id="login-column" class="col-md-6">
					<div id="login-box" class="col-md-12">
						<form:form id="login-form" class="form"
							action="${pageContext.request.contextPath }/verificarUsuario"
							method="POST">
							<c:if test="${param.error!=null}">
								<strong class="formatoError">Usuario o contraseña
									incorrecta</strong>
							</c:if>
              <!-- another c:if to logout -->
              <c:if test="${param.logout!=null}">
                <strong class="formatoLogout">Ha cerrado sesion</strong>
              </c:if>
							<div class="form-group">
								<label for="username" class="text-info">Usuario:</label><br>
								<input type="text" name="username" id="username"
									class="form-control">
							</div>
							<div class="form-group">
								<label for="password" class="text-info">Contraseña:</label><br>
								<input type="password" name="password" id="password"
									class="form-control">
							</div>
							<div class="form-group">
								<br> <input type="submit" name="submit"
									class="btn btn-info btn-md" value="Enviar">
							</div>

						</form:form>
					</div>
				</div>
			</div>
		</div>
	</div>


</body>
</html>
