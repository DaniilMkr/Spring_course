package spring.T11_Spring_Dependency_with_Annotation_inside_Configuration_Class;


public class Dog implements Pet {
    @Override
    public void say() {
        System.out.println("Bow-wow");
    }

    public void init() {
    }

}
