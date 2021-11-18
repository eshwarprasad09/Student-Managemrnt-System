package com.eshwarprasad.repository;

import com.eshwarprasad.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {

}
