package com.group4.SpringAssignement;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


@RestController
@Service
public class CourseSelector {

    // Initialize with three different arrays
    List<Courses> courses = new ArrayList<>();

    public CourseSelector() {
        // Initialize with 3 arrays containing 2, 4, and 5 items respectively
        courses.add(new Courses("Foundation Courses", new String[]{"Computer Literacy for Science", "Introduction to Programming Concepts"}));
        courses.add(new Courses("Undergraduate Courses", new String[]{"Data Structure & Algorithms", "Introduction to Computer Networks", "Software Engineering","Elementary Computer Programming","Computer Architecture and Organisation"}));
        courses.add(new Courses("Honors Courses", new String[]{"Advanced Algorithms", "Intelligent Systems", "Distributed and Parallel Computing", "Advanced Java"}));
    }
    
    @Autowired
    public void setFoundationModules() {
        courses.setFoundationCourses(FoundationCourses);

    }

    public String[] getFoundationModules() {
        return courses.getFoundationCourses();
    }
 return foundCourse.map(ResponseEntity::ok)
                 .orElse(ResponseEntity.notFound().build());
     }
 
     public void createCourse(@RequestBody Courses newCourse) {
         courses.add(newCourse);
 
