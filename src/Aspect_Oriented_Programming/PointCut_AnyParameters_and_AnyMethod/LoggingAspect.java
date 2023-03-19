package Aspect_Oriented_Programming.PointCut_AnyParameters_and_AnyMethod;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAspect {

    @Before("execution(public void *(*))") //If any parameters and as many as required then
    // @Before("execution(public void *(..))")
    public void beforeGetBookAdvice() {
        System.out.println("beforeGetBookAdvice: attempt to get book");
    }

}
