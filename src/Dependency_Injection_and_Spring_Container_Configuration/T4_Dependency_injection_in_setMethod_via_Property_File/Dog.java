package Dependency_Injection_and_Spring_Container_Configuration.T4_Dependency_injection_in_setMethod_via_Property_File;


public class Dog implements Pet {
    @Override
    public void say() {
        System.out.println("Bow-wow");
    }
}
