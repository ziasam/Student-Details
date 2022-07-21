package com.example.brainstorm.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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
}
