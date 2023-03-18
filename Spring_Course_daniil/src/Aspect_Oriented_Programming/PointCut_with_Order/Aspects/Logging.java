package Aspect_Oriented_Programming.PointCut_with_Order;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(1)
public class Logging {

    @Pointcut("execution(* get*())")
    public void logging() {
        System.out.println("logging");
    }
}
