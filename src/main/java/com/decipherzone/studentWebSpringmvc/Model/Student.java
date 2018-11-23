package com.decipherzone.studentWebSpringmvc.Model;


/**
 * Purpose: Stusent class for getter and setter methods
 */
public class Student {
    private String name;
    private int id;
    private int age;

    public Student() {
    }

    /**
     * Getname method to get name
     *
     * @return Student name
     */

    public String getName() {
        return name;
    }

    /**
     * setname method to Set Student Name
     *
     * @param name - Student name
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * getid method to get id
     *
     * @return Student Id
     */

    public int getId() {
        return id;
    }

    /**
     * setId method to set student id
     *
     * @param id - Student Id
     */

    public void setId(int id) {
        this.id = id;
    }

    /**
     * getAge method to get student Age
     *
     * @return Student Age
     */

    public int getAge() {
        return age;
    }

    /**
     * setAge method to set student Age
     *
     * @param age - Student Age
     */

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {

        return id + " " + name + "    " + age;
    }
}