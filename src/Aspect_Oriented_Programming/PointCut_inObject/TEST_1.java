package Aspect_Oriented_Programming.PointCut_inObject;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TEST_1 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(MyConfig.class);
        UniLibrary library = applicationContext.getBean("uniLibrary", UniLibrary.class);
        Book book = applicationContext.getBean("book", Book.class);
        library.getBook(book);

        applicationContext.close();

    }
}
