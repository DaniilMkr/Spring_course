package spring;

import org.springframework.context.support.FileSystemXmlApplicationContext;

public class TEST4_Dependency_injection_in_setMethod_via_propperty_file {
    public static void main(String[] args) {
        FileSystemXmlApplicationContext context =
                new FileSystemXmlApplicationContext("application4.xml");
        Person person = context.getBean("myPerson", Person.class);
        person.callYourPet();
        System.out.println(person.getSurname());
    }
}

