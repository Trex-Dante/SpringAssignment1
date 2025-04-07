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
        courses.add(new Courses("Foundation Courses", new String[]{"Introduction to computer science", "Data Structure"}));
        courses.add(new Courses("Undergraduate Courses", new String[]{"Algorithms", "Computer network", "Software Engineering"}));
        courses.add(new Courses("Honors Courses", new String[]{"Advanced Algorithms", "Machine Learning", "Distributed systems", "Cybersecurity"}));
    }
    
    @Autowired
    public void setFoundationModules() {
        courses.setFoundationCourses(FoundationCourses);

    }

    public String[] getFoundationModules() {
        return courses.getFoundationCourses();
    }

    @Autowired
    public void setUndergraduateModules() {
        courses.setUndergraduateCourses(UndergraduateCourses);
    }

    public String[] getUndergraduateModules() {
        return courses.getUndergraduateCourses();
    }

    @Autowired
    public void setHonorsModules() {
        courses.setHonorsCourses(HonorsCourses);
    }

    public String[] getHonorsModules() {
        return courses.getHonorsCourses();
    }


}
