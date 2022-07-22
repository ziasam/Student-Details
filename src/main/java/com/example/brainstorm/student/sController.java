package com.example.brainstorm.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;
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

    @PostMapping
    public void addNewStudent(@RequestBody Student student){
        sservice.addStudent(student);
    }

    @DeleteMapping(path= "{studentId}")
    public void deleteStudent(@PathVariable ("studentId") long studentId)
    {
        sservice.delStudent(studentId);
    }

    @PutMapping(path = "{studentId}")
    public void updateStudent(@PathVariable ("studentId") long studentId, @RequestParam(required = false) String name, @RequestParam(required = false) String email, @RequestParam(required = false) String subject)
    {
        sservice.upStudent(studentId, name, email, subject);
    }
}
