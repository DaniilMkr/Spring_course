package Dependency_Injection_and_Spring_Container_Configuration.T3_Dependency_injection_in_setMethod;

import org.springframework.context.support.FileSystemXmlApplicationContext;

public class TEST3_Dependency_injection_in_setMethod {
    public static void main(String[] args) {
        FileSystemXmlApplicationContext context =
                new FileSystemXmlApplicationContext("application3.xml");
        Person person = context.getBean("myPerson", Person.class);
        person.callYourPet();
        context.close();
    }
}

