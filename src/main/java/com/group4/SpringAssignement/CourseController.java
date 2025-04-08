package com.group4.SpringAssignement1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/courses")
public class CourseController {

    @Autowired
   CourseSelector courseSelector;

     //READ ONE - Get course by name
    @GetMapping
     public List<Courses> getAllCourses() {
        return courseSelector.getCourses();
    }

   // READ ONE - Get course by name
    @GetMapping("/{name}")
    public ResponseEntity<Courses> getCourseByName(@PathVariable String name) {
        return courseSelector.getCoursesByName(name);
    }

   // READ ONE - Get course by name
    @GetMapping("/{name}")
    public ResponseEntity<Courses> getCourseByName(@PathVariable String name) {
        return courseSelector.getCoursesByName(name);
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
