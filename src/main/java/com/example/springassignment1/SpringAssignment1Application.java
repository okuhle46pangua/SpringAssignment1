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

    @GetMapping("/computer-science-courses")
    public List<String> getComputerScienceCourses() {
        List<String> courses = Arrays.asList(
                "Foundation Course 1",
                "Foundation Course 2",
                "Undergraduate Course 1",
                "Undergraduate Course 2",
                "Undergraduate Course 3",
                "Undergraduate Course 4",
                "Undergraduate Course 5",
                "Honours Course 1",
                "Honours Course 2",
                "Honours Course 3",
                "Honours Course 4"
        );
        return courses;
    }
}
