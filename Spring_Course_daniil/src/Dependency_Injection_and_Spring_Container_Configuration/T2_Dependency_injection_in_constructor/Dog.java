package spring.T2_Dependency_injection_in_constructor;

public class Dog implements Pet {
    @Override
    public void say() {
        System.out.println("Bow-wow");
    }
}
