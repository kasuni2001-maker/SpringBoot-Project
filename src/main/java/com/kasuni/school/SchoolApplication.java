package com.kasuni.school;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.kasuni.school.entity.Student;
import com.kasuni.school.repository.StudentRepository;

 
@SpringBootApplication
public class SchoolApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SchoolApplication.class, args);
	}

	@Autowired
	private StudentRepository studentRepository; 

	@Override
	public void run(String... args) throws Exception{
		// Student student1 = new Student("Ramesh", "Fadatare","ramesh2001@gmail.com");
		// studentRepository.save(student1);

		// Student student2 = new Student("Sanjaya","Jadhev","sanjay2001@gmail.com");
		// studentRepository.save(student2);

		// Student student3 = new Student("Tony","Stark","tony2001@gmail.com");
		// studentRepository.save(student3);


	}

}
 