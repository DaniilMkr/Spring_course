package Aspect_Oriented_Programming.PointCut_with_Parameters_with_Security_Checks;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAndSecurityAspect {
    @Before("execution(* get*())") //Point cut
    public void beforeGetLoggingAdvice() {
        System.out.println("beforeGetLoggingAdvice: attempt to get book");
    }

    @Before("execution(* get*())")
    public void beforeGetSecurityAdvice()  {
        System.out.println("beforeGetSecurityAdvice: security check permission to get book or magazine");
    }
}
