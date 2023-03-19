package Aspect_Oriented_Programming.JoinPoint;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(3)
public class ExceptionHandling {
    @Before("Aspect_Oriented_Programming.JoinPoint.PointCut.allAddMethods()")
    public void beforeAddExceptionAdvice() {
        System.out.println("Catching all execution ");
        System.out.println("-------------------------------------------");
    }
}
