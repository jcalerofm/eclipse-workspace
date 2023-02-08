package es.jcalero.conexHibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class ActualizaCliente {

	public static void main(String[] args) {

    SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Clientes.class).buildSessionFactory();
    Session session = factory.openSession();

    try {
      // int clienteId=4;
      // session.beginTransaction();
      // Clientes cliente = session.get(Clientes.class, clienteId);
      // cliente.setNombre("Jorge Huan");
      // session.getTransaction().commit();
      // System.out.println("Cliente actualizado");

      //actualizar con query
      session.beginTransaction();
      session.createQuery("update Clientes set nombre='Jorge Huan' where Nombre LIKE 'Jor%'").executeUpdate();
      session.getTransaction().commit();
      System.out.println("Cliente actualizado");

      //delete
      // session.beginTransaction();
      // session.createQuery("delete from Clientes where id=4").executeUpdate();
      // session.getTransaction().commit();
      // System.out.println("Cliente borrado");

      session.close();


    } finally {
      factory.close();
    }
	}

}
