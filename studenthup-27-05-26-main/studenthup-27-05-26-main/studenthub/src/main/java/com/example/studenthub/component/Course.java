package com.example.studenthub.component;

import org.springframework.stereotype.Component;

@Component
public class Course {

    private int courseid;
    private String coursename;

    public Course() {
    }

    public Course(int id, String course) {
        this.courseid = id;
        this.coursename = course;
    }

    public int getId() {
        return courseid;
    }

    public void setId(int courseid) {
        this.courseid = courseid;
    }


    public String getCourse() {
        return coursename;
    }

    public void setCourse(String coursename) {
        this.coursename = coursename;
    }
}