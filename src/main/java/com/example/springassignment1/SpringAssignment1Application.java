package com.example.springassignment1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@SpringBootApplication
public class SpringAssignment1Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringAssignment1Application.class, args);
    }
}

@RestController
class CourseController {

    @GetMapping("/courses")
    public List<String> getComputerScienceCourses() {
        List<String> courses = Arrays.asList(
                "Foundation Courses",
                "CSC 111F",
                "CSC 121F",
                "Undergraduate Courses",
                "CSC 111",
                "CSC 121",
                "CSC 211",
                "CSC 212",
                "CSC 223",
                "Honours Courses",
               "CSC 501",
                "CSC 512",
                "CSC 513",
                "CSC 515"
        );
        return courses;
    }
}
