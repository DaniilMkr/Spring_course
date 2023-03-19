package Around_Advice;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class Logging {

    @Around("execution(public String returnBook())")
    public Object aroundReturnBookLoggingAdvice(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("aroundReturnBookLoggingAdvice: attempt return book to library ");

        long begin = System.currentTimeMillis();
        Object targetMethodResult = proceedingJoinPoint.proceed();
        long end = System.currentTimeMillis();
        long timeOfMethod = end - begin;

        System.out.println("aroundReturnBookLoggingAdvice: book has been successfully returned to library ");
        System.out.println("aroundReturnBookLoggingAdvice: Method returnBook() executed for " + timeOfMethod + " milliseconds");
        return targetMethodResult;
    }
}
