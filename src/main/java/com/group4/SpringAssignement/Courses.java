package com.group4.SpringAssignement;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

public class Courses {
    @NotBlank(message = "Module name is required")
    @Size(min = 3, max = 100, message = "Module name must be between 3 and 100 characters")
    private String CourseName;
    @NotBlank(message = "Course type is required")
    @Pattern(regexp = "foundation|undergraduate|honors",
             message = "Course type must be foundation, undergraduate, or honors")
    private String[] CourseModules;

    // Constructors
    public Courses() {}

    public Courses(String CourseName, String[] CourseModules) {
        this.CourseName = CourseName;
        this.CourseModules = CourseModules
        ;
    }

    // Getters and setters
    public String getCourseName() {
        return CourseName;
    }

    public void setCourseName(String CourseName) {
        this.CourseName = CourseName;
    }

    public String[] getCourseModules() {
        return CourseModules;
    }

    public void setCourseModules(String[] CourseModules) {
        this.CourseModules = CourseModules;
    }
}

   
