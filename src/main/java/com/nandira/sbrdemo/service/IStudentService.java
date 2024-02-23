package com.nandira.sbrdemo.service;

import com.nandira.sbrdemo.model.Student;

import java.util.List;

public interface IStudentService {
    Student addStudent(Student student);
    List<Student> getStudents();
    Student getStudentById(Long id);
    Student updateStudent(Student student, Long id);
    void deleteStudent(Long id);


}
