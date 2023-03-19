package Aspect_Oriented_Programming.PointCut_inObject;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAspect {
    @Before("execution(public void getBook(Aspect_Oriented_Programming.PointCut_inObject.Book))") //Point cut
    public void beforeGetBookAdvice() {
        System.out.println("beforeGetBookAdvice: attempt to get book");
    }

}
