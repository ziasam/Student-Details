package com.example.brainstorm.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.List;

@Configuration
public class sConfig {

    @Bean
    CommandLineRunner commandLineRunner(sRepository repository)
    {
        return args -> {
            Student Sameer = new Student(
                    "Sameer",
                    "ziauddinsameer@gmail.com",
                    "Science",
                    LocalDate.of(1997, 3, 19)

            );
            Student Sayeed = new Student(
                    "Sayeed",
                    "saydulkader@gmail.com",
                    "Science",
                    LocalDate.of(1996, 8, 19)
            );
            Student Suzan = new Student(
                    "Suzan",
                    "suzan@gmail.com",
                    "Science",
                    LocalDate.of(1996, 5, 19)
            );

            repository.saveAll(List.of(Sameer, Sayeed, Suzan));
            //repository.deleteAll();
        };
    }
}
