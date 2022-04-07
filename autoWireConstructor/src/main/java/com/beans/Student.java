package com.beans;

public class Student {
    private  int id;
    private  String  name;
    private  Address add;


    public Student(int id, String name, Address add) {
        this.id = id;
        this.name = name;
        this.add = add;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", add=" + add +
                '}';
    }
}
