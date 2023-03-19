package Dependency_Injection_and_Spring_Container_Configuration.T9_Init_and_Destroy;


public class Person {

    private Pet pet;
    private String surname;

    public void callYourPet () {
        System.out.println("Hello, my pet");
        pet.say();
    }

    public String getSurname () {
        return surname;
    }

    public void setSurname (String surname){
        System.out.println("Class person: set surname");
        this.surname = surname;
    }
}
