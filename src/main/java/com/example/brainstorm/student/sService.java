package com.example.brainstorm.student;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class sService {
    public List<Student> getStudent() {
        return List.of(new Student(
                1504082,
                "Sameer",
                "ziauddinsameer@gmail.com",
                25
        ));
    }
}
