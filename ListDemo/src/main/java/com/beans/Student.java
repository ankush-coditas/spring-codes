package com.beans;

public class Student {
    private String sname;
    private  String qualification;
    private  int aggregate;



    public Student(String sname, String qualification, int aggregate) {
        this.sname = sname;
        this.qualification = qualification;
        this.aggregate = aggregate;
    }

    @Override
    public String toString() {
        return "Student{" +
                "sname='" + sname + '\'' +
                ", qualification='" + qualification + '\'' +
                ", aggregate=" + aggregate +
                '}';
    }
}
