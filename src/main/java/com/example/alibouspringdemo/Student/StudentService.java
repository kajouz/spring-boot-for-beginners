package com.example.alibouspringdemo.Student;

import java.util.List;

public interface StudentService {
    Student save(Student s);
    List<Student> findAllStudent();
    Student findByEmail(String Email);
    Student update(Student s);
    void delete(String email);


}
