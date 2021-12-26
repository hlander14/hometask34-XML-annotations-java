package by.overone.contain2way;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MyApp2Way {
    public static void main(String[] args) {
        //This is a second way with config class
        System.out.println("Second way");
        AnnotationConfigApplicationContext context =
            new AnnotationConfigApplicationContext(MyConfig.class);
        Person person = context.getBean("myPerson", Person.class);
        System.out.println(person);
    }
}
