package com.example.demo;

public class Teacher extends Person{
    private final int teacherID;
    private String subject;

    public Teacher(String name, int age, int teacherID) {
        super(name, age);
        this.teacherID = teacherID;
    }

    public int getTeacherID(){
        return teacherID;
    }

    public String getSubject(){
        return subject;
    }

    public void assignCourse(Course course){
        this.subject = course.getCourseName();
    }

    @Override
    public void displayInfo(){
        System.out.println("Teacher Name: " + getName());
        System.out.println("Teacher Age: " + getAge());
        System.out.println("Teacher ID: " + getTeacherID());
        System.out.println("Subject: " + subject);
    }
}
