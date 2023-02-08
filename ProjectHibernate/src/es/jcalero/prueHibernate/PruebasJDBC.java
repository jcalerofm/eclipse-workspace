package es.jcalero.prueHibernate;

import java.sql.*;


public class PruebasJDBC {
	
	public static void main(String[] args) {
		String jdbcUrl="jdbc:mysql://localhost:3306/pruebasHibernate?useSSL=false";
		String user="root";
		String pass="";
		try {
			System.out.println("Intentando conectar a la DDBB");
			Connection miConexion = DriverManager.getConnection(jdbcUrl,user,pass);
			System.out.println("Conexion correcta!");
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
