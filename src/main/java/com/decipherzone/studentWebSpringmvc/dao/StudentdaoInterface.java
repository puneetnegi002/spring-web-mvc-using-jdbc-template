package com.decipherzone.studentWebSpringmvc.dao;

import com.decipherzone.studentWebSpringmvc.Model.Student;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public interface StudentdaoInterface {
    void setJdbcTemplate(JdbcTemplate jdbcTemplate);

    List<Student> getAllStudents();

    void removeStudentdetails(int id);

    void updateStudentdetails(Student student);

    Student getEmpById(int id);

    void addstudentdetails(Student student);
}
