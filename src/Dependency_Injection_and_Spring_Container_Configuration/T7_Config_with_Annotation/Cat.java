package Dependency_Injection_and_Spring_Container_Configuration.T7_Config_with_Annotation;

import org.springframework.stereotype.Component;

@Component("catBean")
public class Cat implements Pet {

    public Cat() {
        System.out.println("Cat bean created ");
    }

    @Override
    public void say() {
        System.out.println("Meow-Meow");
    }
}
