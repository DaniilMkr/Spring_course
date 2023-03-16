package spring;

import org.springframework.context.support.FileSystemXmlApplicationContext;

public class TEST3_Dependency_injection_in_setMethod {
    public static void main(String[] args) {
        FileSystemXmlApplicationContext context =
                new FileSystemXmlApplicationContext("application3.xml");
        Person person = context.getBean("myPerson", Person.class);
        person.callYourPet();
        System.out.println(person.getSurname());
    }
}

