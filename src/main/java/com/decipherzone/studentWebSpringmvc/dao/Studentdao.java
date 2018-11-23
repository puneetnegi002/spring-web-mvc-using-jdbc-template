
package com.decipherzone.studentWebSpringmvc.dao;

import com.decipherzone.studentWebSpringmvc.Model.Student;
import org.apache.log4j.Logger;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * This class Process all the queries of database.
 */

public class Studentdao implements StudentdaoInterface {

    private final static Logger logger = Logger.getLogger(Studentdao.class);
    private JdbcTemplate jdbcTemplate;

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    /**
     * @return list
     * @Purpose - this method fetch all the record from database and return as a list.
     * @implnote - getAllEmployees method fetch all the records present in the student table using resultsetExtreactor and
     * return it as a list
     */
    public List<Student> getAllStudents() {
        return jdbcTemplate.query("select * from student", new ResultSetExtractor<List<Student>>() {
            @Override
            public List<Student> extractData(ResultSet rs) throws SQLException, DataAccessException {

                List<Student> list = new ArrayList<>();
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
     * @param id - removeSTudentdetails method receives id as parameter
     * @Purpose - removeStudentDetails method remove the details of student using studentid.
     */

    public void removeStudentdetails(int id) {

        String sql = "delete from student where id=" + id + "";
        logger.info(sql);
        jdbcTemplate.update(sql);

    }

    /**
     * @param student - Updatestudentdetailsmethod student object as parameter.
     * @Purpose - This method update student details such as name and age using student id
     */
    public void updateStudentdetails(Student student) {
        String sql = "update student set name='" + student.getName() + "', age=" + student.getAge() + " where id=" + student.getId() + "";

        logger.info(sql);

        jdbcTemplate.update(sql);
    }

    /**
     * @param id - getEmpByID receives student id as parameter
     * @return student
     * @Purpose - This method fetch the record od a student using student id from database
     */
    public Student getEmpById(int id) {
        String sql = "select * from student where id=?";
        logger.info(sql);
        return jdbcTemplate.queryForObject(sql, new Object[]{id}, new BeanPropertyRowMapper<>(Student.class));
    }

    /**
     * @param student - this method receives student object as parameter.
     * @Purpose - This method insert the records of a student into the database.\
     * records are inserted by user.
     */

    public void addstudentdetails(Student student) {
        String sql = "insert into student(name,age) values('" + student.getName() + "'," + student.getAge() + ")";
        logger.info(sql);
        jdbcTemplate.update(sql);
    }

}