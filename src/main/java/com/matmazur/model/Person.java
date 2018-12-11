package com.matmazur.model;

import javax.persistence.*;
import java.util.Locale;

@Entity
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_person")
    private Long id;
    private String name;
    private String surname;
    private Integer age;

    public static Builder builder() {
        return new Builder();
    }

    public Person(String name, String surname, Integer age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public Person() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                '}';
    }

    public static class Builder {

        private String name;
        private String surname;
        private Integer age;

        public Builder withName(String name) {
            this.name = name;
            return new Builder();
        }

        public Builder withSurname(String surname) {
            this.surname = surname;
            return new Builder();
        }

        public Builder withAge(Integer age) {
            this.age = age;
            return new Builder();
        }

        public Person build(){
            return new Person(name,surname,age);
        }
    }
}
