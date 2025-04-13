package com.group4.SpringAssignement;

public class Courses {
    private String CourseName;
    private String[] CourseModules;

    // Constructors
    public Courses() {}

    public Courses(String CourseName, String[] CourseModules) {
        this.CourseName = CourseName;
        this.CourseModules = CourseModules;
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
