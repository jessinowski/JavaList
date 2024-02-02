package com.github;

import java.util.ArrayList;
import java.util.List;

public class School {
    // Step 3:
    // Create a class "School" to which students can be added through a method ('addStudent').
    private List<Student> studentList = new ArrayList<>();

    public void addStudent(Student student) {
        studentList.add(student);
    }

    // Step 5:
    // Add a method to find a student by their ID.
    // The found student should be returned.
    public Student findStudentByID(int id) {
        for (Student students : studentList) {
            if (students.getStudentID() == id) {
                return students;
            }
        }
        return null;
    }

    // Step 6:
    // Create a method to remove a student from the school.
    public void removeStudent(Student student){
        studentList.remove(student);
    }

    // Bonus Course:
    // Implement a method within the School class to retrieve all courses of a specific student
    // (based on a student ID).
    public List<Course> retrieveCourses(int studentID){
        return findStudentByID(studentID).getCourseList();
    }

    // Step 4:
    // Implement a method to print all students of the school (as text, to the console).
    @Override
    public String toString() {
        return "School{" +
                "students=" + studentList +
                '}';
    }
}
