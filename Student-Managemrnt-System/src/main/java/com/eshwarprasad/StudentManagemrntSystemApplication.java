package com.eshwarprasad;

import com.eshwarprasad.entity.Student;
import com.eshwarprasad.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StudentManagemrntSystemApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(StudentManagemrntSystemApplication.class, args);
	}

	@Autowired
	private StudentRepository studentRepository;

	public void run(String... args)throws Exception{
//		Student student1 = new Student("Ramesh", "fadatare", "ramesh@gmail.com");
//		studentRepository.save(student1);
//
//		Student student2 = new Student("Eshwar", "Prasad", "eshwarprasad@gmail.com");
//		studentRepository.save(student2);
//
//		Student student3 = new Student("Lion", "tiger", "liontiger@gmail.com");
//		studentRepository.save(student3);
	}

}
