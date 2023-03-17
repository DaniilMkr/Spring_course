package spring.T7_Config_with_Annotation;

import org.springframework.context.support.FileSystemXmlApplicationContext;

public class TEST7_Config_with_Annotation {
    public static void main(String[] args) {
        FileSystemXmlApplicationContext context =
                new FileSystemXmlApplicationContext("application7.xml");
        Cat cat = context.getBean("catBean", Cat.class);
        cat.say();
        context.close();

    }
}

