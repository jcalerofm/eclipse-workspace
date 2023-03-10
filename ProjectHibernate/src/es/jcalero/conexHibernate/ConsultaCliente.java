package es.jcalero.conexHibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import java.util.List;

public class ConsultaCliente {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {

    SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Clientes.class).buildSessionFactory();
    Session session = factory.openSession();

    try {
      //comenzar sesion
      session.beginTransaction();
      //consulta de todos los clientes
      List<Clientes> clientes = session.createQuery("from Clientes").getResultList();
      //Consulta con parametro
      //String parametro = "Calero";
      //List<Clientes> clientes = session.createQuery("from Clientes cl where cl.apellidos='" + parametro + "'").getResultList();
      //mostrar la consulta anterior
      extracted(clientes);
      //commit EJECUTAR LA CONSULTA
      session.getTransaction().commit();
      session.close();

    } finally {
      factory.close();
    }

	}

	private static void extracted(List<Clientes> clientes) {
		for (Clientes cliente : clientes) {
		    System.out.println(cliente);
		  }
	}

}
