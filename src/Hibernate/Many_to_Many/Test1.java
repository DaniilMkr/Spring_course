package Hibernate.Many_to_Many;

import Hibernate.Many_to_Many.Entity.Child;
import Hibernate.Many_to_Many.Entity.Section;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test1 {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Child.class)
                .addAnnotatedClass(Section.class)
                .buildSessionFactory();

        Session session = null;

        try {
            session = factory.getCurrentSession();
            Section section1 = new Section("Football");
            Section section2 = new Section("Volleyball");
            Child child1 = new Child("Daniil", 7);
            Child child2 = new Child("Andrey", 9);
            Child child3 = new Child("Igor", 9);
            child3.addSectionToChild(section2);
            section1.addChildToSection(child1);
            section1.addChildToSection(child2);
            session.beginTransaction();
            session.save(section1);
            session.save(child3);
            session.getTransaction().commit();
            System.out.println("Done!");
        }
        finally {
            session.close();
            factory.close();

        }

    }
}
