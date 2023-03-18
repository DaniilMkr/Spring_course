package spring.T1_Create_Object_with_Spring;

public class Cat implements Pet {

    public Cat() {
        System.out.println("Cat bean created ");
    }
    @Override
    public void say() {
        System.out.println("Meow-Meow");
    }
}
