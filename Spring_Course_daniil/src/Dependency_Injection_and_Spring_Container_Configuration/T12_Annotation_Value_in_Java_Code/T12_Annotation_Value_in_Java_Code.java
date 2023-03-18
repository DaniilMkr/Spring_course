package spring.T12_Annotation_Value_in_Java_Code;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class T12_Annotation_Value_in_Java_Code {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(MyConfig.class);

        Person person = context.getBean("personBean", Person.class);
        System.out.println(person.getSurname());
        context.close();

    }
}
