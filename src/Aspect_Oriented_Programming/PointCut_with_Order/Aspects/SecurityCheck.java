package Aspect_Oriented_Programming.PointCut_with_Order.Aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(2)
public class SecurityCheck {
    @Before("Aspect_Oriented_Programming.PointCut_with_Order.Aspects.PointCut.allGetMethods()")
    public void securityCheck() {
        System.out.println("SecurityCheck from ");
    }
}
