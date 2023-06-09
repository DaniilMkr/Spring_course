package Dependency_Injection_and_Spring_Container_Configuration.T5_Bean_Scope_Singleton;

import org.springframework.context.support.FileSystemXmlApplicationContext;


public class TEST5_Bean_scope_singleton {
    public static void main(String[] args) {
        FileSystemXmlApplicationContext context =
                new FileSystemXmlApplicationContext("application5.xml");

        Dog dog = context.getBean("myPet", Dog.class);
        Dog myDog = context.getBean("myPet", Dog.class);

        System.out.println("Переменные ссылаются на один и тот же объект " + (myDog==dog));
        context.close();


    }
}

