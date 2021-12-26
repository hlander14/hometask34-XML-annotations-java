package by.overone.contain1way;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component("myDog")
@Scope("singleton")
public class Dog implements Pet {
    @Override
    public void say() {
        System.out.println("Gawwww");
    }

    @PostConstruct
    public void postConstruct() {
        System.out.println("Dog is created");
    }

    @PreDestroy
    public void preDestroy() {
        System.out.println("Dog is destroyed");
    }
}
