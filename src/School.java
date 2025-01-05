
import java.util.List;

public class School {
    public abstract class Staff {
        private String name;
        private int age;

        public Staff(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }

        public String toString() {
            return "Name: " + name + ", Age: " + age;
        }
    }


//   Teacher Class
    public class Teacher extends Staff {

        public Teacher(String name, int age) {
            super(name, age);

        }


        public void teachCourse(String courseName) {
            System.out.println(getName() + " is teaching the course: " + courseName);
        }
    }

//Student Class
    public class Student extends Staff{
        private String Department;

        public Student(String name, int age, String Department) {
            super(name, age);
            this.Department = Department;
        }

        public void takeCourse(String courseName) {
            System.out.println(getName() + " is taking the course: " + courseName);
        }
    }

//    Applicant Class
    public class Applicant extends Staff {
        public Applicant(String name, int age) {
            super(name, age);
        }
    }

//    Principal Class
    public class Principal extends Staff{

        public Principal(String name, int age) {
            super(name, age);

        }


        public void expelStudent(Student student) {
            System.out.println("Principal " + getName() + " has expelled the student: " + student.getName());
        }

        public void admitApplicant(Applicant applicant, List<Student> studentList) {
            if (applicant.getAge() >= 18) {
                Student newStudent = new Student(applicant.getName(), applicant.getAge(), "Science" + (studentList.size() + 1));
                studentList.add(newStudent);
                System.out.println("Applicant " + applicant.getName() + " has been admitted as a student.");
            } else {
                System.out.println("Applicant " + applicant.getName() + " is underage and cannot be admitted.");
            }
        }
    }
}
