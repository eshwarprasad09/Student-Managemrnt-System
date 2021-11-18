package com.eshwarprasad.service;

import com.eshwarprasad.entity.Student;

import java.util.List;

public interface StudentService {

    List<Student> getAllStudent();
    Student saveStudent(Student student);
    void deleteStudent(long id);
    Student getStudentById(Long id);
    Student updateStudent(Student student);

}
