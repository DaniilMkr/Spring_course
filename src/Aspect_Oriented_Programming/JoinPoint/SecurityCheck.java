package Aspect_Oriented_Programming.JoinPoint;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(2)
public class SecurityCheck {
    @Before("Aspect_Oriented_Programming.JoinPoint.PointCut.allAddMethods()")
    public void beforeAddSecurityCheckAdvice() {
        System.out.println("SecurityCheck");
        System.out.println("-------------------------------------------");
    }
}
