package com.example.demo;

import java.util.List;
import java.util.ArrayList;


public class Course{
    private final String courseName;
    private final int courseCode;
    private final int creditHours;
    private List<Student> students;

    public Course(String courseName, int courseCode, int creditHours){
        this.courseName = courseName;
        this.courseCode = courseCode;
        this.creditHours = creditHours;
        this.students = new ArrayList<>();
    }

    public String getCourseName() {
        return courseName;
    }
    
    public int getCourseCode() {
        return courseCode;
    }

    public int getCreditHours;
        return creditHours;

}