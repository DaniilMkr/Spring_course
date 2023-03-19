package Dependency_Injection_and_Spring_Container_Configuration.T12_Annotation_Value_in_Java_Code;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;


@Configuration
@PropertySource("file:C:\\Users\\Daniil\\Git\\Practice\\Spring_Course_daniil\\myApp.properties")
public class MyConfig {

    @Bean
    public Pet catBean() {
        return new Cat();
    }

    @Bean
    public Person personBean() {
        return new Person(catBean());
    }

}
