package com.matmazur.app;

import com.matmazur.model.Person;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;
import java.util.List;

@Configuration
@ComponentScan
public class SpringDataApplication {

    AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringDataApplication.class);

    List<Person> list  = Arrays.asList();
}
