package Dependency_Injection_and_Spring_Container_Configuration.T2_Dependency_injection_in_constructor;

public class Dog implements Pet {
    @Override
    public void say() {
        System.out.println("Bow-wow");
    }
}
