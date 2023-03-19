package Dependency_Injection_and_Spring_Container_Configuration.T11_Dependency_inside_;


public class Dog implements Pet {
    @Override
    public void say() {
        System.out.println("Bow-wow");
    }

    public void init() {
    }

}
