package Dependency_Injection_and_Spring_Container_Configuration.T4_Dependency_injection_in_setMethod_via_Property_File;

import org.springframework.context.support.FileSystemXmlApplicationContext;


public class TEST4_Dependency_injection_in_setMethod_via_Property_File {
    public static void main(String[] args) {
        FileSystemXmlApplicationContext context =
                new FileSystemXmlApplicationContext("application4.xml");
        Person person = context.getBean("myPerson", Person.class);
        person.callYourPet();
        System.out.println(person.getSurname());
        context.close();

    }
}

