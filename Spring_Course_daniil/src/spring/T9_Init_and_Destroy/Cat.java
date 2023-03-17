package spring.T9_Init_and_Destroy;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component("catBean")
public class Cat implements Pet {
    @Override
    public void say() {
        System.out.println("Meow-Meow");
    }
    @PostConstruct
    public void init() {
        System.out.println("Class Cat: init method");
    }
    @PreDestroy
    public void destroy() {
        System.out.println("Class Cat: destroy method");
    }


}
