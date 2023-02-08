package modificaBD;

import java.sql.*;

public class modificaBBDD {
	
	public static void main(String[] args) {
		
		String mensaje;
		
		try {
			
			// 1- Crear conexion
			Connection miConexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/AlumnosDam", "root", "");
			
			// 2- Crear objeto STATEMENT
			Statement miStatement = miConexion.createStatement();
			
			// instruccion INSERT
			//String insertSql = "INSERT INTO Alumnos(Id, Nombre, Email, Telefono) VALUE (0, 'Juan', 'juan@staff.com', '678439285')";
			//miStatement.executeUpdate(insertSql);
			//mensaje = "INSERTADO";
			
			
			// instruccion UPDATE
			//String updateSql = "UPDATE Alumnos SET Email='juan@staff.org' WHERE Id=0";
			//miStatement.executeUpdate(updateSql);
			//mensaje = "ACTUALIZADO";
			
			// instruccion DELETE
			String deleteSql = "DELETE FROM Alumnos WHERE Id=0";
			miStatement.executeUpdate(deleteSql);
			mensaje = "ELIMINADO";
			
			
			
			System.out.println("Alumno " + mensaje + " correctamente");
			
			miConexion.close();
			
		}catch (SQLException e) {
			System.err.println("Fallo de conexion!");
			e.printStackTrace();
		}
		
		
		
		
	}
}
