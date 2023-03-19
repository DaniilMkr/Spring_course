package Dependency_Injection_and_Spring_Container_Configuration.T9_Init_and_Destroy;

public class Dog implements Pet {
    @Override
    public void say() {
        System.out.println("Bow-wow");
    }

}
