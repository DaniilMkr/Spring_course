package Dependency_Injection_and_Spring_Container_Configuration.T8_Config_with_Annotation_Qualifier;

import org.springframework.stereotype.Component;

@Component("dogBean")
public class Dog implements Pet {
    @Override
    public void say() {
        System.out.println("Bow-wow");
    }
}
