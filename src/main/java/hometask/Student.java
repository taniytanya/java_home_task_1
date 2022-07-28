package hometask;


import java.util.Arrays;
import java.util.OptionalDouble;

public class Student {
    String name;
    String surname;
    String faculty;
    int yearOfStudy;
    double gradeMath;
    double gradeEnglish;
    double gradePhilosophy;
    double gradeBiology;
    double gradeAvg;

    public Student(String name, String surname, String faculty, int yearOfStudy, double gradeMath, double gradeEnglish, double gradePhilosophy, double gradeBiology) {
        this.name = name;
        this.surname = surname;
        this.faculty = faculty;
        this.yearOfStudy = yearOfStudy;
        this.gradeMath = gradeMath;
        this.gradeEnglish = gradeEnglish;
        this.gradePhilosophy = gradePhilosophy;
        this.gradeBiology = gradeBiology;
    }


    public double calculateGradePointAverage() {
        double[] grades = new double[]{gradeBiology, gradeEnglish, gradeMath, gradePhilosophy};
        double sum = 0;
        for (double i : grades) {
            sum += i;
        }
        double gradeAvg = sum / grades.length;
        return gradeAvg;
    }

    public double calculateMaxGrade() {
        double[] grades = new double[]{gradeBiology, gradeEnglish, gradeMath, gradePhilosophy};
        OptionalDouble maxGrade = Arrays.stream(grades).max();
        return maxGrade.getAsDouble();
    }


    void checkYearAndGrades(double gradeAvg) {
        if (yearOfStudy == 1 || yearOfStudy == 2) {
            if (gradeAvg > 3.00) {
                System.out.printf("Dear %s %s! You have passing score! You can go to %d class! Your GPA is %.3f. Your max grade is %.1f.\n", name, surname, ++yearOfStudy, gradeAvg, calculateMaxGrade());
            } else {
                System.out.printf("Dear %s %s! You need exams again! GPA for next level is 3.00, but your GPA is only %.3f.\n", name, surname, gradeAvg);
            }
        } else if (yearOfStudy == 3) {
            if (gradeAvg > 3.55) {
                System.out.printf("Dear %s %s! You have passing score! You can go to %d class! Your GPA is %.3f. Your max grade is %.1f.\n", name, surname, ++yearOfStudy, gradeAvg, calculateMaxGrade());
            } else {
                System.out.printf("Dear %s %s! You need exams again! GPA for next level is 3.55, but your GPA is only %.3f.\n", name, surname, gradeAvg);
            }
        } else if (yearOfStudy == 4) {
            if (gradeAvg > 4.20) {
                System.out.printf("Dear %s %s! You have passing score! You are graduate! Your GPA is %.3f. Your max grade is %.1f.\n", name, surname, gradeAvg, calculateMaxGrade());
            } else {
                System.out.printf("Dear %s %s! You need exams again! GPA for next level is 4.20 but your GPA is only %.3f.\n", name, surname, gradeAvg);
            }
        } else {
            System.out.println("incorrect year of study");
        }
    }




}
