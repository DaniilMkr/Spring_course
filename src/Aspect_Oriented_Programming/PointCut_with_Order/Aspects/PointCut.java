package Aspect_Oriented_Programming.PointCut_with_Order.Aspects;

import org.aspectj.lang.annotation.Pointcut;

public class PointCut {
    @Pointcut("execution(* get*())")
    public void allGetMethods() {
    }

}
