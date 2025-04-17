package com.group4.SpringAssignement;

import com.group4.SpringAssignement.CourseSelector;
import com.group4.SpringAssignement.Courses;
import jakarta.validation.Valid;
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
    public ResponseEntity<Courses> getCourseByName(@Valid @PathVariable String name) {
        return courseSelector.getCoursesByName(name);
    }

    // CREATE - Add new Courses
    @PostMapping
    public void  createArray(@Valid @RequestBody Courses newCourse) {
        courseSelector.createCourse(newCourse);
    }


// DELETE - Remove a course
    @DeleteMapping("/{name}")
    public void deleteArray(@Valid @PathVariable String name) {
        courseSelector.deleteCourse(name);
    }

//UPDATE - Update a course
    @PutMapping("/{name}")
    public void updateCourses(@RequestBody Courses newModule) {
        courseSelector.updateCourses(newModule);
    }
}
