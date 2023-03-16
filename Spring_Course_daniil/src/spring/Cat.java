package spring;

import org.springframework.stereotype.Component;

@Component("cat")
public class Cat implements Pet {

    public Cat() {
        System.out.println("Cat bean created ");
    }


    @Override
    public void say() {
        System.out.println("Meow-Meow");
    }
}
