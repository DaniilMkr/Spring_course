
package After_Throwing_Advice;

import After_Return_Advice.Student;
import After_Return_Advice.University;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class Test {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(MyConfig.class);
        University university = context.getBean("university", University.class);
        university.addStudents();
        try {
            List<Student> students = university.getStudents();
            System.out.println(students);

        } catch (IndexOutOfBoundsException e) {
            System.out.println(e + " exception appeared");
            e.fillInStackTrace();
        }


        context.close();
    }
}