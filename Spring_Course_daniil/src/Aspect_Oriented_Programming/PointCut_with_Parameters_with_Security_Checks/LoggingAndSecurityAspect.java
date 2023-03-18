package Aspect_Oriented_Programming.PointCut_with_Parameters_with_Security_Checks;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAspect {
    @Before("execution(* get*())") //Point cut
    public void beforeGetBookAdvice() {
        System.out.println("beforeGetBookAdvice: attempt to get book");
    }
}
