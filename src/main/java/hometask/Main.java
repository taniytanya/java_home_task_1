package hometask;


import java.util.Arrays;
import java.util.OptionalDouble;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Ivan", "Testov", "Biology", 1, 3.55, 3.2, 2.9, 3.9);
        Student student2 = new Student("Anna", "Testova", "Math", 1, 2.0, 3.5, 4.8, 5.0);
        Student student3 = new Student("Max", "Coins", "Philosophy", 1, 1.0, 4.2, 2.0, 4.3);
        Student student4 = new Student("Teo", "Neo", "English", 1, 4.5, 3.2, 4.0, 4.1);
        Student student5 = new Student("Lina", "Malina", "Philosophy", 2, 4.0, 3.3, 4.0, 4.8);
        Student student6 = new Student("Jane", "Air", "English", 2, 4.0, 4.2, 4.8, 2.5);
        Student student7 = new Student("Greg", "House", "Math", 2, 4.8, 3.2, 4.0, 4.6);
        Student student8 = new Student("Tom", "Cat", "Biology", 3, 1.1, 3.5, 2.5, 2);
        Student student9 = new Student("Jerry", "Mouse", "Math", 3, 4.0, 3.7, 4.7, 4.0);
        Student student10 = new Student("Nikolas", "Claus", "Philosophy", 4, 4.1, 4.8, 4.0, 3.8);
        Student student11 = new Student("Sara", "Connor", "Philosophy", 4, 5.0, 3.2, 4.5, 4.4);
        Student student12 = new Student("Elena", "Wise", "Math", 2, 1.8, 4.1, 2.5, 3.78);
        Student student13 = new Student("Anton", "Trustov", "Biology", 5, 4.0, 3.2, 4.8, 4.9);
        Student student14 = new Student("Dan", "Kruger", "Biology", 4, 2.7, 4.2, 4.8, 4.9);

        Student[] students = new Student[]{student1, student2, student3, student4, student5, student6, student7, student8, student9, student10, student11, student12, student13, student14};
        double[] allStudentsGradeAvg = new double[students.length];

        for (Student i : students) {
            i.gradeAvg = i.calculateGradePointAverage();
            i.checkYearAndGrades(i.gradeAvg);
        }

        for (int i = 0; i < students.length; ++i) {
            allStudentsGradeAvg[i] = students[i].gradeAvg;
        }
        OptionalDouble maxAllGrade = Arrays.stream(allStudentsGradeAvg).max();

        for (Student i : students) {
            if (Math.abs(i.gradeAvg - maxAllGrade.getAsDouble()) < 0.000000001) {
                System.out.printf("%s %s is the best student! Her GPA is max in school: %.3f", i.name, i.surname, i.gradeAvg);
            }
        }
    }

}
