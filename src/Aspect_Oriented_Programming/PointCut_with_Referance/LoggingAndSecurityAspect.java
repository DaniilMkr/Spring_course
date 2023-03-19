package Aspect_Oriented_Programming.PointCut_with_Referance;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAndSecurityAspect {

    @Pointcut("execution(* get*())")
    private void allGetMethods() {
    }

    @Before("allGetMethods()") //Point cut
    public void beforeGetLoggingAdvice() {
        System.out.println("beforeGetLoggingAdvice: attempt to get book");
    }

    @Before("allGetMethods()")
    public void beforeGetSecurityAdvice()  {
        System.out.println("beforeGetSecurityAdvice: security check permission to get book or magazine");
    }
}
