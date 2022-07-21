package com.example.brainstorm;

import com.example.brainstorm.student.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@SpringBootApplication
@RestController
public class BrainstormApplication {

	public static void main(String[] args) {
		SpringApplication.run(BrainstormApplication.class, args);
	}

	@GetMapping
	public List<Student> sBoot() {
		return List.of(new Student(
				1504082,
				"Sameer",
				"ziauddinsameer@gmail.com",
				25
		));
	}

}