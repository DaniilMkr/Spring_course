package Dependency_Injection_and_Spring_Container_Configuration.T11_Dependency_inside_;

public class Person {

    private Pet pet;
    private String surname;

    public Person(Pet pet) {
        System.out.println("Person bean created");
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
