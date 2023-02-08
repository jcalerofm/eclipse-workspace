<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Ese Cadi weno ahi!</title>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/recursos/estilos/style.css"/>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.3.1/dist/css/bootstrap.min.css"
  integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">

</head>
<body style="color: #fff; font-weight: bold; font-family: 'Anton', sans-serif; letter-spacing: 1px;">

<h1>Estos son los datos introducidos</h1>

Nombre: ${param.nombre}
<br />
Apellidos: ${param.apellidos}
<br />
Edad: ${param.edad}

</body>
</html>
