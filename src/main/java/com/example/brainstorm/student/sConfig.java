package com.example.brainstorm.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

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
                    25
            );
            Student Sayeed = new Student(
                    "Sayeed",
                    "saydulkader@gmail.com",
                    25
            );

            repository.saveAll(List.of(Sameer, Sayeed));
            //repository.deleteAll();
        };
    }
}
