package com.group4.SpringAssignement;


import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.Arrays;

@Component
@Service
public class Courses {

    private String[] FoundationCourses;
    private String[] UndergroundCourses;
    private String[] HonorsCourses;

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
