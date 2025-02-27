package com.example.demo;

import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Enrollment;

@RestController
@RequestMapping("/api")

public class StudentCourseController {
    private List<Student> students = List.of(
        new Student("John", 2 , 20),
        new Student("Jane", 2, 22),
        new Student("Lebron" , 3, 40)
    );
    
    private List<Course> courses = List.of(
        new Course("Math", 101, 3),
        new Course("History", 102, 4)
    );

    @GetMapping("/students")
    public List<Student> getAllSrStudents() {
        return students;
    }
    
    @GetMapping("/students/{id}")
    public Student getStudentById(@PathVariable int id) {
        return students.stream().filter(s -> s.getStudentID() == id).findFirst().orElse(null);
    }

    @PostMapping("/enroll")
    public String enrollStudent(@RequestBody Enrollment enrollment) {
        enrollment.register();
        return "Student enrolled successfully";
    }

    @GetMapping("/courses")
    public List<Course> getAllCourses() {
        return courses;
    }
}
