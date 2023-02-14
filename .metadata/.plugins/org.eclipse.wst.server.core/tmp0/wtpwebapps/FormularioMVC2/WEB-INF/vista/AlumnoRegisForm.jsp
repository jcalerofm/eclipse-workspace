<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
  <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

    <!DOCTYPE html>
    <html>

    <head>
      <meta charset="UTF-8">
      <title>Formulario Alumno</title>
      <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/recursos/estilos/estilo.css" />
    </head>

    <body>
    <h1>Formulario de registro de Alumno</h1><br/>

      <form:form action="procesarFormulario" modelAttribute="elAlumno">
        Nombre:
        <form:input	 path="nombre" />
        <form:errors path="nombre" style="color: red;"/>
        <br /><br /><br />
        Apellido:
        <form:input path="apellido" />
        <form:errors path="apellido" style="color: red;" />
        <br /><br /><br />
        Edad:
        <form:input path="edad" />
        <form:errors path="edad" style="color: red;" />
        <br /><br /><br />
        Email:
        <form:input path="email" />
        <form:errors path="email" style="color: red;" />
        <br /><br /><br />
        Codigo Postal:
        <form:input path="codigoPostal" />
        <br /><br /><br />
        Asignaturas Optativas:<br/>
        <form:select path="optativa" multiple="true">
          <form:option value="Diseño" label="Diseño" />
          <form:option value="Karate" label="Karate" />
          <form:option value="Comercio" label="Comercio" />
          <form:option value="Danza" label="Danza" />
        </form:select>

        <input type="submit" value="Enviar" />
      </form:form>



    </body>

    </html>
