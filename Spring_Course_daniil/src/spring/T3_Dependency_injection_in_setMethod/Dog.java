package spring.T3_Dependency_injection_in_setMethod;


public class Dog implements Pet {
    @Override
    public void say() {
        System.out.println("Bow-wow");
    }

}
