package Dependency_Injection_and_Spring_Container_Configuration.T12_Annotation_Value_in_Java_Code;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Person {

    private Pet pet;
    @Value("${person.surname}")
    private String surname;

    public Person(String surname) {
        this.surname = surname;
    }

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
