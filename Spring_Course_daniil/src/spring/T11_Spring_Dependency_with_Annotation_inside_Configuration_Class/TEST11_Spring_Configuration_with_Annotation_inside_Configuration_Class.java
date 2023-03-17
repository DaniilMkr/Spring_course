package spring.T11_Spring_Dependency_with_Annotation_inside_Configuration_Class;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class TEST11_Spring_Configuration_with_Annotation_inside_Configuration_Class {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(MyConfig.class);

        Person person = context.getBean("personBean", Person.class);
        person.callYourPet();
        context.close();
    }
}
