package Dependency_Injection_and_Spring_Container_Configuration.T3_Dependency_injection_in_setMethod;

public class Cat implements Pet {

    public Cat() {
        System.out.println("Cat bean created ");
    }

    @Override
    public void say() {
        System.out.println("Meow-Meow");
    }
}
