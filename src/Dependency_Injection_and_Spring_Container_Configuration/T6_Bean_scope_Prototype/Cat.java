package Dependency_Injection_and_Spring_Container_Configuration.T6_Bean_scope_Prototype;


public class Cat implements Pet {

    public Cat() {
        System.out.println("Cat bean created ");
    }

    @Override
    public void say() {
        System.out.println("Meow-Meow");
    }
}
