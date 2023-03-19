package Dependency_Injection_and_Spring_Container_Configuration.T5_Bean_Scope_Singleton;

public class Cat implements Pet {

    public Cat() {
        System.out.println("Cat bean created ");
    }

    @Override
    public void say() {
        System.out.println("Meow-Meow");
    }
}
