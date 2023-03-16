package spring;

import org.springframework.context.support.FileSystemXmlApplicationContext;

public class TEST8_Config_with_Annotation_Qualifier {
    public static void main(String[] args) {
        FileSystemXmlApplicationContext context =
                new FileSystemXmlApplicationContext("application8.xml");
        Person person = context.getBean("personBean", Person.class );
        person.callYourPet();

        /*Cat cat = context.getBean( "cat",Cat.class);
        cat.say();*/
        context.close();

    }
}

