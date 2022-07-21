package com.example.brainstorm.student;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface sRepository  extends JpaRepository<Student, Long> {
    //Select * from student where email = ?
    Optional<Student> findStudentByEmail(String email);
}
