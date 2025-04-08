package com.group4.SpringAssignement1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/courses")
public class CourseController {

    @Autowired
    CourseSelector courses;


    @GetMapping("/foundation")
    public Map<String, String[]> getFoundationCourses() {
        return Map.of(
                "Foundation Courses",courses.getFoundationModules());
    }

    @GetMapping("/undergraduate")
    public Map<String, String[]> getUndergraduateCourses()
    {
        return Map.of(
                "Undergraduate Courses",courses.getUndergraduateModules());
    }

    @GetMapping("/honors")
    public Map<String, String[]> getHonorsCourses()
    {
        return Map.of(
                "Honors Courses",courses.getHonorsModules());
    }

    @GetMapping("/all")
    public Map<String, String[]> getAllData() {
        return Map.of(
                "Foundation Courses", courses.getFoundationModules(),
                "Undergraduate Courses", courses.getUndergraduateModules(),
                "Honors Courses", courses.getHonorsModules()
        );
    }

}
