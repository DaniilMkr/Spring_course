package spring.T12_Annotation_Value_in_Java_Code;


public class Cat implements Pet {

    public Cat() {
        System.out.println("Cat bean created ");
    }


    @Override
    public void say() {
        System.out.println("Meow-Meow");
    }
}
