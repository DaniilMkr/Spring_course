package Dependency_Injection_and_Spring_Container_Configuration.T8_Config_with_Annotation_Qualifier;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("personBean")
public class Person {


    private Pet pet;
    private String surname;


    public Person(@Qualifier("catBean") Pet pet) {
        System.out.println("Qualifier catBean");
        this.pet = pet;
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
