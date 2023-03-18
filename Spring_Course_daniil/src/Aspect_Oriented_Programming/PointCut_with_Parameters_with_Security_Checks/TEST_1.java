package Aspect_Oriented_Programming.PointCut_with_Parameters;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TEST_1 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(MyConfig.class);
        UniLibrary library = applicationContext.getBean("uniLibrary", UniLibrary.class);
        library.getBook(" War and peace ");

        applicationContext.close();

    }
}
