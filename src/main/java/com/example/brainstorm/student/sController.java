package com.example.brainstorm.student;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/student")
public class sController {
    @GetMapping
    public List<Student> getStudent() {
        return List.of(new Student(
                1504082,
                "Sameer",
                "ziauddinsameer@gmail.com",
                25
        ));
    }
}
