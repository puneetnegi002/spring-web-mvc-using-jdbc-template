package com.decipherzone.studentWebSpringmvc.controllers;


import com.decipherzone.studentWebSpringmvc.beans.Student;
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

    @RequestMapping(value = "/")
    public ModelAndView viewform() {
        List<Student> list = studentdao.getAllEmployees();
        if (list.isEmpty()) {
            return new ModelAndView("viewform", "message", "No Record Found !!");
        } else {
            return new ModelAndView("viewform", "list", list);
        }
    }


    @RequestMapping(value = "/addstudent")
    public ModelAndView addstudent() {
        return new ModelAndView("addstudent", "command", new Student());
    }

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public ModelAndView save(@ModelAttribute("student") Student student) {
        studentdao.addstudentdetails(student);
        return new ModelAndView("redirect:/");
    }

    @RequestMapping(value = "/remove/{id}")
    public ModelAndView remove(@PathVariable int id) {
        studentdao.removeStudentdetails(id);
        return new ModelAndView("redirect:/");
    }

    @RequestMapping(value = "/update/{id}")
    public ModelAndView update(@PathVariable int id) {
        Student student = studentdao.getEmpById(id);
        return new ModelAndView("UpdateStudentDetails", "command", student);
    }

    @RequestMapping(value = "/updatestudent", method = RequestMethod.POST)
    public ModelAndView updatestudent(@ModelAttribute("student") Student student) {
        studentdao.updateStudentdetails(student);
        return new ModelAndView("redirect:/");
    }
}
