package modelo;

import java.sql.*;

public class CargaMenus {

  public ConexionBBDD miConexion;
  public ResultSet rs;
  public ResultSet rs2;

  public CargaMenus() {

    miConexion = new ConexionBBDD();
  }

  public String ejecutaConsultas(){

      Clientes miCliente = null;
      Connection accesoBBDD = miConexion.dameConexion();

      try{

        Statement st1 = accesoBBDD.createStatement();
        Statement st2 = accesoBBDD.createStatement();

        rs = st1.executeQuery("SELECT DISTINCTROW Nombre FROM Alumnos");
        rs2 = st2.executeQuery("SELECT DISTINCTROW Telefono FROM Alumnos");

        miCliente = new Clientes();
        miCliente.setNombre(rs.getString(1));
        miCliente.setTelefono(rs2.getString(1));

        rs.close();
        rs2.close();
        accesoBBDD.close();

      }catch(SQLException e){

          System.err.println("Error en la consulta" + e.getMessage());
      }
      return miCliente.getNombre();
  }

}
