package Dependency_Injection_and_Spring_Container_Configuration.T2_Dependency_injection_in_constructor;

public class Cat implements Pet {

    public Cat() {
        System.out.println("Cat bean created ");
    }

    @Override
    public void say() {
        System.out.println("Meow-Meow");
    }
}
