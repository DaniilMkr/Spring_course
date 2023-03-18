package spring.T10_Spring_Configuration_with_Annotation;

public class Cat implements Pet {

    public Cat() {
        System.out.println("Cat bean created ");
    }
    @Override
    public void say() {
        System.out.println("Meow-Meow");
    }
}
