package Aspect_Oriented_Programming.PointCut_with_Parameters_with_Security_Checks;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TEST_1 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(MyConfig.class);
        UniLibrary library = applicationContext.getBean("uniLibrary", UniLibrary.class);
        //Book book = applicationContext.getBean("book", Book.class);

        library.getBook();
        library.getMagazine();


        applicationContext.close();

    }
}
