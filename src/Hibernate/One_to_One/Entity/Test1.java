package Hibernate.One_to_One.Entity;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class Test1 {

    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class).
                addAnnotatedClass(Detail.class)
                .buildSessionFactory();

        Session session =null;

        try {
            session = factory.getCurrentSession();
            Employee employee = new Employee("Daniil", "Makarov", "IT", 600);
            Detail detail = new Detail("Novi Sad", "334343434", "dkdm@gmail.com");
            session.beginTransaction();
            employee.setEmpDetail(detail);
            session.save(employee);

            session.getTransaction().commit();
            System.out.println("Done!");
        } finally {
            session.close();
            factory.close();
        }
    }
}