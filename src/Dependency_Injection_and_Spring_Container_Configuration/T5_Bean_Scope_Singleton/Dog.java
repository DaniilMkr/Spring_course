package Dependency_Injection_and_Spring_Container_Configuration.T5_Bean_Scope_Singleton;


public class Dog implements Pet {
    @Override
    public void say() {
        System.out.println("Bow-wow");
    }

}
