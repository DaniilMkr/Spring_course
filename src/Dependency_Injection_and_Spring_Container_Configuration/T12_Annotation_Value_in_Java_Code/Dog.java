package Dependency_Injection_and_Spring_Container_Configuration.T12_Annotation_Value_in_Java_Code;


public class Dog implements Pet {
    @Override
    public void say() {
        System.out.println("Bow-wow");
    }
}
