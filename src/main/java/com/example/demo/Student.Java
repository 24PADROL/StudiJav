package com.example.demo;

import java.util.ArrayList;
import java.util.List;

public class Student extends Person{
    
    private final int studentID;
    private List<Integer> grades;
    private double average;

    public Student(String name, int sutdentID, int age){
        super(name, age);
        this.studentID = studentID;
        this.grades = new ArrayList<>();
        this.average = 0;
    }

    public int getStudentID(){
        return studentID;
    }

    public List<Integer> getGrades(){
        return grades;
    }

    public void setGrades(List<Integer> grades){
        this.grades = grades;
    }

    public double getaverage(){
        return average;
    }

    public void setaverage(){
        this.average = average;
    }

    public void addGrade(Integer grade){
        grades.add(grade);
    }

    public void getAverageGrade(){
        int sum = 0;
        if (grades == null || grades.isEmpty()){
            System.out.println(getName() + "Doesn't have grade yet.");
        }else{
            for (Integer grade : grades){
                sum += grade;
            }
        double average = (double) sum / getGrades().size();
        System.out.println(getName() + "an averge grade of : " + Math.round(average * 100.0) / 100.0);
        average = Math.round(average * 100.0) / 100;
        }
    }

    @Override
    public void displayInfo(){
        System.out.println("Student Name:" + getName());
        System.out.println("Student Age: " + getAge());
        System.out.println("Student ID: " + sutdentID);
        System.out.println("Grade: " + grades);
        System.out.println("Average: " + average);
    }

}