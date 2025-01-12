package StudentGradeTracker;

import java.util.ArrayList;
import java.util.List;

public class Course{
    private String name;
    static String Ccourse;
    private int creditHours;
    private List<Grade> grades;

    public Course(String Ccourse, String name, int creditHours) {
        this.name = name;
        this.creditHours = creditHours;
        Course.Ccourse = Ccourse;
        this.grades = new ArrayList<>();
    }
    public String getCourse() {
        return Ccourse;
    }
    public int getCreditHours() {
        return creditHours;
    }
    public String getName() {
        return name;
    }
    public List<Grade> getGrades() {
        return grades;
    }
    public void AddGrade(Grade grade){
        grades.add(grade);
    }
    public void RemoveGrade(Grade grade){
        grades.remove(grade);
    }
    public double calculateGradePoints(){
        double totalWeight = 0.0;
        double totalScore = 0.0;
        for (Grade grade : grades) {
            totalWeight += grade.getWeight();
            totalScore += grade.getScore() * grade.getWeight();
        }
        return totalScore / totalWeight;
    }
    public String getLetterGrade() {
        double grade = calculateGradePoints();
        if (grade >= 90 && grade <= 100) {
          return "Outstanding";
      } else if (grade >= 80 && grade <= 89) {
          return "Excellent";
      } else if (grade >= 70 && grade <= 79) {
          return "Very Good";
      } else if (grade >= 60 && grade <= 69) {
          return "Good";
      } else if (grade >= 50 && grade <= 59) {
          return "Sactisfactory";
      } else if (grade >= 40 && grade <= 49) {
        return "Acceptable";
      } else if (grade >= 30 && grade <= 39) {
        return "Partially Aceeptable";
      } else if (grade >= 20 && grade <= 29) {
        return "Insufficient";
      } else if (grade >= 0 && grade <= 19) {
        return "Failed";
      }else {
        return " ";
      }
      }
 }
