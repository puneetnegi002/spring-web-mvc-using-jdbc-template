package com.decipherzone.studentWebSpringmvc.dao;

import com.decipherzone.studentWebSpringmvc.Model.Student;

import java.util.List;

public interface StudentDao {

    List<Student> getAllStudents();

    void removeStudentdetails(int id);

    void updateStudentdetails(Student student);

    Student getEmpById(int id);

    void addstudentdetails(Student student);
}
