package spring;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
// bean ID dog ->default
public class Dog implements Pet {
    @Override
    public void say() {
        System.out.println("Bow-wow");
    }
    @PostConstruct
    public void init() {
        System.out.println("Class Dog: init method");
    }
    @PreDestroy
    public void destroy() {
        System.out.println("Class Dog: destroy method");
    }
}
