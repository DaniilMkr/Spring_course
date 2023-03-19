package Dependency_Injection_and_Spring_Container_Configuration.T9_Init_and_Destroy;


import org.springframework.context.support.FileSystemXmlApplicationContext;

public class TEST9_Init_and_Destroy {
    public static void main(String[] args) {
        FileSystemXmlApplicationContext context =
                new FileSystemXmlApplicationContext("application9.xml");
        Cat cat = context.getBean("catBean", Cat.class);
        cat.init();
        cat.say();
        cat.destroy();
        context.close();

    }
}

