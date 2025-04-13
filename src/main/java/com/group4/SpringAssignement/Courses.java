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

    public String[] getFoundationCourses() {
        return FoundationCourses;
    }

    public void setFoundationCourses(String[] foundationCourses) {
        this.FoundationCourses = foundationCourses;
    }

    public String[] getUndergroundCourses() {
        return UndergroundCourses;
    }

    public void setUndergraduateCourses(String[] undergroundCourses) {
        this.UndergroundCourses = undergroundCourses;
    }

    public String[] getHonorsCourses() {
        return HonorsCourses;
    }

    public void setHonorsCourses(String[] honorsCourses) {
        this.HonorsCourses = honorsCourses;
    }

    @Override
    public String toString() {
        return "Courses{" +
                "FoundationCourses=" + Arrays.toString(FoundationCourses) +
                ", UndergroundCourses=" + Arrays.toString(UndergroundCourses) +
                ", HonorsCourses=" + Arrays.toString(HonorsCourses) +
                '}';
    }
}
