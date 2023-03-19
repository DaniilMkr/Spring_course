package Dependency_Injection_and_Spring_Container_Configuration.T6_Bean_scope_Prototype;


public class Dog implements Pet {
    @Override
    public void say() {
        System.out.println("Bow-wow");
    }

}
