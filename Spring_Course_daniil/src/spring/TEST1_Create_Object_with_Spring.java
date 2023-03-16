package spring;

import org.springframework.context.support.FileSystemXmlApplicationContext;

public class TEST1_Create_Object_with_Spring {
    public static void main(String[] args) {
        FileSystemXmlApplicationContext context = new FileSystemXmlApplicationContext("application1.xml");
        Pet pet = context.getBean("myPet", Pet.class);
        pet.say();
        context.close();
    }
}
