package com.example.brainstorm.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
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

    public void delStudent(long studentId) {
        boolean i = srepository.existsById(studentId);
        if(i==true)
        {
            srepository.deleteById(studentId);
        }
        else
        {
            throw new IllegalStateException("No student by this id");
        }
    }

    @Transactional
    public void upStudent(long studentId, String name, String email) {
        Student stud = srepository.findById(studentId).orElseThrow(() -> new IllegalStateException("No student By this id"));

        if(name != null && name.length() > 0)
        {
            stud.setName(name);
        }

        if(email != null && email.length() > 0)
        {
            Optional<Student> student = srepository.findStudentByEmail(email);
            if(student.isEmpty()) {
                stud.setEmail(email);
            }
            else
            {
                throw new IllegalStateException("Email is taken");
            }
        }
    }
}
