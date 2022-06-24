package com.example.demo2.Student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args -> {
            Student maria = new Student("maria",
                    "shawn@mail.com",
                    LocalDate.of(2001,
                            Month.JANUARY,04)
            );
            Student alex = new Student("maria",
                    "alex@mail.com",
                    LocalDate.of(2001,
                            Month.JANUARY,24));
            Student joe = new Student("joe",
                    "joe@mail.com",
                    LocalDate.of(2001,
                            Month.JANUARY,4));
            Student lisa = new Student("lisa",
                    "lisa@mail.com",
                    LocalDate.of(2001,
                            Month.JANUARY,14));
               repository.saveAll(List.of(maria,alex,joe,lisa)) ;
        };
    }
}
