package com.github;

public class Main {
    public static void main(String[] args) {
        // Step 2:
        // Create a Java List for elements of type "Student" and add multiple students.
//      List<Student> students = new ArrayList<>();
        Student jessica = new Student("Jessica", "Zarnowski", 25678);
        Student hanne = new Student("Hanne", "Lore", 25689);
        Student bernd = new Student("Bernd", "Brot", 25624);
//      students.add(jessica);
//      students.add(hanne);
//      students.add(bernd);

        // Step 3:
        // Create a class "School" to which students can be added through a method ('addStudent').
        School school = new School();
        school.addStudent(jessica);
        school.addStudent(hanne);
        school.addStudent(bernd);

        // Step 4:
        // Implement a method to print all students of the school (as text, to the console).
        System.out.println(school);

        // Step 5:
        // Add a method to find a student by their ID.
        // The found student should be returned.
        System.out.println();
        System.out.println(school.findStudentByID(25678));
        System.out.println(school.findStudentByID(25677));

        // Step 6:
        // Create a method to remove a student from the school.
        System.out.println();
        school.removeStudent(hanne);
        System.out.println(school);

        //Bonus Course
        System.out.println();
        Course math = new Course("Mathe","Mueller", 3);
        jessica.addCourseToStudent(math);
        System.out.println(jessica);
        System.out.println();
        System.out.println(school.retrieveCourses(25678));
        System.out.println(jessica.getCourseList());
    }
}