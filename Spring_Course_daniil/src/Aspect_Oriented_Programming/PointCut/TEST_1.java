package Aspect_Oriented_Programming.AOP;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TEST_1 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(MyConfig.class);
        Library library = applicationContext.getBean("myLibrary", Library.class);
        library.getBook();
        applicationContext.close();


    }
}
