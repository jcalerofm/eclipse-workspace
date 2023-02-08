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
        <input type="submit" value="Enviar" />
      </form:form>

      <!-- <div class="card">
        <h2>Contact Us</h2>
        <div class="row">
          <div class="col">
            <div class="form-group">
              <label>First Name</label>
              <input type="text">
            </div>
          </div>

          <div class="col">
            <div class="form-group">
              <label>Surname</label>
              <input type="text">
            </div>
          </div>

          <div class="col">
            <div class="form-group">
              <label>Email</label>
              <input type="text">
            </div>
          </div>

          <div class="col">
            <div class="form-group">
              <label>Phone</label>
              <input type="text">
            </div>
          </div>

          <div class="col">
            <div class="form-group">
              <label>Message</label>
              <textarea></textarea>
            </div>
          </div>

          <div class="col">
            <input type="submit" value="Submit">
          </div>
        </div>
      </div> -->

    </body>

    </html>
