package spring.T10_Spring_Configuration_with_Annotation;


public class Dog implements Pet {
    @Override
    public void say() {
        System.out.println("Bow-wow");
    }

}
