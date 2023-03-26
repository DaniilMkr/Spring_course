package Hibernate.CRUD;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.io.File;


public class CreateRecordInTable {

    public static void main(String[] args) {
        File f = new File("hibernate.cfg.xml");
        SessionFactory factory = new Configuration()
                .configure(f)
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory();

        try {
            Session session = factory.getCurrentSession();
            Employee emp = new Employee("Daniil", "Makarov", "IT", 500);
            session.beginTransaction();
            session.persist(emp);
            session.getTransaction().commit();
        } finally {
            factory.close();
        }
    }
}