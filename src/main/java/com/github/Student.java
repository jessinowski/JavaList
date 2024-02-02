package com.github;

import java.util.ArrayList;
import java.util.List;

public class Student {
    //Step 1: Create a Java class "Student" that should have the following properties: First name, Last name, Student ID.
    private String firstName;
    private String lastName;
    private int studentID;
    //Bonus Course: Add a method to the Student class to add courses to the student (courses in which the student is participating).
    private List<Course> courseList = new ArrayList<>();

    public Student(String firstName, String lastName, int studentID) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.studentID = studentID;
    }

    //Bonus Course: Add a method to the Student class to add courses to the student (courses in which the student is participating).
    public void addCourseToStudent(Course course){
        courseList.add(course);
    }

    //Getter und Setter
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public int getStudentID() {
        return studentID;
    }
    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }
    public List<Course> getCourseList() {
        return courseList;
    }
    public void setCourseList(List<Course> courseList) {
        this.courseList = courseList;
    }
    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", studentID=" + studentID +
                ", courseList=" + courseList +
                '}';
    }
}
