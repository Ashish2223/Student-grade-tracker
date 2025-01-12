package StudentGradeTracker;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static Scanner scan = new Scanner(System.in);
    static ArrayList<Student> students = new ArrayList<>();

    public static void StudentGradeTracker(){
        int choice = -1;
        do {
            System.out.println("1. Add Student");
            System.out.println("2. Search Student");
            System.out.println("3. Calculate GPA");
            System.out.println("4. Generate Transcript");
            System.out.println("5. Remove Student");
            System.out.print("Select choice: ");
            choice = scan.nextInt();
            switch (choice) {
                case 1:
                    addStudent();
                    break;
                case 2:
                    searchStudent();
                    break;
                case 3:
                    calculateGPA();
                    break;
                case 4:
                    generateTranscript();
                    break;
                case 5:
                    removeStudent();
                    break;
                default:
                    break;
            }
        } while (choice != 0);
    }
  private static void removeStudent() {
        if (students.isEmpty()){
            System.out.println("No student added!!");
        } else {
            System.out.print("Enter student id to remove student: ");
            int studentId = scan.nextInt();
            for (Student student : students) {
                if (student.getStudentId() == studentId){
                    students.remove(student);
                    System.out.println("Successfully remove student");
                    break;
                } else {
                    System.out.println("Student not found!!");
                }
            }
        }
    }
private static void generateTranscript() {
        if (students.isEmpty()) {
            System.out.println("No student added!!");
        } else {
            System.out.print("Enter student id to generate transcript: ");
            int studentId = scan.nextInt();
            for (Student student : students) {
                if (student.getStudentId() == studentId) {
                    System.out.println(student.generateTranscript().toString());
                    break;
                }
            }
        }
    }
private static void calculateGPA() {
        if (students.isEmpty()){
            System.out.println("No student added!!");
        } else {
            System.out.print("Enter student id to calculate GPa: ");
            int studentId = scan.nextInt();
            for (Student student : students) {
                if (student.getStudentId() == studentId) {
                    System.out.print("Enter how many subject you want calculate the GPA: ");
                    int num = scan.nextInt();
                    System.out.print("Enter college course: ");
                    String Ccourse = scan.next();
                    for (int i = 0; i < num; i++) {
                        System.out.print("Enter subject "+(i+1)+": ");
                        String nameCourse = scan.next();
                        System.out.print("Enter credit Hours: ");
                        int creditHours = scan.nextInt();
                        System.out.print("Enter Score: ");
                        double score = scan.nextDouble();
                        System.out.print("Enter Weight: ");
                        double weight = scan.nextDouble();
                        Course course = new Course(Ccourse, nameCourse, creditHours);
                        course.AddGrade(new Grade(score, weight));
                        student.AddCourse(course);
                        System.out.println("Successfully Calculated GPA \nCheck it in the generate transcript!!");
                    }
                } else {
                    System.out.println("Student not found!!");
                }
            }
        }
    }
private static void searchStudent() {
    if (students.isEmpty()){
        System.out.println("No student added!!");
    } else {
        System.out.print("Enter student id to search: ");
        int studentId = scan.nextInt();
        for (Student student : students) {
            if (student.getStudentId() == studentId){
                System.out.println(student.generateTranscript().toString());
                break;
            } else {
                System.out.println("Student not found!!");
            }
        }
    }
}
private static void addStudent() {
        System.out.print("Enter how many student you want to add: ");
        int num = scan.nextInt();
        for (int i = 0; i < num; i++) {
            System.out.print("Enter student name: ");
            String name = scan.next();
            System.out.print("Enter student ID: ");
            int studentId = scan.nextInt();
            students.add(new Student(name, studentId));
            System.out.println("Student Successfully added!!");
    }
}
public static void main(String[] args) {
    StudentGradeTracker();
  }
}
