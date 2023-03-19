package Dependency_Injection_and_Spring_Container_Configuration.T10_Spring_Configuration_with_Annotation;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class TEST10_Spring_Configuration_with_AnnotationConfigApplicationContext {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(MyConfig.class);
        Person person = context.getBean("personBean", Person.class);
        person.callYourPet();
        context.close();
    }
}
