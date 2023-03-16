package spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class TEST7_Config_with_Annotation {
    public static void main(String[] args) {
        FileSystemXmlApplicationContext context =
                new FileSystemXmlApplicationContext("application7.xml");
        Person person = context.getBean("personBean", Person.class );
        person.callYourPet();

        /*Cat cat = context.getBean( "cat",Cat.class);
        cat.say();*/
        context.close();

    }
}

