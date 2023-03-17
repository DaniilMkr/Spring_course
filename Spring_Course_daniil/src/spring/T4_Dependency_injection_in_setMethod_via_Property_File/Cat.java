package spring.T4_Dependency_injection_in_setMethod_via_Property_File;

public class Cat implements Pet {

    public Cat() {
        System.out.println("Cat bean created ");
    }


    @Override
    public void say() {
        System.out.println("Meow-Meow");
    }
}
