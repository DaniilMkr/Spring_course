package spring;

import org.springframework.context.support.FileSystemXmlApplicationContext;

public class TEST9_Init_and_Destroy {
    public static void main(String[] args) {
        FileSystemXmlApplicationContext context =
                new FileSystemXmlApplicationContext("application9.xml");
        Person person = context.getBean("personBean", Person.class );
        person.callYourPet();
        Dog dog = context.getBean("dog", Dog.class);
        dog.init();
        dog.destroy();

        /*Cat cat = context.getBean( "cat",Cat.class);
        cat.say();*/
        context.close();

    }
}

