package Aspect_Oriented_Programming.JoinPoint;

import org.aspectj.lang.annotation.Pointcut;

public class PointCut {
    @Pointcut("execution(* add*(..))")
    public void allAddMethods() {
    }

}
