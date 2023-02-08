package modelo;

import java.sql.*;


public class ConexionBBDD {

	public Connection miConexion = null;

	public ConexionBBDD() {

	}

	public Connection dameConexion() {
	try {

		miConexion=DriverManager.getConnection("jdbc:mysql://localhost:3306/AlumnosDam", "root", "");



	}catch (SQLException e) {
		System.err.println("Fallo de conexion!");
		e.printStackTrace();
	}
	return miConexion;
}
}
