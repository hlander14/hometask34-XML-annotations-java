package by.overone.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Locale;

public class MyApp {
    public static void main(String[] args) {
        //Task items from 1 to 9
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");
        Person person = context.getBean("myPerson", Person.class);
        System.out.println(person);
    }
}
