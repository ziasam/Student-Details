package com.example.brainstorm.student;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface sRepository  extends JpaRepository<Student, Long> {

}
