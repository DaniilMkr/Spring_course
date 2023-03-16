package spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("personBean")
public class Person {

    @Autowired
    @Qualifier("cat")
    private Pet pet;
    private String surname;

    /*@Autowired
    public Person(Pet pet) {
        System.out.println("Person bean");
        this.pet = pet;
    }*/

    public void callYourPet() {
        System.out.println("Hello, my pet");
        pet.say();
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        System.out.println("Class person: set surname");
        this.surname = surname;
    }

    public void setPet(Pet pet) {
        System.out.println("Class Person: set pet");
        this.pet = pet;
    }
}
