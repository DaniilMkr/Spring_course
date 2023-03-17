package spring.T6_Bean_scope_Prototype;

import org.springframework.context.support.FileSystemXmlApplicationContext;

public class TEST6_Bean_scope_Prototype {
    public static void main(String[] args) {
        FileSystemXmlApplicationContext context =
                new FileSystemXmlApplicationContext("application6.xml");

        Dog dog = context.getBean("myPet", Dog.class);
        Dog myDog = context.getBean("myPet", Dog.class);
        System.out.println("Переменные ссылаются на один и тот же объект " + (myDog==dog));
        context.close();

    }
}

