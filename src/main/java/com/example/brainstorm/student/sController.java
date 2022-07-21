package com.example.brainstorm.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/student")
public class sController {
    private final sService sservice;

    @Autowired
    public sController(sService sservice) {
        this.sservice = sservice;
    }

    @GetMapping
    public List<Student> getStudent() {
        return sservice.getStudent();
    }
}
