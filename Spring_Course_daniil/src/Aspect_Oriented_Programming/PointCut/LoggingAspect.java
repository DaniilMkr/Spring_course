package Aspect_Oriented_Programming.AOP;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAspect {

    @Before("execution(public void getBook())") //Point cut
    public void beforeGetBookAdvice() {
        System.out.println("beforeGetBookAdvice: attempt to get book");
    }
}
