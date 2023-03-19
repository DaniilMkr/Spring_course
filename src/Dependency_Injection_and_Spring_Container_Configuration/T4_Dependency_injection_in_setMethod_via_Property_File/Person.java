package Dependency_Injection_and_Spring_Container_Configuration.T4_Dependency_injection_in_setMethod_via_Property_File;

public class Person {

    private Pet pet;
    private String surname;

    public Person(Pet pet) {
        this.pet = pet;
    }

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

    public void setPet (Pet pet){
        System.out.println("Class Person: set pet");
        this.pet = pet;
    }
}
