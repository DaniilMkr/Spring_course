package Dependency_Injection_and_Spring_Container_Configuration.T11_Dependency_inside_;

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
