package com.group4.SpringAssignement;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.Validated;
import org.springframework.web.bind.annotation.Valid;


import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


@RestController
@Service
@Validated
public class CourseSelector {

    List<Courses> courses = new ArrayList<>();

    public CourseSelector() {

        courses.add(new Courses("Foundation Courses", new String[]{"Computer Literacy for Science", "Introduction to Programming Concepts"}));
        courses.add(new Courses("Undergraduate Courses", new String[]{"Data Structure & Algorithms", "Introduction to Computer Networks", "Software Engineering","Elementary Computer Programming","Computer Architecture and Organisation"}));
        courses.add(new Courses("Honors Courses", new String[]{"Advanced Algorithms", "Intelligent Systems", "Distributed and Parallel Computing", "Advanced Java"}));
    }
    
    public List<Courses> getCourses() {
        return courses;
    }

    public ResponseEntity<Courses> getCoursesByName(@Valid @PathVariable String name) {
        Optional<Courses> foundCourse = courses.stream()
                .filter(array -> array.getCourseName().equalsIgnoreCase(name))
                .findFirst();

                if (foundCourses == null) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, 
                "Course type not found");
        }

        return foundCourse.map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    public void createCourse(@Valid @RequestBody Courses newCourse) {
        courses.add(newCourse);

    }

    public void updateCourses(@RequestBody Courses updateCourses) {
        int i = 0;
        for (Courses courses : courses) {
            if (courses.getCourseName().equals(updateCourses.getCourseName())) {
                i = getCourses().indexOf(courses);
            }
        }
        courses.set(i, updateCourses);
    }

    public void deleteCourse(@Valid @PathVariable String name) {
        if (!courses.containsKey(type.toLowerCase())) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, 
                "Course type not found");
        boolean removed = courses.removeIf(array -> array.getCourseName().equalsIgnoreCase(name));
         if (!removed) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, 
                "Module not found in specified course");
        }
        
    }
}
} 
