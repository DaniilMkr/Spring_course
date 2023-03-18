package Aspect_Oriented_Programming.PointCut;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAspect {

    @Before("execution(public void Aspect_Oriented_Programming.PointCut.UniLibrary.getBook())") //Point cut
    public void beforeGetBookAdvice() {
        System.out.println("PointCut suit UniLibrary class only since it is define \nbeforeGetBookAdvice: attempt to get book");
    }

    @Before("execution(public void addBook())")
    public void beforeAddTheBook() {
        System.out.println("PointCut suit any class since that is not define");
        System.out.println("beforeAddTheBook: attempt to add book");
    }

    @Before("execution(public void returnBook())")
    public void returnBook() {
        System.out.println("PointCut suit any class since that is not define");
        System.out.println("beforeAddTheBook: attempt to return book");
    }
}
