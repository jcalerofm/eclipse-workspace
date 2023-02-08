package conectarbasedatos;

import java.sql.*;





public class conectarprueba {
	
	public static void main(String[] args) {
		
		try {
			
			//  CASI CASI SIEMPRE USAREMOS "PREPAREDSTATEMENT"
			
			// 1-Crear conexion
			Connection miConexion=DriverManager.getConnection("jdbc:mysql://localhost:3306/AlumnosDam", "root", "");
			
			// 2 - Crear objeto STATEMENT
			//Statement miStatement= (Statement) miConexion.createStatement();
			
			// 3 - Crear Objeto PREPAREDSTATEMENT
			PreparedStatement pst = miConexion.prepareStatement("SELECT * FROM ALUMNOS");
			
			// 3 - Ejecutar SQL CON STATEMENT
			//ResultSet miResultSet=miStatement.executeQuery("SELECT * FROM ALUMNOS");
			// 3 - Ejectutar SQL CON PREPAREDSTATEMENT
			ResultSet rs=pst.executeQuery();
					
			// 4 - Recorrer y leer el resultado de la consulta con STATEMENT
			//while(miResultSet.next()) {
			//	System.out.println(miResultSet.getString("Nombre") + " " + miResultSet.getString("Email")+ " " + miResultSet.getString("Telefono"));
			
			//}
			
			// 4 - Recorrer y leer el resultado de la consulta con PREPAREDSTATEMENT
			while (rs.next()) {
				System.out.println(rs.getString("Nombre") + " " + rs.getString("Email")+ " " + rs.getString("Telefono")); 
				// En este caso "Nombre", "Email" y "Telefono" son las columnas, han de coincidir case sensitive tal como esten en la BBDD
			}
			
			// 5 - Cerrar conexion
			miConexion.close();
			
		}catch (SQLException e) {
			System.err.println("Fallo de conexion!");
			e.printStackTrace();
		}
	}
	
}

