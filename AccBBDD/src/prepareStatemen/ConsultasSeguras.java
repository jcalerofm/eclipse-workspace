package prepareStatemen;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ConsultasSeguras {

	public static void main (String[] args) {
		
try {
			
			//  CASI CASI SIEMPRE USAREMOS "PREPAREDSTATEMENT"
			
			// 1-Crear conexion
			Connection miConexion=DriverManager.getConnection("jdbc:mysql://localhost:3306/AlumnosDam", "root", "");
			// 2 - Crear Objeto PREPAREDSTATEMENT
			String consulta = "SELECT Nombre, Telefono FROM AlumnosDam.Alumnos WHERE Nombre =? AND Telefono =?";
			PreparedStatement pst = miConexion.prepareStatement(consulta);
			pst.setString(1, "Calero");
			pst.setString(2, "623456789");
			// 3 - Ejectutar SQL CON PREPAREDSTATEMENT
			ResultSet rs=pst.executeQuery();
			// 4 - Recorrer y leer el resultado de la consulta con PREPAREDSTATEMENT
			while (rs.next()) {
				System.out.println(rs.getString(1) + " " + rs.getString(2)); //Aqui los numeros obedecen al orden del Select, no de los '?'
			}
			
			
			
			// 2 - Crear objeto STATEMENT
			//Statement miStatement= (Statement) miConexion.createStatement();
			// 3 - Ejecutar SQL CON STATEMENT
			//ResultSet miResultSet=miStatement.executeQuery("SELECT * FROM ALUMNOS");
			// 4 - Recorrer y leer el resultado de la consulta con STATEMENT
			//while(miResultSet.next()) {
			//	System.out.println(miResultSet.getString("Nombre") + " " + miResultSet.getString("Email")+ " " + miResultSet.getString("Telefono"));
			//}
			
			
			
			// 5 - Cerrar conexion
			miConexion.close();
			
		}catch (SQLException e) {
			System.err.println("Fallo de conexion!");
			e.printStackTrace();
		}
		
	}
}
