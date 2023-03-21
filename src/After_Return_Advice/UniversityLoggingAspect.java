
package After_Return_Advice;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Aspect
public class UniversityLoggingAspect {

    @Before("execution(* getStudents())")
    public void beforeGetStudentsLoggingAdvice() {
        System.out.println("beforeGetStudentsLoggingAdvice: Logging student " + " before method getStudents");
    }

    @AfterReturning(pointcut = "execution(* getStudents())", returning = "students")
    public void afterReturningGetStudentsLoggingAdvice(List<Student> students) {
        Student firstStudents = students.get(0);
        String nameSurname = firstStudents.getNameSurname();
        nameSurname = "Mr. " + nameSurname;
        firstStudents.setNameSurname(nameSurname);

        double avgGrade = firstStudents.getAvgGrade();
        avgGrade = avgGrade + 1;
        firstStudents.setAvgGrade(avgGrade);
        System.out.println("afterReturningGetStudentsLoggingAdvice: Logging student " + " after execution of " +
                "method getStudents");
    }
}