
package com.decipherzone.studentWebSpringmvc.dao;

import com.decipherzone.studentWebSpringmvc.beans.Student;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * @purpose - This class Process all the queries of database.
 */

public class Studentdao {


    private JdbcTemplate jdbcTemplate;

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    /**
     * @return list
     * @purpose - this method fetch all the record from database and return as a list.
     * @implnote - getAllEmployees method fetch all the records present in the student table using resultsetExtreactor and
     * return it as a list
     */
    public List<Student> getAllEmployees() {
        return jdbcTemplate.query("select * from student", new ResultSetExtractor<List<Student>>() {
            @Override
            public List<Student> extractData(ResultSet rs) throws SQLException, DataAccessException {

                List<Student> list = new ArrayList<Student>();
                while (rs.next()) {
                    Student student = new Student();
                    student.setId(rs.getInt(1));
                    student.setName(rs.getString(2));
                    student.setAge(rs.getInt(3));
                    list.add(student);
                }
                return list;
            }
        });
    }

    /**
     * @param id
     * @return
     * @Purpose - removeStudentDetails method remove the details of student using studentid.
     */

    public int removeStudentdetails(int id) {
        String sql = "delete from student where id=" + id + "";
        return jdbcTemplate.update(sql);

    }

    /**
     * @param student
     * @return
     * @purpose - This method update student details such as name and age using student id
     */
    public int updateStudentdetails(Student student) {
        String sql = "update student set name='" + student.getName() + "', age=" + student.getAge() + " where id=" + student.getId() + "";
        return jdbcTemplate.update(sql);
    }

    public Student getEmpById(int id) {
        String sql = "select * from student where id=?";
        return jdbcTemplate.queryForObject(sql, new Object[]{id}, new BeanPropertyRowMapper<Student>(Student.class));
    }

    public int addstudentdetails(Student student) {
        String sql = "insert into student(name,age) values('" + student.getName() + "'," + student.getAge() + ")";
        return jdbcTemplate.update(sql);
    }

}