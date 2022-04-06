package com.beans;

import java.util.List;

public class Batch {
    private String coursename;
    private  int batchcode;
    private List<Student> students;

    public Batch(String coursename, int batchcode) {
        this.coursename = coursename;
        this.batchcode = batchcode;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public void display(){

        System.out.println("batchcode is ::" +batchcode);
        System.out.println("Course name is ::"+coursename);
        System.out.println("The list of Student is ::");
        for (Student li : students) {
            System.out.println(li.toString());
        }
    }
}
