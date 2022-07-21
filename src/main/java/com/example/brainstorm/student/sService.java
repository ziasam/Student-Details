package com.example.brainstorm.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class sService {

    private final sRepository srepository;

    @Autowired
    public sService(sRepository srepository) {
        this.srepository = srepository;
    }

    public List<Student> getStudent() {
        return srepository.findAll();
    }

    public void addStudent(Student student) {
        Optional<Student> Optional = srepository.findStudentByEmail(student.getEmail());
        if(Optional.isEmpty())
        {
            srepository.save(student);
        }
        else {
            throw new IllegalStateException("Email Taken");
        }
    }
}
