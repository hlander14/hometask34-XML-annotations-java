package by.overone.contain1way;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MyApp1Way {
    public static void main(String[] args) {
        //This is a first way with config class
        System.out.println("First way");
        AnnotationConfigApplicationContext context =
            new AnnotationConfigApplicationContext(MyConfig.class);
        Person person = context.getBean("myPerson", Person.class);
        System.out.println(person);
    }
}
