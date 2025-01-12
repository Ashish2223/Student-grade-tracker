package StudentGradeTracker;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private String name;
    private int studentId;
    private List<Course> courses;
    public Student(String name, int studentId) {
        this.name = name;
        this.studentId = studentId;
        this.courses = new ArrayList<>();
    }
    public String getName() {
        return name;
    }
    public int getStudentId() {
        return studentId;
    }
    public List<Course> getCourses() {
        return courses;
    }
    public void AddCourse(Course course){
        courses.add(course);
    }
    public void RemoveCourse(Course course){
        courses.remove(course);
    }
    public double CalculateGPA(){
        double totalCredits = 0.0;
        double totalQualityPoints = 0.0;
        for (Course course : courses) {
            double creditHours = course.getCreditHours();
            double gradePoints = course.calculateGradePoints();
            totalCredits += creditHours;
            totalQualityPoints += creditHours * gradePoints;
        }
        return totalQualityPoints / totalCredits;
    }
    public String getLetterGrade2() {
        if (CalculateGPA() >= 90 && CalculateGPA() <= 100) {
          return "Outstanding";
      } else if (CalculateGPA() >= 80 && CalculateGPA() <= 89) {
          return "Excellent";
      } else if (CalculateGPA() >= 70 && CalculateGPA() <= 79) {
          return "Very Good";
      } else if (CalculateGPA() >= 60 && CalculateGPA() <= 69) {
          return "Good";
      } else if (CalculateGPA() >= 50 && CalculateGPA() <= 59) {
          return "Sactisfactory";
      } else if (CalculateGPA() >= 40 && CalculateGPA() <= 49) {
        return "Acceptable";
      } else if (CalculateGPA() >= 30 && CalculateGPA() <= 39) {
        return "Partially Aceeptable";
      } else if (CalculateGPA() >= 20 && CalculateGPA() <= 29) {
        return "Insufficient";
      } else if (CalculateGPA() >= 0 && CalculateGPA() <= 19) {
        return "Failed";
      }else {
        return " ";
      }
      }

    public String generateTranscript() {
        StringBuilder transcript = new StringBuilder();
        System.out.println();
        transcript.append(String.format("Transcript for %s (ID: %d)\n\n", name, studentId));
        System.out.println("\nCollege Course: "+Course.Ccourse);
        for (Course course : courses) {
          transcript.append(String.format("%s: %.2f (%s)\n", course.getName(), course.calculateGradePoints(), course.getLetterGrade()));
        }
        transcript.append(String.format("\nGPA: %.2f (%s)", CalculateGPA(), getLetterGrade2()));
        System.out.println();
        return transcript.toString();
      }
    
}
