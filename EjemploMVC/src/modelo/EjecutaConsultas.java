package modelo;

import java.sql.*;

public class EjecutaConsultas {

  public EjecutaConsultas() {
    miConexion = new ConexionBBDD();
  }

  public ResultSet filtraBBDD(String NombreCliente, String Telefono) {

    Connection conecta = miConexion.dameConexion();
    rs =null;

    try {
      if(!NombreCliente.equals("Todos") && Telefono.equals("Todos")) {
        envConsulNombre = conecta.prepareStatement(consulNombre);
        envConsulNombre.setString(1, NombreCliente);
        rs = envConsulNombre.executeQuery();
      }else if(NombreCliente.equals("Todos") && !Telefono.equals("Todos")) {
        envConsulTelefono = conecta.prepareStatement(consulTelefono);
        envConsulTelefono.setString(1, Telefono);
        rs = envConsulTelefono.executeQuery();
      }else if(NombreCliente.equals("Todos") && Telefono.equals("Todos")) {
        envConsulVacia = conecta.prepareStatement(consulVacia);
        envConsulVacia.setString(1, NombreCliente);
        envConsulVacia.setString(2, Telefono);
        rs = envConsulVacia.executeQuery();
      }else {
        envConsulTodo = conecta.prepareStatement(consulTodo);
        envConsulTodo.setString(1, NombreCliente);
        envConsulTodo.setString(2, Telefono);
        rs = envConsulTodo.executeQuery();
      }


    }catch(SQLException e) {
      System.err.println("Fallo al cargar la consulta" + e.getMessage());
    }
   return rs;
  }

  private ConexionBBDD miConexion;
  private ResultSet rs;
  private PreparedStatement envConsulNombre;
  private PreparedStatement envConsulTelefono;
  private PreparedStatement envConsulTodo;
  private PreparedStatement envConsulVacia;
  private final String consulNombre="SELECT Nombre , Telefono FROM Alumnos WHERE Nombre = ?";
  private final String consulTelefono="SELECT Nombre, Telefono FROM Alumnos WHERE Telefono = ?";
  private final String consulTodo="SELECT Nombre, Telefono FROM Alumnos WHERE Nombre = ? AND Telefono = ?";
  private final String consulVacia="SELECT Nombre, Telefono FROM Alumnos";

}
