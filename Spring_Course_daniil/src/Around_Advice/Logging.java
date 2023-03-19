package Aspect_Oriented_Programming.JoinPoint;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(1)
public class Logging {
    @Before("Aspect_Oriented_Programming.JoinPoint.PointCut.allAddMethods()")
    public void beforeAddLoggingAdvice(JoinPoint joinPoint) {
        MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();
        System.out.println("methodSignature = " + methodSignature);
        System.out.println("methodSignature.getMethod() = " + methodSignature.getMethod());
        System.out.println("methodSignature.getReturnType() = " + methodSignature.getReturnType());
        System.out.println("methodSignature.getName() = " + methodSignature.getName());

        if(methodSignature.getName().equals("addBook")) {
            Object[] args = joinPoint.getArgs();
            for (Object obj:args) {
                if(obj instanceof Book) {
                    Book myBook = (Book) obj;
                    System.out.println("Info about book: name - " + myBook.getName() + ", author - "
                            + myBook.getAuthor() + ", year of publish - " + myBook.getYearOfPublication());
                }
                else if (obj instanceof String) {
                    System.out.println("Book has been added " + obj);
                }
            }
        }

        System.out.println("Logging ");
        System.out.println("-------------------------------------------");
    }
}
