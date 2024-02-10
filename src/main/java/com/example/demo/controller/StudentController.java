package com.example.demo.controller;

import com.example.demo.bean.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class StudentController {
    @GetMapping("/student")
    public Student getStudent(){
        return new Student("Ram", "Ram");
    }

     //--@GetMapping annotation Return List--
//    @GetMapping("/students")
//    public List<Student> getStudent(){
//        List<Student> students = new ArrayList<>();
//        students.add(new Student("Ramesh", "Kumar"));
//        students.add(new Student("Aman", "Dhankar"));
//        students.add(new Student("Ramu", "Ram"));
//        students.add(new Student("Akhilesh", "Kumar"));
//        return students;
//    }

    //--@PathVariable annotation--
//    @GetMapping("/student/{firstName}/{lastName}/")
//    public Student studentPathVariable(@PathVariable("firstName") String firstName,
//                                       @PathVariable("lastName") String lastName){
//        return new Student(firstName, lastName);
//    }

    //--build rest API to handle query parameters--
//    @GetMapping("/student/query")
//    public Student studentQueryParam(@RequestParam(name = "firstName") String firstName,
//                                     @RequestParam(name = "lastName") String lastName){
//        return new Student(firstName, lastName);
//    }
}
