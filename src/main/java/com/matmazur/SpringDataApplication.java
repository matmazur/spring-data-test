package com.matmazur;

import com.matmazur.model.Person;
import com.matmazur.repository.PersonRepository;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;
import java.util.List;

@Configuration
@ComponentScan
public class SpringDataApplication {

    public static void main(String[] args) {


        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringDataApplication.class);

        Person p1 = Person.builder().withName("Jack").withSurname("Strong").withAge(36).build();
        Person p2 = Person.builder().withName("John").withSurname("Doe").withAge(44).build();
        Person p3 = Person.builder().withName("Amy").withSurname("Ashley").withAge(22).build();
        List<Person> list = Arrays.asList(p1, p2, p3);
        PersonRepository repo = context.getBean(PersonRepository.class);
        repo.saveAll(list);


        repo.findAll().forEach(System.out::println);
    }
}