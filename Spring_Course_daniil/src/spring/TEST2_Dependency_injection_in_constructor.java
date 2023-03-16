package spring;

import org.springframework.context.support.FileSystemXmlApplicationContext;

public class TEST2_Dependency_injection_in_constructor {
    public static void main(String[] args) {
        FileSystemXmlApplicationContext context =
                new FileSystemXmlApplicationContext("application2.xml");
        Pet pet = context.getBean("myPet", Pet.class);
        Person person = context.getBean("person", Person.class);
        person.callYourPet();
    }
}
