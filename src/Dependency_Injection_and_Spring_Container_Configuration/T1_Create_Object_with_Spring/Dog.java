package Dependency_Injection_and_Spring_Container_Configuration.T1_Create_Object_with_Spring;

public class Dog implements Pet {
    @Override
    public void say() {
        System.out.println("Bow-wow");
    }
}
