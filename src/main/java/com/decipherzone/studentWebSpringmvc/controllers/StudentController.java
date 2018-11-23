package com.decipherzone.studentWebSpringmvc.controllers;


import com.decipherzone.studentWebSpringmvc.Model.Student;
import com.decipherzone.studentWebSpringmvc.dao.Studentdao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;


@Controller
public class StudentController {

    @Autowired
    Studentdao studentdao;


    /**
     * @return ModelAndView object
     * -if the list is empty it rediercts to viewform page with an error message.
     * -if the list if filled it redirect to viewform jsp page withe the student records
     * @Purpose - ViewForm method calls the getallemployee method of studentdao call to get all student records
     * The fetched records are put in a list.
     */
    @RequestMapping(value = "/")
    public ModelAndView viewform() {
        List<Student> list = studentdao.getAllStudents();
        if (list.isEmpty()) {
            return new ModelAndView("viewform", "message", "No Record Found !!");
        } else {
            return new ModelAndView("viewform", "list", list);
        }
    }

    /**
     * @return ModelAndView object with addstudent viewname and student object.
     * @Purpose - This method is called when the "addstudent" button is clicked . It redirect to addstudent.jsp page
     */
    @RequestMapping(value = "/addstudent")
    public ModelAndView addstudent() {
        return new ModelAndView("addstudent", "command", new Student());
    }


    /**
     * @param student - receives the student object
     * @return ModalAndView Object which redirect it to the display page.
     * @Purpose - this methhod is called when user click on save button of addstudent.jsp page. it Adds the details enter
     * by the user to student object and calls the addstudentdetails method of studentdai class.
     */
    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public ModelAndView save(@ModelAttribute("student") Student student) {
        studentdao.addstudentdetails(student);
        return new ModelAndView("redirect:/");
    }

    /**
     * @param id- recieves student id as parameter.
     * @return ModelAndView object whic redirect it to display page after removing the student details.
     * @Purpose - This method remove the details of the student according to the student id received by the method as parameter.
     */
    @RequestMapping(value = "/remove/{id}")
    public ModelAndView remove(@PathVariable int id) {
        studentdao.removeStudentdetails(id);
        return new ModelAndView("redirect:/");
    }

    /**
     * @param id- receives student id as parameter.
     * @return ModelandView object which redirect to updatestudentdetails with the student object.
     * @Purpose - This method update the student details according to the student id received by the method as parameter.
     */

    @RequestMapping(value = "/update/{id}")
    public ModelAndView update(@PathVariable int id) {
        Student student = studentdao.getEmpById(id);
        return new ModelAndView("UpdateStudentDetails", "command", student);
    }

    /**
     * @param student - receives student object as parameter.
     * @return ModelAndView object which redirect to display page.
     * @Purpose - this method update the student details based on student id.
     */
    @RequestMapping(value = "/updatestudent", method = RequestMethod.POST)
    public ModelAndView updatestudent(@ModelAttribute("student") Student student) {
        studentdao.updateStudentdetails(student);
        return new ModelAndView("redirect:/");
    }
}
