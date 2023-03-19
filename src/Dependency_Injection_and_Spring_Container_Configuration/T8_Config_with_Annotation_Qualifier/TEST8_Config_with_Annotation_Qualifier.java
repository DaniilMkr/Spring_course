package Dependency_Injection_and_Spring_Container_Configuration.T8_Config_with_Annotation_Qualifier;

import org.springframework.context.support.FileSystemXmlApplicationContext;

public class TEST8_Config_with_Annotation_Qualifier {
    public static void main(String[] args) {
        FileSystemXmlApplicationContext context =
                new FileSystemXmlApplicationContext("application8.xml");
        Person person = context.getBean("personBean", Person.class);
        Pet pet = context.getBean( "catBean",Cat.class);
        pet.say();
        context.close();

    }
}

