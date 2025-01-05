//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        School school = new School();

        // Create a list to hold students
        List<School.Student> studentList = new ArrayList<>();

        // Create a Principal
        School.Principal principal = school.new Principal("Mr Babatunde", 50);

        // Create a Teacher
        School.Teacher teacher = school.new Teacher("Mrs Adenuga", 40);

        // Create an Applicant
        School.Applicant applicant1 = school.new Applicant("Tolu", 17);

        // Principal attempts to admit the Applicant
        principal.admitApplicant(applicant1, studentList);

        // Another Applicant who meets the age requirement
        School.Applicant applicant2 = school.new Applicant("Moses", 19);
        principal.admitApplicant(applicant2, studentList);

        // Create a Student (added manually)
        School.Student student = school.new Student("Sade", 20, "Science");
        studentList.add(student);

        // Principal expels a student
        principal.expelStudent(student);
        studentList.remove(student);

        // Teacher teaches a course
        teacher.teachCourse("Mathematics");

        // A Student takes a course

        if (studentList.isEmpty()) {
        } else {
            School.Student enrolledStudent = studentList.get(0);
            enrolledStudent.takeCourse("Mathematics at Science Department");
        }

        // Display the list of students
        System.out.println("Current Students:");
        for (School.Student s : studentList) {
            System.out.println(s);
        }
    }
}