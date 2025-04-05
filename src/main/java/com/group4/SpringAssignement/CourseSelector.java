package com.group4.SpringAssignement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Service
public class CourseSelector {


    @Autowired
    Courses courses;

    String[] FoundationCourses = new String[] {"Introduction to computer science", "Data Structure"};

    String[] UndergraduateCourses = new String[] {"Algorithms", "Computer network", "Software Engineering"};

    String[] HonorsCourses = new String[] {"Advanced Algorithms", "Machine Learning", "Distributed systems", "Cybersecurity"};


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
        return courses.getUndergroundCourses();
    }

    @Autowired
    public void setHonorsModules() {
        courses.setHonorsCourses(HonorsCourses);
    }

    public String[] getHonorsModules() {
        return courses.getHonorsCourses();
    }


}
