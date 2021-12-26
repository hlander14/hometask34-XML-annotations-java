package by.overone.contain2way;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("by.overone.contain2way")
public class MyConfig {
    @Bean("myDog")
    public Dog dog() {
        return new Dog();
    }

    @Bean("myPerson")
    public Person person() {
        return new Person(dog());
    }
}
