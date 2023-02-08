package es.jcalero.conexHibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class GuardaCliente {
  // conectar tabla clientes que llame a hibernate.cfg.xml y haga un buildSessionFactory
  // LO QUE BASICAMENTE HACEMOS ES UN INSERT INTO CLIENTES (NOMBRE, APELLIDO, DIRECCION) VALUES ('Jorge', 'Calero', 'su casa')
  // EN LA TABLA CLIENTES. ES UNA MANERA DE HACER CRUD. EN ESTE CASO ES SOLO CREATE.

  public static void main(String[] args) {
    // crear session factory
    SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Clientes.class).buildSessionFactory();
    //crear objeto session
    Session session = factory.openSession();
    try {
      //crear objeto cliente // ESTOS SON LOS DATOS QUE SE VAN A INSERTAR EN LA TABLA CLIENTES
      Clientes cliente = new Clientes("Jorge", "Calero", "su casa");
      //iniciar transaccion
      session.beginTransaction();
      //guardar el objeto cliente
      session.save(cliente);
      //commit transaccion
      session.getTransaction().commit();
      System.out.println("Cliente guardado");
      session.close();
      
    } finally {
      factory.close();
    }

  }
}
