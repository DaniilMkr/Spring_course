package Aspect_Oriented_Programming.PointCut;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TEST_1 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(MyConfig.class);
        UniLibrary library = applicationContext.getBean("uniLibrary", UniLibrary.class);
        SchoolLibrary schoolLibrary = applicationContext.getBean("schoolLibrary", SchoolLibrary.class);
        library.getBook();
        library.addBook();
        library.returnBook();

        System.out.println("\n");

        schoolLibrary.getBook();
        schoolLibrary.addBook();
        schoolLibrary.returnBook();


        applicationContext.close();

    }
}
